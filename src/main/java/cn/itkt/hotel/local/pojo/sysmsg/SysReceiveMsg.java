package cn.itkt.hotel.local.pojo.sysmsg;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Table;

import cn.itkt.hotel.mongodb.dto.BKDispatchInfoDto;
import cn.itkt.hotel.util.SerialNumberUtil;

/**
 * SysReceiveMsg entity. @author MyEclipse Persistence Tools
 * 接受第三方系统的接口消息类
 */
@Entity
@Table(name = "sys_receive_msg", catalog = "security")
public class SysReceiveMsg extends SysAbstractMsg {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2646576498445220671L;

	// Constructors

	/** default constructor */
	public SysReceiveMsg() {
	}

	/** full constructor */
	public SysReceiveMsg(String id, Integer type, String code, String msg, Integer exeNum, Integer status, Timestamp lastUdpTime,
			Timestamp createdTime) {
		super(id, type, code, msg, exeNum, status, lastUdpTime, createdTime);
	}

	/**
	 * 调度订单消息类型
	 * @param dto
	 */
	public SysReceiveMsg(BKDispatchInfoDto dto) {
		this.setId(SerialNumberUtil.getId());
		this.setCode(dto.getDispatchNum());
		this.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		this.setType(SysMsgType.BOKE.getValue());
		this.setStatus(SysMsgStatus.UnProcessed.getValue());
		this.setExeNum(defExeNum);
	}

}