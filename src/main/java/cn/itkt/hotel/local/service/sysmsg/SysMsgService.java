package cn.itkt.hotel.local.service.sysmsg;

import java.util.List;

import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.pojo.sysmsg.SysDispatchMsg;
import cn.itkt.hotel.local.pojo.sysmsg.SysReceiveMsg;

/**
 * 消息的业务实现
 * @author chenqiushi
 *
 */
public interface SysMsgService {

	/**
	 * 保存接受消息
	 * @param receiveMsgs
	 */
	public void saveSysReceiveMsg(SysReceiveMsg receiveMsg);

	/**
	 * 批量保存接受消息
	 * @param receiveMsgs
	 */
	public void saveSysReceiveMsgAll(List<SysReceiveMsg> receiveMsgs);
	
	/**
	 * 修改接受信息
	 * @param dispatchMsg
	 */
	public void updateSysReceiveMsg(SysReceiveMsg receiveMsgs);

	/**
	 * 保存处理响应报文
	 * @param receiveMsgs
	 */
	public void saveSysDispatchMsg(SysDispatchMsg dispatchMsg);

	/**
	 * 批量保存处理响应报文
	 * @param receiveMsgs
	 */
	public void saveSysDispatchMsgAll(List<SysDispatchMsg> dispatchMsgs);
	
	/**
	 * 修改处理后的响应信息
	 * @param dispatchMsg
	 */
	public void updateSysDispatchMsg(SysDispatchMsg dispatchMsg);

	/**
	 * 查询接受报文列表
	 * @param conditions
	 * @param page
	 * @return
	 */
	public List<SysReceiveMsg> listReceiveMsg(List<Condition> conditions, Pagination page);
	
	/**
	 * 查询处理消息报文列表
	 * @param conditions
	 * @param page
	 * @return
	 */
	public List<SysDispatchMsg> listSysDispatchMsg(List<Condition> conditions, Pagination page);

	/**
	 * 批量修改接受信息
	 */
	public void updateSysReceiveMsgAll(List<SysReceiveMsg> receiveMsgs);
}
