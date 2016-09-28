package cn.itkt.hotel.mongodb.dto;

import java.sql.Timestamp;

/**
 * 调度单信息Dto
 * @author chenqiushi
 *
 */
public class BKDispatchInfoDto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 651613973779964535L;
	
	// Fields    
	// Fields    
		/**
		 * 主键
		 */
		private String dataId;
		
		/**
		 * 调度人
		 */
		private String createdBy;
		
		/**
		 * 调度单号
		 */
		private String dispatchNum;
		
		/**
		 * 物料数量
		 */
		private Long number;
		
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
	public BKDispatchInfoDto() {
		// TODO Auto-generated constructor stub
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDispatchNum() {
		return dispatchNum;
	}

	public void setDispatchNum(String dispatchNum) {
		this.dispatchNum = dispatchNum;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public Timestamp getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getSchedulingType() {
		return schedulingType;
	}

	public void setSchedulingType(String schedulingType) {
		this.schedulingType = schedulingType;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}

	public String getPrimaryDriver() {
		return primaryDriver;
	}

	public void setPrimaryDriver(String primaryDriver) {
		this.primaryDriver = primaryDriver;
	}

	public String getPrimaryDriverMobile() {
		return primaryDriverMobile;
	}

	public void setPrimaryDriverMobile(String primaryDriverMobile) {
		this.primaryDriverMobile = primaryDriverMobile;
	}

	public String getCopilotMobile() {
		return copilotMobile;
	}

	public void setCopilotMobile(String copilotMobile) {
		this.copilotMobile = copilotMobile;
	}

	public String getCopilotName() {
		return copilotName;
	}

	public void setCopilotName(String copilotName) {
		this.copilotName = copilotName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Timestamp getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(Timestamp dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
}