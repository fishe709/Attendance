package cn.itkt.hotel.local.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.dao.EquipmentDao;
import cn.itkt.hotel.local.pojo.EquipmentInfo;
import cn.itkt.hotel.local.service.EquipmentService;

@Service
public class EquipmentServiceImpl implements EquipmentService {
	@Resource
	private EquipmentDao equipmentDao;

	@Override
	public void addEquipment(EquipmentInfo entity) {
		this.equipmentDao.save(entity);
	}

	@Override
	public void updateEquipmentInfo(EquipmentInfo entity) {
		this.equipmentDao.update(entity);
	}

	@Override
	public void deleteEquipmentInfo(EquipmentInfo entity) {
		this.equipmentDao.delete(entity);
	}

	@Override
	public EquipmentInfo queryEquipmentByTid(Integer Tid) {
		return this.equipmentDao.queryEquipmentByTid(Tid);
	};
	
	@Override
	public long queryEquipmentsCount(){
		return this.equipmentDao.queryEquipmentsCount();
	};
	
	
	@Override
	public List<EquipmentInfo> queryEquipmentsList(Pagination page){
		return this.equipmentDao.queryEquipmentsList(page);
	};
}
