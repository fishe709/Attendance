package cn.itkt.hotel.mongodb.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class BKOrderInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2970420074880065302L;

	private String id;
	
	/**
	 * 订单号
	 */
	private String orderNum;
	
	/**
	 * 出发详细地址
	 */
	private String seoutAddress;
	
	/**
	 * 出发城市
	 */
	private String setoutCity;
	
	/**
	 * 到达城市
	 */
	private String arriveCity;
	
	/**
	 * 到达城市详细地址
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
	 * 订单类型
	 */
	private String orderType;
	
	/**
	 * 货主
	 */
	private String ownerName;
	
	/**
	 * 仓库
	 */
	private String warehouse;
	
	/**
	 * 总数量
	 */
	private BigDecimal totalNum;
	
	/**
	 * 总体积
	 */
	private BigDecimal totalVolume;
	
	/**
	 * 收货单位
	 */
	private String receivingUnit;
	
	/**
	 * 最早发货时间
	 */
	private Timestamp earliestDeliveryTime;
	
	/**
	 * 最晚发货时间
	 */
	private Timestamp lateDeliveryTime;
	
	/**
	 * 最早到达时间
	 */
	private Timestamp earliestArrivalTime;
	
	/**
	 * 最晚到达时间
	 */
	private Timestamp lateArrivalTime;

	/**
	 * 客户名称
	 */
	private String customerName;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
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

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(String warehouse) {
		this.warehouse = warehouse;
	}


	public String getReceivingUnit() {
		return receivingUnit;
	}

	public void setReceivingUnit(String receivingUnit) {
		this.receivingUnit = receivingUnit;
	}

	public Timestamp getEarliestDeliveryTime() {
		return earliestDeliveryTime;
	}

	public void setEarliestDeliveryTime(Timestamp earliestDeliveryTime) {
		this.earliestDeliveryTime = earliestDeliveryTime;
	}

	public Timestamp getLateDeliveryTime() {
		return lateDeliveryTime;
	}

	public void setLateDeliveryTime(Timestamp lateDeliveryTime) {
		this.lateDeliveryTime = lateDeliveryTime;
	}

	public Timestamp getEarliestArrivalTime() {
		return earliestArrivalTime;
	}

	public void setEarliestArrivalTime(Timestamp earliestArrivalTime) {
		this.earliestArrivalTime = earliestArrivalTime;
	}

	public Timestamp getLateArrivalTime() {
		return lateArrivalTime;
	}

	public void setLateArrivalTime(Timestamp lateArrivalTime) {
		this.lateArrivalTime = lateArrivalTime;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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
	
	

}
