package cn.itkt.hotel.local.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import cn.itkt.core.dao.hibernate.BaseDao;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.dao.EquipmentDao;
import cn.itkt.hotel.local.pojo.EquipmentInfo;
import cn.itkt.hotel.util.StringUtil;

@Repository
public class EquipmentDaoImpl extends BaseDao<Integer> implements EquipmentDao {
	@Override
	public void addEquipment(EquipmentInfo entity) {
		this.save(entity);
	}

	@Override
	public void updateEquipmentInfo(EquipmentInfo entity) {
		this.update(entity);
	}

	@Override
	public void deleteEquipmentInfo(EquipmentInfo entity) {
		this.delete(entity);
	}

	@Override
	public EquipmentInfo queryEquipmentByTid(Integer tid) {
		StringBuilder hql = new StringBuilder();
		hql.append(" from EquipmentInfo obj");
		hql.append(" where obj.tid=:tid ");
		Query query = this.getCurrentSession().createQuery(hql.toString())
				.setInteger("tid", tid);
		return (EquipmentInfo) query.uniqueResult();
	}

	@Override
	public long queryEquipmentsCount() {
		StringBuilder hql = new StringBuilder();
		hql.append("select count(obj) from EquipmentInfo obj");
		Query query = this.getCurrentSession().createQuery(hql.toString());
		return (Long) query.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EquipmentInfo> queryEquipmentsList(Pagination page) {
		if (page == null) {
			page = new Pagination();
		}
		StringBuilder hql = new StringBuilder();
		hql.append(" from EquipmentInfo obj ");
		this.appendPagingCondition(hql, page);
		Query query = this.getCurrentSession().createQuery(hql.toString());
		this.appendPagingValue(query, page);
		return query.list();
	}
}
