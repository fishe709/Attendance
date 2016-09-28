package cn.itkt.hotel.mongodb.dao;

import java.util.List;

import cn.itkt.core.dao.IBaseDaoII;
import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.mongodb.dto.BKDispatchInfoDto;
import cn.itkt.hotel.mongodb.dto.BKOrderDetailDto;
import cn.itkt.hotel.mongodb.dto.BKOrderInfoDto;
import cn.itkt.hotel.mongodb.dto.MbTaskDetailDto;
import cn.itkt.hotel.mongodb.dto.MbTaskInfoDto;

/**
 * 
 * @author chenqiushi
 * 调度单dao
 */
public interface BKDispatchInfoDao extends IBaseDaoII<String> {

	/**
	 * 根据条件查询分页调度单
	 * @return
	 */
	public List<BKDispatchInfoDto> listDispatchInfo(List<Condition> conditions, Pagination page);
	
	/**
	 * 通过调度单号去获取调度单信息
	  * @作者: wangjinkui
	  * @日期: 2015年7月17日 下午2:51:46
	  * @方法名: getDispatchInfo 
	  * @方法描述: 
	  * @参数描述: @param dispatch_num
	  * @参数描述: @return
	  * @异常描述: XXXX
	 */
	public BKDispatchInfoDto getDispatchInfo(String dispatch_num);

	/**
	 * 统计调度订单数量
	 * @param condition
	 * @return
	 */
	public Long countDispatchInfo(List<Condition> conditions);
	
	/**
	  * 通过调度单号查询作业单信息
	  * @作者: wangjinkui
	  * @日期: 2015年7月16日 下午2:09:13
	  * @方法名: listTaskInfos 
	  * @方法描述: 
	  * @参数描述: @return
	  * @异常描述: XXXX
	 */
	public List<MbTaskInfoDto> listTaskInfos(String dispatchNo, String dispatchId);
	
	/**
	  * 查询作业单号作业单明细
	  * @作者: wangjinkui
	  * @日期: 2015年7月16日 下午4:08:05
	  * @方法名: listTaskDetails 
	  * @方法描述: 
	  * @参数描述: @param taskNo
	  * @参数描述: @return
	  * @异常描述: XXXX
	 */
	public List<MbTaskDetailDto> listTaskDetails(String taskNo, String taskId);
	
	/**
	  * 通过订单号加载订单信息
	  * @作者: wangjinkui
	  * @日期: 2015年7月17日 上午9:56:58
	  * @方法名: listOrderInfo 
	  * @方法描述: 
	  * @参数描述: @param orderNum
	  * @参数描述: @return
	  * @异常描述: XXXX
	 */
	public BKOrderInfoDto listOrderInfo(String orderNum);
	
	/**
	 * 通过订单号加载订单明细
	  * @作者: wangjinkui
	  * @日期: 2015年7月17日 上午11:56:17
	  * @方法名: listOrderDetail 
	  * @方法描述: 
	  * @参数描述: @param orderNum
	  * @参数描述: @return
	  * @异常描述: XXXX
	 */
	public List<BKOrderDetailDto> listOrderDetail(String orderNum);
}
