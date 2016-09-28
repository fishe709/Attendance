package cn.itkt.hotel.local.pojo.sysmsg;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.itkt.hotel.mongodb.dto.BKDispatchInfoDto;
import cn.itkt.hotel.util.SerialNumberUtil;

/**
 * SysDispatchMsg entity. @author MyEclipse Persistence Tools
 * 处理并响应第三方系统的接口消息基类
 */
@Entity
@Table(name = "sys_dispatch_msg", catalog = "security")
public class SysDispatchMsg extends SysAbstractMsg {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4342473446134506850L;

	// Constructors
	/** default constructor */
	public SysDispatchMsg() {
	}

	/** full constructor */
	public SysDispatchMsg(String id, Integer type, String code, String msg, Integer exeNum, Integer status, Timestamp lastUdpTime,
			Timestamp createdTime) {
		super(id, type, code, msg, exeNum, status, lastUdpTime, createdTime);
	}

	/**
	 * 通过博客调度单信息构造对象
	 * @param dto
	 */
	public SysDispatchMsg(BKDispatchInfoDto dto) {
		this.setId(SerialNumberUtil.getId());
		this.setCode(dto.getDispatchNum());
		this.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		this.setType(SysMsgType.BOKE.getValue());
		this.setStatus(SysMsgStatus.UnProcessed.getValue());
		this.setExeNum(defExeNum);
	}

	/**
	 * 通过请求报文构造对象
	 * @param msg
	 */
	public SysDispatchMsg(SysReceiveMsg msg) {
		this.setId(SerialNumberUtil.getId());
		this.setCode(msg.getCode());
		this.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		this.setType(msg.getType());
		this.setStatus(SysMsgStatus.Processed.getValue());
		this.setExeNum(defExeNum);
	}
}