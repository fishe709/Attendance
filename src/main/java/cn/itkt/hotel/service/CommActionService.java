package cn.itkt.hotel.service;

import cn.itkt.hotel.local.pojo.sysmsg.SysReceiveMsg;

public interface CommActionService {

	/**
	 * 同步博客系统的调度单以及相关信息
	 * @param string
	 */
	public void sysnMbDispatchInfo(String actionDate);

	/**
	 * 同步调度单号
	 * @param string
	 */
	public void sysnMbDispatchCode(String actionDate);

	/**
	 * 获取博客调度单相关信息并保存到订单系统中（注意各个系统的事务）
	 * @param msg
	 */
	public void saveBokeDispatchInfo(SysReceiveMsg msg);

}
