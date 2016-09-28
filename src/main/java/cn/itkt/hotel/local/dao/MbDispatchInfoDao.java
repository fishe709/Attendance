package cn.itkt.hotel.local.dao;

import java.util.List;

import cn.itkt.core.dao.IBaseDao;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.pojo.MbDispatchInfo;

/**
 * 
 * @author chenqiushi
 * 调度单dao
 */
public interface MbDispatchInfoDao extends IBaseDao<String> {

	/**
	 * 调度单列表
	 * @param conditions
	 * @param page
	 * @return
	 */
	public List<MbDispatchInfo> listMbDisPatchInfo(List<Condition> conditions, Pagination page);

	/**
	 * 调度单数量
	 * @param conditions
	 * @return
	 */
	public Long countMbDisPatchInfo(List<Condition> conditions);
	
	/**
	  * 获取当前的调度单
	  * @作者: wangjinkui
	  * @日期: 2015年7月20日 下午5:31:39
	  * @方法名: getCurrentDispatchInfo 
	  * @方法描述: 
	  * @参数描述: @param conditions
	  * @参数描述: @return
	  * @异常描述: XXXX
	 */
	public MbDispatchInfo getCurrentDispatchInfo(List<Condition> conditions);
	
}
