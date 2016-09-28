package cn.itkt.hotel.local.dao;

import java.util.List;

import cn.itkt.core.dao.IBaseDao;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.pojo.EquipmentInfo;

public interface EquipmentDao extends IBaseDao<Integer> {
	public void addEquipment(EquipmentInfo entity);

	public EquipmentInfo queryEquipmentByTid(Integer Tid);

	public void updateEquipmentInfo(EquipmentInfo entity);

	public void deleteEquipmentInfo(EquipmentInfo entity);

	public long queryEquipmentsCount();
	
	public List<EquipmentInfo> queryEquipmentsList(Pagination page);
}
