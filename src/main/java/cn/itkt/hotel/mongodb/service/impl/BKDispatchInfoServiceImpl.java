package cn.itkt.hotel.mongodb.service.impl;

import java.util.List;

import javax.annotation.Resource;

import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.mongodb.dao.BKDispatchInfoDao;
import cn.itkt.hotel.mongodb.dto.BKDispatchInfoDto;
import cn.itkt.hotel.mongodb.dto.BKOrderDetailDto;
import cn.itkt.hotel.mongodb.dto.BKOrderInfoDto;
import cn.itkt.hotel.mongodb.dto.MbTaskDetailDto;
import cn.itkt.hotel.mongodb.dto.MbTaskInfoDto;
import cn.itkt.hotel.mongodb.service.BKDispatchInfoService;

/**
 * 
 * @author chenqiushi
 * 调度单dao
 */
@Resource(name="bKDispatchInfoService")
public class BKDispatchInfoServiceImpl implements BKDispatchInfoService {

	@Resource
	private BKDispatchInfoDao bkDispatchInfoDao;
	
	/**
	 * 根据条件查询分页调度单
	 */
	@Override
	public List<BKDispatchInfoDto> listDispatchInfo(List<Condition> conditions, Pagination page) {
		return this.bkDispatchInfoDao.listDispatchInfo(conditions, page);
	}

	/**
	 * 统计调度单数量
	 */
	@Override
	public Long countDispatchInfo(List<Condition> conditions) {
		return this.bkDispatchInfoDao.countDispatchInfo(conditions);
	}

	@Override
	public List<MbTaskInfoDto> listTaskInfos(String dispatchNo, String dispatchId) {
		return this.bkDispatchInfoDao.listTaskInfos(dispatchNo, dispatchId);
	}

	@Override
	public List<MbTaskDetailDto> listTaskDetails(String taskNo, String taskId) {
		return this.bkDispatchInfoDao.listTaskDetails(taskNo, taskId);
	}

	@Override
	public BKOrderInfoDto listOrderInfo(String orderNum) {
		return this.bkDispatchInfoDao.listOrderInfo(orderNum);
	}

	@Override
	public List<BKOrderDetailDto> listOrderDetail(String orderNum) {
		return this.bkDispatchInfoDao.listOrderDetail(orderNum);
	}

	@Override
	public BKDispatchInfoDto getDispatchInfo(String dispatch_num) {
		return this.bkDispatchInfoDao.getDispatchInfo(dispatch_num);
	}


}
