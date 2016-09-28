package cn.itkt.core.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * 数据库访问操作对象
 * @author Wang
 * @param <T> 实体类
 * @param <PK> 主键类型
 */
public interface IBaseDaoII<PK extends Serializable> {

	/**
	 * 新建一个查询对象
	 * @return
	 */
	IQuery createQuery();

	/**
	 * 计算查询总行数
	 * @param query 查询对象
	 * @return
	 */
	int count(IQuery query);

	/**
	 * 获取数据
	 * @param id 主键
	 * @return
	 */
	<T> T get(Class<T> entityClass, PK id);

	/**
	 * 加载数据
	 * @param id 主键
	 * @return
	 */
	<T> T load(Class<T> entityClass, PK id);

	/**
	 * 查询全部数据
	 * @return
	 */
	<T> List<T> findAll(Class<T> entityClass);

	/**
	 * 查询数据
	 * @param query 查询对象
	 * @return
	 */
	<T> List<T> find(IQuery query);

	/**
	 * 保存数据
	 * @param entity 实体类
	 * @return
	 */
	<T> PK save(T entity);

	/**
	 * 更新数据
	 * @param entity 实体类
	 */
	<T> void update(T entity);

	/**
	 * 批量更新
	 * @param query 查询对象
	 * @return
	 */
	int updateAll(IQuery query);

	/**
	 * 保存或更新数据
	 * @param entity 实体类
	 */
	<T> void saveOrUpdate(T entity);

	/**
	 * 保存或更新多个数据
	 * @param entities 实体类集合
	 */
	<T> void saveOrUpdateAll(Collection<T> entities);

	/**
	 * 删除数据
	 * @param entity 实体类
	 */
	<T> void delete(T entity);

	/**
	 * 依据主键删除数据
	 * @param id 主键
	 */
	<T> void delete(Class<T> entityClass, PK id);

	/**
	 * 删除多个数据
	 * @param entities 实体类集合
	 */
	<T> void deleteAll(Collection<T> entities);

	/**
	 * 批量删除
	 * @param query 查询对象
	 * @return
	 */
	int deleteAll(IQuery query);
}
