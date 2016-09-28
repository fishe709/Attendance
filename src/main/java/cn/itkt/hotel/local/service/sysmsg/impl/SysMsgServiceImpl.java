package cn.itkt.hotel.local.service.sysmsg.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itkt.core.dao.persistence.Condition;
import cn.itkt.core.dao.persistence.Pagination;
import cn.itkt.hotel.local.dao.sysmsg.SysDispatchMsgDao;
import cn.itkt.hotel.local.dao.sysmsg.SysReceiveMsgDao;
import cn.itkt.hotel.local.pojo.sysmsg.SysDispatchMsg;
import cn.itkt.hotel.local.pojo.sysmsg.SysMsgType;
import cn.itkt.hotel.local.pojo.sysmsg.SysReceiveMsg;
import cn.itkt.hotel.local.service.sysmsg.SysMsgService;

/**
 * 消息的业务实现类
 * @author chenqiushi
 *
 */
@Service(value="sysMsgService")
public class SysMsgServiceImpl implements SysMsgService{

	@Resource
	private SysReceiveMsgDao sysReceiveMsgDao;
	
	@Resource
	private SysDispatchMsgDao sysDispatchMsgDao;

	/**
	 * 保存接受消息
	 */
	@Override
	public void saveSysReceiveMsg(SysReceiveMsg receiveMsg) {
		this.sysReceiveMsgDao.save(receiveMsg);
	}

	/**
	 * 批量保存接受消息(存在的类型和编码就不批量保存)
	 */
	@Override
	public void saveSysReceiveMsgAll(List<SysReceiveMsg> receiveMsgs) {
		List<String> codes = new ArrayList<String>();
		for(SysReceiveMsg msg : receiveMsgs){
			codes.add(msg.getCode());
		}
		List<Condition> conditions = new ArrayList<Condition>();
		conditions.add(new Condition("type", "=",  SysMsgType.BOKE.getValue()));
		conditions.add(new Condition("code", "in", codes));
		List<SysReceiveMsg> msgs = this.sysReceiveMsgDao.listReceiveMsg(conditions, null);
		receiveMsgs.removeAll(msgs);
		this.sysReceiveMsgDao.saveOrUpdateAll(receiveMsgs);
	}

	/**
	 * 修改接受信息
	 */
	@Override
	public void updateSysReceiveMsg(SysReceiveMsg receiveMsgs) {
		this.sysReceiveMsgDao.update(receiveMsgs);
	}
	
	/**
	 * 批量修改修改接受信息
	 */
	@Override
	public void updateSysReceiveMsgAll(List<SysReceiveMsg> receiveMsgs){
		this.sysReceiveMsgDao.saveOrUpdateAll(receiveMsgs);
	}

	/**
	 * 保存处理响应报文
	 */
	@Override
	public void saveSysDispatchMsg(SysDispatchMsg dispatchMsg) {
		this.sysDispatchMsgDao.save(dispatchMsg);
	}

	/**
	 * 批量保存处理响应报文
	 */
	@Override
	public void saveSysDispatchMsgAll(List<SysDispatchMsg> dispatchMsgs) {

//		List<String> codes = new ArrayList<String>();
//		for(SysDispatchMsg msg : dispatchMsgs){
//			codes.add(msg.getCode());
//		}
//		List<Condition> conditions = new ArrayList<Condition>();
//		conditions.add(new Condition("type", "=",  SysMsgType.BOKE.getValue()));
//		conditions.add(new Condition("code", "in", codes));
//		List<SysDispatchMsg> msgs = this.sysDispatchMsgDao.listDispatchMsg(conditions, null);
//		dispatchMsgs.removeAll(msgs);
	
		this.sysDispatchMsgDao.saveOrUpdateAll(dispatchMsgs);
	}

	/**
	 * 修改处理响应报文
	 */
	@Override
	public void updateSysDispatchMsg(SysDispatchMsg dispatchMsg) {
		this.sysDispatchMsgDao.update(dispatchMsg);
	}

	/**
	 * 查询接受报文列表
	 */
	@Override
	public List<SysReceiveMsg> listReceiveMsg(List<Condition> conditions, Pagination page) {
		return this.sysReceiveMsgDao.listReceiveMsg(conditions, page);
	}

	/**
	 * 查询处理响应报文
	 */
	@Override
	public List<SysDispatchMsg> listSysDispatchMsg(List<Condition> conditions, Pagination page) {
		return this.sysDispatchMsgDao.listDispatchMsg(conditions, page);
	}
}
