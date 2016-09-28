package cn.itkt.hotel.mongodb.dto;

import java.sql.Timestamp;

public class BKOrderDetailDto {

	private String id;
	
	/**
	 * 订单号
	 */
	private String orderNum;
	
	/**
	 * 物料名称
	 */
	private String materialName;
	
	/**
	 * 数量
	 */
	private Long quantity;
	
	/**
	 * 物料代码
	 */
	private String materialCode;
	
	/**
	 * 创建时间
	 */
	private Timestamp createdTime;

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

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getMaterialCode() {
		return materialCode;
	}

	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}
	
	
}
