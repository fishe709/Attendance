package cn.itkt.hotel.local.pojo;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import cn.itkt.hotel.mongodb.dto.BKDispatchInfoDto;
import cn.itkt.hotel.util.SerialNumberUtil;

/**
 * 调度单信息
 * @author chenqiushi
 *
 */
@Entity
@Table(name = "mb_dispatch_info", catalog = "security")
public class MbDispatchInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2392398594133043895L;
	
	// Fields    
	/**
	 * 主键
	 */
	private String id;
	
	/**
	 * 修改时间
	 */
	private Timestamp lastUdpTime;
	
	/**
	 * 创建时间
	 */
	private Timestamp createdTime;
	
	/**
	 * 调度人
	 */
	private String createdBy;
	
	/**
	 * 修改人
	 */
	private String lastUdpBy;
	
	/**
	 * 数据来源（分为：WEB、IOS、ANDROID、BOKE（订单系统）、或者第三方系统数据（具体待定））
	 */
	private String originApp;
	
	/**
	 * 调度单号
	 */
	private String dispatchNum;
	
	/**
	 * 物料数量
	 */
	private Long number;
	
	/**
	 * 状态(1为开始到场检查；2为到场检查结束；3为开始装车检查；4为结束装车检查；5为发车检查；6确认发车；7为在途；8卸货到达；9开始卸货；10卸货完成；11签收确认；12回单上传)
	 */
	private Integer status;
	
	/**
	 * 车牌
	 */
	private String vehicleNum;
	
	/**
	 * 计划车辆到达时间
	 */
	private Timestamp arrivalTime;
	
	/**
	 * 车型
	 */
	private String vehicleType;
	
	/**
	 * 调度类型
	 */
	private String schedulingType;
	
	/**
	 * 发货仓库
	 */
	private String warehouse;
	
	/**
	 * 主驾驶姓名
	 */
	private String primaryDriver;
	
	/**
	 * 主驾驶手机号码
	 */
	private String primaryDriverMobile;
	
	/**
	 * 副驾驶手机号码
	 */
	private String copilotMobile;
	
	/**
	 * 副驾驶姓名
	 */
	private String copilotName;
	
	/**
	 * 始发地
	 */
	private String departure;
	
	/**
	 * 目的地
	 */
	private String destination;
	
	/**
	 * 派车时间
	 */
	private Timestamp dispatchTime;
	
	/**
	 * 承运商
	 */
	private String carrier;

	// Constructors

	/** default constructor */
	public MbDispatchInfo() {
	}

	/** minimal constructor */
	public MbDispatchInfo(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @param dto
	 */
	public MbDispatchInfo(BKDispatchInfoDto dto) {
		this.id = SerialNumberUtil.getId();
		this.createdTime = new Timestamp(System.currentTimeMillis());
		this.createdBy = dto.getCreatedBy();
		this.originApp = "BOKE";
		this.dispatchNum = dto.getDispatchNum();
		this.number = dto.getNumber();
		this.vehicleNum = dto.getVehicleNum();
		this.arrivalTime = dto.getArrivalTime();
		this.vehicleType = dto.getVehicleType();
		this.schedulingType = dto.getSchedulingType();
		this.warehouse = dto.getWarehouse();
		this.primaryDriver = dto.getPrimaryDriver();
		this.primaryDriverMobile = dto.getPrimaryDriverMobile();
		this.copilotMobile = dto.getCopilotMobile();
		this.copilotName = dto.getCopilotName();
		this.departure = dto.getDeparture();
		this.destination = dto.getDestination();
		this.dispatchTime = dto.getDispatchTime();
		this.carrier = dto.getCarrier();
	}
	
	/** full constructor */
	public MbDispatchInfo(String id, Timestamp lastUdpTime, Timestamp createdTime, String createdBy, String lastUdpBy, String originApp,
			String dispatchNum, Long number, Integer status, String vehicleNum, Timestamp arrivalTime, String vehicleType,
			String schedulingType, String warehouse, String primaryDriver, String primaryDriverMobile, String copilotMobile,
			String copilotName, String departure, String destination, Timestamp dispatchTime, String carrier) {
		this.id = id;
		this.lastUdpTime = lastUdpTime;
		this.createdTime = createdTime;
		this.createdBy = createdBy;
		this.lastUdpBy = lastUdpBy;
		this.originApp = originApp;
		this.dispatchNum = dispatchNum;
		this.number = number;
		this.status = status;
		this.vehicleNum = vehicleNum;
		this.arrivalTime = arrivalTime;
		this.vehicleType = vehicleType;
		this.schedulingType = schedulingType;
		this.warehouse = warehouse;
		this.primaryDriver = primaryDriver;
		this.primaryDriverMobile = primaryDriverMobile;
		this.copilotMobile = copilotMobile;
		this.copilotName = copilotName;
		this.departure = departure;
		this.destination = destination;
		this.dispatchTime = dispatchTime;
		this.carrier = carrier;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 36)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "last_udp_time", length = 19)
	public Timestamp getLastUdpTime() {
		return this.lastUdpTime;
	}

	public void setLastUdpTime(Timestamp lastUdpTime) {
		this.lastUdpTime = lastUdpTime;
	}

	@Column(name = "created_time", length = 19)
	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	@Column(name = "created_by", length = 36)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "last_udp_by", length = 36)
	public String getLastUdpBy() {
		return this.lastUdpBy;
	}

	public void setLastUdpBy(String lastUdpBy) {
		this.lastUdpBy = lastUdpBy;
	}

	@Column(name = "origin_app", length = 20)
	public String getOriginApp() {
		return this.originApp;
	}

	public void setOriginApp(String originApp) {
		this.originApp = originApp;
	}

	@Column(name = "dispatch_num", length = 32)
	public String getDispatchNum() {
		return this.dispatchNum;
	}

	public void setDispatchNum(String dispatchNum) {
		this.dispatchNum = dispatchNum;
	}

	@Column(name = "number")
	public Long getNumber() {
		return this.number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	@Column(name = "status")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "vehicle_num", length = 10)
	public String getVehicleNum() {
		return this.vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	@Column(name = "arrival_time", length = 19)
	public Timestamp getArrivalTime() {
		return this.arrivalTime;
	}

	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Column(name = "vehicle_type", length = 64)
	public String getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Column(name = "scheduling_type", length = 10)
	public String getSchedulingType() {
		return this.schedulingType;
	}

	public void setSchedulingType(String schedulingType) {
		this.schedulingType = schedulingType;
	}

	@Column(name = "warehouse", length = 36)
	public String getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	@Column(name = "primary_driver", length = 32)
	public String getPrimaryDriver() {
		return this.primaryDriver;
	}

	public void setPrimaryDriver(String primaryDriver) {
		this.primaryDriver = primaryDriver;
	}

	@Column(name = "primary_driver_mobile", length = 32)
	public String getPrimaryDriverMobile() {
		return this.primaryDriverMobile;
	}

	public void setPrimaryDriverMobile(String primaryDriverMobile) {
		this.primaryDriverMobile = primaryDriverMobile;
	}

	@Column(name = "copilot_mobile", length = 23)
	public String getCopilotMobile() {
		return this.copilotMobile;
	}

	public void setCopilotMobile(String copilotMobile) {
		this.copilotMobile = copilotMobile;
	}

	@Column(name = "copilot_name", length = 46)
	public String getCopilotName() {
		return this.copilotName;
	}

	public void setCopilotName(String copilotName) {
		this.copilotName = copilotName;
	}

	@Column(name = "departure", length = 128)
	public String getDeparture() {
		return this.departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	@Column(name = "destination", length = 128)
	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Column(name = "dispatch_time", length = 19)
	public Timestamp getDispatchTime() {
		return this.dispatchTime;
	}

	public void setDispatchTime(Timestamp dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	@Column(name = "carrier", length = 32)
	public String getCarrier() {
		return this.carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

}