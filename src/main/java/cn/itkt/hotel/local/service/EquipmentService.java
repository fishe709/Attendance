package cn.itkt.hotel.local.service;

import java.util.List;

import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.pojo.EquipmentInfo;

public interface EquipmentService {
	public void addEquipment(EquipmentInfo entity);

	public EquipmentInfo queryEquipmentByTid(Integer Tid);

	public void updateEquipmentInfo(EquipmentInfo entity);

	public void deleteEquipmentInfo(EquipmentInfo entity);

	public long queryEquipmentsCount();

	public List<EquipmentInfo> queryEquipmentsList(Pagination page);
}