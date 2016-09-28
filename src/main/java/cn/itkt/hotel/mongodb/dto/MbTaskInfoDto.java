package cn.itkt.hotel.mongodb.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class MbTaskInfoDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7627424120219476042L;
	
	private String id;

	/**
	 * 订单编号
	 */
	private String orderNum;
	
	/**
	 * 调度单ID
	 */
	private String dispatchId;
	
	/**
	 * 客户名称
	 */
	private String customerName;
	
	/**
	 * 车牌号
	 */
	private String vehicleNum;
	
	/**
	 * 客户手机号码
	 */
	private String customerMobile;
	
	/**
	 * 状态
	 */
	private Integer status;
	
	/**
	 * 出发地详细地址
	 */
	private String seoutAddress;
	
	/**
	 * 出发地
	 */
	private String setoutCity;
	
	/**
	 * 到达地
	 */
	private String arriveCity;
	
	/**
	 * 到达地址
	 */
	private String arriveAddress;
	
	/**
	 * 收货人姓名
	 */
	private String receiverName;
	
	/**
	 * 收货人手机号码
	 */
	private String receiverMobile;
	
	/**
	 * 总数量
	 */
	private BigDecimal totalNum;
	
	/**
	 * 总体积
	 */
	private BigDecimal totalVolume;
	
	/**
	 * 作业单号
	 */
	private String taskNum;

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}

	public String getDispatchId() {
		return dispatchId;
	}

	public void setDispatchId(String dispatchId) {
		this.dispatchId = dispatchId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getVehicleNum() {
		return vehicleNum;
	}

	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSeoutAddress() {
		return seoutAddress;
	}

	public void setSeoutAddress(String seoutAddress) {
		this.seoutAddress = seoutAddress;
	}

	public String getSetoutCity() {
		return setoutCity;
	}

	public void setSetoutCity(String setoutCity) {
		this.setoutCity = setoutCity;
	}

	public String getArriveCity() {
		return arriveCity;
	}

	public void setArriveCity(String arriveCity) {
		this.arriveCity = arriveCity;
	}

	public String getArriveAddress() {
		return arriveAddress;
	}

	public void setArriveAddress(String arriveAddress) {
		this.arriveAddress = arriveAddress;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverMobile() {
		return receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}

	public BigDecimal getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(BigDecimal totalNum) {
		this.totalNum = totalNum;
	}

	public BigDecimal getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(BigDecimal totalVolume) {
		this.totalVolume = totalVolume;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskNum() {
		return taskNum;
	}

	public void setTaskNum(String taskNum) {
		this.taskNum = taskNum;
	}
	
	
}
