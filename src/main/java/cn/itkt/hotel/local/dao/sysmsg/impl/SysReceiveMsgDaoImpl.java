package cn.itkt.hotel.local.dao.sysmsg.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.itkt.core.dao.hibernate.BaseDao;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.dao.sysmsg.SysReceiveMsgDao;
import cn.itkt.hotel.local.pojo.sysmsg.SysReceiveMsg;

/**
 * 
 * @author chenqiushi
 *	接受第三方消息dao
 */
@Repository(value="sysReceiveMsgDao")
public class SysReceiveMsgDaoImpl extends BaseDao<String> implements SysReceiveMsgDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<SysReceiveMsg> listReceiveMsg(List<Condition> conditions, Pagination page) {
		if(conditions == null){
			conditions = new ArrayList<Condition>();
		}
		
		if(page == null){
			page = new Pagination();
		}
		
		StringBuilder hql = new StringBuilder();
		hql.append(" from SysReceiveMsg obj");
		hql.append(" where 1=1");
		for(Condition condition : conditions){
			if("codes".equals(condition.getProperty())){
				hql.append(" and obj.code in (:codes) ");
			}else if("type".equals(condition.getProperty())){
				hql.append(" and obj.type = :type");
			}else if("status".equals(condition.getProperty())){
				hql.append(" and obj.status = :status");
			}else if("exeNum".equals(condition.getProperty())){
				hql.append(" and obj.exeNum > :exeNum");
			}
		}
		this.appendPagingCondition(hql, page);
		Query query = this.getCurrentSession().createQuery(hql.toString());
		for(Condition condition : conditions){
			if("codes".equals(condition.getProperty())){
				query.setParameterList("codes", (List<?>) condition.getValue());
			}else if("type".equals(condition.getProperty())){
				query.setParameter("type", condition.getValue());
			}else if("status".equals(condition.getProperty())){
				query.setParameter("status", condition.getValue());
			}else if("exeNum".equals(condition.getProperty())){
				query.setParameter("exeNum", condition.getValue());
			}
		}
		this.appendPagingValue(query, page);
		return query.list();
	}
	
	
}
