package cn.itkt.hotel.local.pojo.sysmsg;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * AbstractSysReceiveMsg entity provides the base persistence definition of the SysReceiveMsg entity. @author MyEclipse Persistence Tools
 * 接受或者处理第三方系统的接口消息基类
 */
@MappedSuperclass
public abstract class SysAbstractMsg implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8590515852451933376L;

	/**
	 * 默认可执行次数
	 */
	protected static final int defExeNum = 3;
	
	// Fields    
	/**
	 * 主键
	 */
	private String id;

	/**
	 * 类型
	 */
	private Integer type;

	/**
	 * 编码（做查询用）
	 */
	private String code;

	/**
	 * 消息
	 */
	private String msg;

	/**
	 * 可执行次数
	 */
	private Integer exeNum;

	/**
	 * 消息状态
	 */
	private Integer status;

	/**
	 * 修改时间
	 */
	private Timestamp lastUdpTime;

	/**
	 * 创建时间
	 */
	private Timestamp createdTime;

	// Constructors

	/** default constructor */
	public SysAbstractMsg() {
	}

	/** full constructor */
	public SysAbstractMsg(String id, Integer type, String code, String msg, Integer exeNum, Integer status, Timestamp lastUdpTime,
			Timestamp createdTime) {
		this.id = id;
		this.type = type;
		this.code = code;
		this.msg = msg;
		this.exeNum = exeNum;
		this.status = status;
		this.lastUdpTime = lastUdpTime;
		this.createdTime = createdTime;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "type", nullable = false)
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "code", nullable = false)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "msg")
	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Column(name = "exeNum", nullable = false)
	public Integer getExeNum() {
		return this.exeNum;
	}

	public void setExeNum(Integer exeNum) {
		this.exeNum = exeNum;
	}

	@Column(name = "status", nullable = false)
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "lastUdpTime", nullable = false, length = 19)
	public Timestamp getLastUdpTime() {
		return this.lastUdpTime;
	}

	public void setLastUdpTime(Timestamp lastUdpTime) {
		this.lastUdpTime = lastUdpTime;
	}

	@Column(name = "createdTime", length = 19)
	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysAbstractMsg other = (SysAbstractMsg) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}