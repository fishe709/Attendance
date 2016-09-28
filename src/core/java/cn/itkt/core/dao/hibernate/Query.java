package cn.itkt.core.dao.hibernate;

import cn.itkt.core.dao.IQuery;

public class Query implements IQuery {

	/** 实体类列表 */
	private Class<?>[] entityClasses;

	/** 对象查询字符串 */
	private String queryStr;

	/** sql字符串 */
	private String sql;

	/** 参数列表 */
	private Object[] params;

	/** 分页起始位 */
	private int firstResult;

	/** 每页最大值 */
	private int maxResult;

	public Class<?>[] getEntityClasses() {
		return entityClasses;
	}

	@Override
	public String getQueryString() {
		return queryStr;
	}

	@Override
	public String getSQLString() {
		return sql;
	}

	@Override
	public Object[] getParamValues() {
		return params;
	}

	@Override
	public int getFirstResult() {
		return firstResult;
	}

	@Override
	public int getMaxResults() {
		return maxResult;
	}

	@Override
	public void setEntityClasses(Class<?>[] entityClasses) {
		this.entityClasses = entityClasses;
	}

	@Override
	public void setQueryString(String queryStr) {
		this.queryStr = queryStr;
	}

	@Override
	public void setSQLString(String sql) {
		this.sql = sql;
	}

	@Override
	public void setParamValues(Object[] values) {
		this.params = values;
	}

	@Override
	public void setFirstResult(int value) {
		this.firstResult = value;
	}

	@Override
	public void setMaxResults(int value) {
		this.maxResult = value;
	}
}
