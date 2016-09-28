package cn.itkt.core.dao.hibernate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.itkt.core.dao.IBaseDao;
import cn.itkt.core.dao.IQuery;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.core.dao.persistence.TreeCondition;
import cn.itkt.core.util.BeanUtil;
import cn.itkt.hotel.local.pojo.MbDispatchInfo;
import cn.itkt.hotel.local.pojo.sysmsg.SysDispatchMsg;
import cn.itkt.hotel.local.pojo.sysmsg.SysReceiveMsg;

@Repository
public class BaseDao<PK extends Serializable> implements IBaseDao<PK> {

	@Resource
	protected SessionFactory sessionFactory1;

	@Override
	public IQuery createQuery() {
		// 日后拓展
		return new cn.itkt.core.dao.hibernate.Query();
	}

	@Override
	public int count(IQuery query) {
		List<?> list = this.find(query);
		if (!BeanUtil.isNull(list)) {
			return list.size();
		}
		return 0;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> entityClass, PK id) {
		return (T) sessionFactory1.getCurrentSession().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T load(Class<T> entityClass, PK id) {
		return (T) sessionFactory1.getCurrentSession().load(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> findAll(Class<T> entityClass) {
		return sessionFactory1.getCurrentSession().createQuery("from " + entityClass.getName()).list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> find(IQuery query) {
		String queryString = query.getQueryString();
		if (!BeanUtil.isNull(queryString)) {
//			sessionFactory.getCurrentSession() ;
			Query hqlQuery = sessionFactory1.getCurrentSession().createQuery(queryString);
			prepareHqlQuery(hqlQuery, query);
			return hqlQuery.list();
		}

		String sql = query.getSQLString();
		if (!BeanUtil.isNull(sql)) {
			SQLQuery sqlQuery = sessionFactory1.getCurrentSession().createSQLQuery(sql);
			prepareSqlQuery(sqlQuery, query);
			return (List<T>) sqlQuery.list();
		} else {
			////////////// 需要抛出异常
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> PK save(T entity) {
		return (PK) sessionFactory1.getCurrentSession().save(entity);
	}

	@Override
	public <T> void update(T entity) {
		sessionFactory1.getCurrentSession().update(entity);
	}

	@Override
	public int updateAll(IQuery query) {
		int count = 0;
		String queryString = query.getQueryString();
		if (!BeanUtil.isNull(queryString)) {
			Query hqlQuery = sessionFactory1.getCurrentSession().createQuery(queryString);
			prepareHqlQuery(hqlQuery, query);
			count = hqlQuery.executeUpdate();
		}

		String sql = query.getSQLString();
		if (!BeanUtil.isNull(sql)) {
			SQLQuery sqlQuery = sessionFactory1.getCurrentSession().createSQLQuery(sql);
			prepareSqlQuery(sqlQuery, query);
			count = sqlQuery.executeUpdate();
		}
		return count;
	}

	@Override
	public <T> void saveOrUpdate(T entity) {
		sessionFactory1.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public <T> void saveOrUpdateAll(Collection<T> entities) {
		for (T entity : entities) {
			sessionFactory1.getCurrentSession().saveOrUpdate(entity);
		}
	}

	@Override
	public <T> void delete(T entity) {
		sessionFactory1.getCurrentSession().delete(entity);
	}

	@Override
	public <T> void delete(Class<T> entityClass, PK id) {
		T t = this.get(entityClass, id);
		sessionFactory1.getCurrentSession().delete(t);
	}

	@Override
	public <T> void deleteAll(Collection<T> entities) {
		for (T entity : entities) {
			sessionFactory1.getCurrentSession().delete(entity);
		}
	}

	@Override
	public int deleteAll(IQuery query) {
		return this.updateAll(query);
	}

	private void prepareHqlQuery(Query hqlQuery, IQuery query) {
		Object[] values = query.getParamValues();
		int firstResult = query.getFirstResult();
		int maxResult = query.getMaxResults();

		if (maxResult > 0) {
			hqlQuery.setFirstResult(firstResult);
			hqlQuery.setMaxResults(maxResult);
		}
		if (!BeanUtil.isNull(values)) {
			for (int i = 0; i < values.length; i++) {
				hqlQuery.setParameter(i, values[i]);
			}
		}
	}

	private void prepareSqlQuery(SQLQuery sqlQuery, IQuery query) {
		Class<?>[] entityClasses = query.getEntityClasses();
		Object[] values = query.getParamValues();
		int firstResult = query.getFirstResult();
		int maxResult = query.getMaxResults();

		if (!BeanUtil.isNull(entityClasses)) {
			for (Class<?> entity : entityClasses) {
				sqlQuery.addEntity(entity);
			}
		}
		if (maxResult > 0) {
			sqlQuery.setFirstResult(firstResult);
			sqlQuery.setMaxResults(maxResult);
		}
		if (!BeanUtil.isNull(values)) {
			for (int i = 0; i < values.length; i++) {
				sqlQuery.setParameter(i, values[i]);
			}
		}
	}
	
	protected String generateParamName(Condition condition) {
        String paramName = null;
        if (StringUtils.isBlank(condition.getParamName())) {
            String property = condition.getProperty();
            if (property.contains(".")) {
                paramName = property.substring(property.lastIndexOf(".") + 1, property.length()) + "Property";
            } else {
                paramName = property;
            }
        } else {
            paramName = condition.getParamName();
        }

        return paramName;
    }

    protected void appendConditions(StringBuilder hql, List<Condition> conditions) {
        if (conditions == null || conditions.isEmpty()) {
            return;
        }

        for (Condition condition : conditions) {
            this.appendCondition(hql, condition);
        }
    }
    
    protected void appendCondition(StringBuilder hql, Condition condition) {
    	if("specialField".equals(condition.getSignal())) {
    		hql.append(condition.getValue());
    	} else {
    		if(condition.getIsDefaultAlias()){
    			appendCondition(hql, condition, "obj");
    		}else{
    			appendCondition(hql, condition, condition.getAlias());
    		}
    	}
    }
    
    protected void appendCondition(StringBuilder hql, Condition condition, String objAliasName) {
        if(!"noAnd".equals(condition.getType())) {
            hql.append(" and ");
        }
        if(condition.getSignal().trim().equalsIgnoreCase("patternIn")){
            List<String> patterns  = (List<String>) condition.getValue();
            hql.append(" ( ");
            for(int i = 0; i  < patterns.size(); i++){
                hql.append(objAliasName).append(".").append(condition.getProperty() + " like :" 
                        + generateParamName(condition) + i);
                if(i < patterns.size() - 1){
                    hql.append(" or ");
                }
            }
            hql.append(" ) ");
        } else {
            hql.append(objAliasName).append(".").append(condition.getProperty())
            .append(" ").append(condition.getSignal());
            if (condition.getSignal().trim().equalsIgnoreCase("in")
                    || condition.getSignal().trim().equalsIgnoreCase("not in")) {
                hql.append(" ( :").append(this.generateParamName(condition)).append(" ) ");
            } else if (condition.getSignal().trim().equalsIgnoreCase("is")
                    || condition.getSignal().trim().equalsIgnoreCase("is not")) {
                if (StringUtils.isBlank((String) condition.getValue())) {
                    hql.append(" null ");
                } else if ("null".equalsIgnoreCase(((String) condition.getValue()).trim())) {
                    hql.append(" null ");
                } else if ("empty".equalsIgnoreCase(((String) condition.getValue()).trim())) {
                    hql.append(" empty ");
                }
            } else {
                if(!StringUtils.isBlank(condition.getMethodName()) && 
                        !StringUtils.isBlank(condition.getDateFormat())) {
                    hql.append(" ")
                    .append(condition.getMethodName()).append("(:")
                    .append(this.generateParamName(condition))
                    .append(", '")
                    .append(condition.getDateFormat())
                    .append("')");
                } else {
                    hql.append(" :").append(this.generateParamName(condition)).append(" ");
                }
            }
        }
    }
    
    protected void appendConditionValues(Query query, List<Condition> conditions) {
        if (conditions == null || conditions.isEmpty()) {
            return;
        }
        for (Condition condition : conditions) {
            if (condition.getSignal().trim().equalsIgnoreCase("in")
                    || condition.getSignal().trim().equalsIgnoreCase("not in")) {
                query.setParameterList(BaseDao.this.generateParamName(condition), (List<?>) condition.getValue());
            } else if (condition.getSignal().trim().equalsIgnoreCase("is")
                    || condition.getSignal().trim().equalsIgnoreCase("is not") 
                    || condition.getSignal().trim().equalsIgnoreCase("specialField")) {
                //什么都不需要做;
            } else if (condition.getSignal().trim().equalsIgnoreCase("patternIn")){
                List<String> patterns  = (List<String>) condition.getValue();
                for(int i = 0; i  < patterns.size(); i++){
                    String value = patterns.get(i);
                    query.setParameter(generateParamName(condition) + i, value);
                }
            } else {
                query.setParameter(BaseDao.this.generateParamName(condition), condition.getValue());
            }
        }
    }

    protected void appendPagingCondition(StringBuilder hql, Pagination paging) {
        if (paging == null || !paging.isNeedsSort()) {
            return;
        }
        if (paging.isNeedsSort()) {
            hql.append(" order by ").append(" obj.").append(paging.getSortProperty()).append(" ");
            if (paging.isAsc()) {
                hql.append("asc");
            } else {
                hql.append("desc");
            }
        }
    }
    
    protected void appendPagingCondition(StringBuilder hql, Pagination paging, String entityName) {
        if (paging == null || !paging.isNeedsSort()) {
            return;
        }
        if (paging.isNeedsSort()) {
            hql.append(" order by ").append(entityName).append(".").append(paging.getSortProperty()).append(" ");
            if (paging.isAsc()) {
                hql.append("asc");
            } else {
                hql.append("desc");
            }
        }
    }
    
    protected void appendPagingSortCondition(StringBuilder hql, Pagination paging, String entityName) {
        if (paging == null || !paging.isNeedsSort()) {
            return;
        }
        if (paging.getSortPropertyMap() != null && paging.getSortPropertyMap().size() > 0) {
            StringBuffer sortHql = new StringBuffer();
            sortHql.append(" order by ");
            for(Map.Entry<String, Boolean> entry : paging.getSortPropertyMap().entrySet()) {
                sortHql.append(entityName).append(".").append(entry.getKey()).append(" ");
                if (entry.getValue()) {
                    sortHql.append("asc");
                } else {
                    sortHql.append("desc");
                }
                sortHql.append(",");
            }
            hql.append(sortHql.substring(0, sortHql.length() -1));
        } else {
            if (paging.isNeedsSort()) {
                hql.append(" order by ").append(entityName).append(".").append(paging.getSortProperty()).append(" ");
                if (paging.isAsc()) {
                    hql.append("asc");
                } else {
                    hql.append("desc");
                }
            }
        }
    }
    
    protected void appendPagingSortCondition(StringBuilder hql, Pagination paging) {
        if (paging == null || !paging.isNeedsSort()) {
            return;
        }
        if (paging.getSortPropertyMap() != null && paging.getSortPropertyMap().size() > 0) {
            StringBuffer sortHql = new StringBuffer();
            sortHql.append(" order by ");
            for(Map.Entry<String, Boolean> entry : paging.getSortPropertyMap().entrySet()) {
                sortHql.append(" obj.").append(entry.getKey()).append(" ");
                if (entry.getValue()) {
                    sortHql.append("asc");
                } else {
                    sortHql.append("desc");
                }
                sortHql.append(",");
            }
            hql.append(sortHql.substring(0, sortHql.length() -1));
        } else {
            if (paging.isNeedsSort()) {
                hql.append(" order by ").append(" obj.").append(paging.getSortProperty()).append(" ");
                if (paging.isAsc()) {
                    hql.append("asc");
                } else {
                    hql.append("desc");
                }
            }
        }
    }
    
    protected void appendTree(StringBuilder hql, TreeCondition treeCond) {
        hql.append("connect by prior ")
            .append("obj.").append(treeCond.getLeftProp()).append(" = ").append("obj.").append(treeCond.getRightProp())
            .append(" start with ").append("obj.").append(treeCond.getStartProp()).append(" = ").append(treeCond.getStartValue());
    }

    protected void appendPagingValue(Query query, Pagination paging) {
        if (paging == null || !paging.isNeedsPaginate()) {
            return;
        }
        if (paging.isNeedsPaginate()) {
            query.setFirstResult(paging.getStartPos());
            query.setMaxResults(paging.getAmount());
        }
    }
    
    /**
     * 获取对象表名，需要字典服务的对象实现此方法。<br>
     * @return
     */
    public String getTableName() {
        return null;
    }
    
    /**
     * 辅助方法，用来转换condition
     * 2012-11-20 上午09:25:52 mxl添加此方法
     * @param conditions
     * @return
     */
    protected List<Condition> getConInfos(List<Condition> conditions) {
        if (conditions == null) { 
            conditions = new ArrayList<Condition>();
        } 
        return conditions;
    }
    
    /**
     * 辅助方法，用来拼接其他关联表的condition
     * 2012-11-20 上午09:25:52 mxl添加此方法
     * @param conditions
     * @return
     */
    protected void appendOtherCondition(String tableName, StringBuilder hql, Condition condition) {
        if("specialField".equals(condition.getSignal())) {
            hql.append(condition.getValue());
        }
        else {
            if("noAnd".equals(condition.getType())) {
                hql.append(" ").append(tableName).append(".");
            }
            else {
                hql.append("and ").append(tableName).append(".");
            }
            hql.append(condition.getProperty()).append(" ").append(condition.getSignal());
            if (condition.getSignal().trim().equalsIgnoreCase("in")
                    || condition.getSignal().trim().equalsIgnoreCase("not in")) {
                hql.append(" ( :").append(this.generateParamName(condition)).append(" ) ");
            } else if (condition.getSignal().trim().equalsIgnoreCase("is")
                    || condition.getSignal().trim().equalsIgnoreCase("is not")) {
                if (StringUtils.isBlank((String) condition.getValue())) {
                    hql.append(" null ");
                } else if ("null".equalsIgnoreCase(((String) condition.getValue()).trim())) {
                    hql.append(" null ");
                } else if ("empty".equalsIgnoreCase(((String) condition.getValue()).trim())) {
                    hql.append(" empty ");
                }
            } else {
                if(!StringUtils.isBlank(condition.getMethodName()) && 
                        !StringUtils.isBlank(condition.getDateFormat())) {
                    hql.append(" ")
                       .append(condition.getMethodName()).append("(:")
                       .append(this.generateParamName(condition))
                       .append(", '")
                       .append(condition.getDateFormat())
                       .append("')");
                } else {
                    hql.append(" :").append(this.generateParamName(condition)).append(" ");
                }
            }
        }
    }

    /**
     * 获取当前Session
     */
	@Override
	public Session getCurrentSession() {
		return this.sessionFactory1.getCurrentSession();
	}
}
