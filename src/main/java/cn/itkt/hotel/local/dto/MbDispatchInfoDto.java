package cn.itkt.hotel.local.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import cn.itkt.hotel.local.pojo.MbDispatchInfo;

/**
 * 调度单dto
 * @author chenqiushi
 *
 */
public class MbDispatchInfoDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1389240671841956961L;

	private String dataId;
	
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
	
	/**
	 * 作业单
	 */
	private List<MbTaskInfoDto> taskInfos;
	
	/******************装车前检查操作的属性开始*********************************************/
	
	/**
	 * 车厢卫生情况图片
	 */
	private String healthPictureUrl;
	
	/**
	 * 车辆温度附件
	 */
	private String temperaturePictureUrl;
	
	/**
	 * 车辆检查报表附件
	 */
	private String checkQualifieFile;
	
	/**
	 * 车况是否合格
	 */
	private Integer isConditioinQualified;
	
	/**
	 * 卫生是否合格
	 */
	private Integer isHealthQualified;
	
	/******************装车前检查操作的属性结束*************************************************************/
	
	/******************装车后检查操作的属性开始*********************************************/
	
	/**
	 * 车厢货物摆放情况拍照附件
	 */
	private String goodsDisplayUrl;
	
	/**
	 * 车厢铅封拍照附件
	 */
	private String sealPictureUrl;
	
	/**
	 * 车内温度拍照
	 */
	private String sealTeperatureUrl;
	
	/**
	 * 是否已铅封车辆
	 */
	private Integer isSeal;
	
	/**
	 * 车内温度合格
	 */
	private Integer isTemperatrueQualified;
	
	/**
	 * 是否需要打冷
	 */
	private Integer isCold;
	
	/**
	 * 打冷时长（分钟）
	 */
	private Double coldTime;
	/******************装车后检查操作的属性结束*************************************************************/
	
	public MbDispatchInfoDto(MbDispatchInfo info) {
		this.dataId = info.getId();
		this.originApp = info.getOriginApp();
		this.arrivalTime = info.getArrivalTime();
		this.copilotMobile = info.getCopilotMobile();
		this.copilotName = info.getCopilotName();
		this.departure = info.getDeparture();
		this.destination = info.getDestination();
		this.dispatchNum = info.getDispatchNum();
		this.number = info.getNumber();
		this.primaryDriver = info.getPrimaryDriver();
		this.primaryDriverMobile = info.getPrimaryDriverMobile();
		this.schedulingType = info.getSchedulingType();
		this.status = info.getStatus();
		this.vehicleNum = info.getVehicleNum();
		this.vehicleType = info.getVehicleType();
		this.warehouse = info.getWarehouse();
				
	}

	public MbDispatchInfoDto() {
		super();
	}

	public String getDataId() {
		return dataId;
	}

	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getOriginApp() {
		return originApp;
	}

	public void setOriginApp(String originApp) {
		this.originApp = originApp;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public List<MbTaskInfoDto> getTaskInfos() {
		return taskInfos;
	}

	public void setTaskInfos(List<MbTaskInfoDto> taskInfos) {
		this.taskInfos = taskInfos;
	}

	public String getHealthPictureUrl() {
		return healthPictureUrl;
	}

	public void setHealthPictureUrl(String healthPictureUrl) {
		this.healthPictureUrl = healthPictureUrl;
	}

	public String getTemperaturePictureUrl() {
		return temperaturePictureUrl;
	}

	public void setTemperaturePictureUrl(String temperaturePictureUrl) {
		this.temperaturePictureUrl = temperaturePictureUrl;
	}

	public String getCheckQualifieFile() {
		return checkQualifieFile;
	}

	public void setCheckQualifieFile(String checkQualifieFile) {
		this.checkQualifieFile = checkQualifieFile;
	}

	public Integer getIsConditioinQualified() {
		return isConditioinQualified;
	}

	public void setIsConditioinQualified(Integer isConditioinQualified) {
		this.isConditioinQualified = isConditioinQualified;
	}

	public Integer getIsHealthQualified() {
		return isHealthQualified;
	}

	public void setIsHealthQualified(Integer isHealthQualified) {
		this.isHealthQualified = isHealthQualified;
	}

	public String getGoodsDisplayUrl() {
		return goodsDisplayUrl;
	}

	public void setGoodsDisplayUrl(String goodsDisplayUrl) {
		this.goodsDisplayUrl = goodsDisplayUrl;
	}

	public String getSealPictureUrl() {
		return sealPictureUrl;
	}

	public void setSealPictureUrl(String sealPictureUrl) {
		this.sealPictureUrl = sealPictureUrl;
	}

	public Integer getIsSeal() {
		return isSeal;
	}

	public void setIsSeal(Integer isSeal) {
		this.isSeal = isSeal;
	}

	public Integer getIsTemperatrueQualified() {
		return isTemperatrueQualified;
	}

	public void setIsTemperatrueQualified(Integer isTemperatrueQualified) {
		this.isTemperatrueQualified = isTemperatrueQualified;
	}

	public Integer getIsCold() {
		return isCold;
	}

	public void setIsCold(Integer isCold) {
		this.isCold = isCold;
	}

	public Double getColdTime() {
		return coldTime;
	}

	public void setColdTime(Double coldTime) {
		this.coldTime = coldTime;
	}

	public String getSealTeperatureUrl() {
		return sealTeperatureUrl;
	}

	public void setSealTeperatureUrl(String sealTeperatureUrl) {
		this.sealTeperatureUrl = sealTeperatureUrl;
	}
	
	
}
