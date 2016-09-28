package cn.itkt.hotel.vo.phone.request;

/**
 * 类: QueryCreditCardRequest <br>
 * 描述: 信用卡担保查询请求对象 <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-4-12 下午4:45:07
 */
public class QueryCreditCardRequest {

	/** 终端ID */
	private String terminalId;
	/** 酒店ID */
	private String hotelId;
	/** 房间ID */
	private String roomTypeId;
	/** 入住时间 */
	private String checkInDate;
	/** 离店时间 2012-08-07 */
	private String checkOutDate;
	/** 到店时段 19:00-22:00 */
	private String arrivePeriod;
	/** 房间数量 */
	private String count;
	/** 总价 */
	private double rotalPrice;
	/** 首日最少房间数 100 */
	private String minCheckinRooms;
	/** 首日价 */
	private double firstDayPrice;
	/** 是否到店时间担保 */
	private String isArriveTimeVouch;
	/** 是否房量担保 */
	private String isRoomCountVouch;
	/** 担保有效的最晚到店时间 */
	private String arriveEndTime;
	/** 担保有效的最早到店时间 */
	private String arriveStartTime;
	/** 担保有效的房量 */
	private String roomCount;
	/** 总畅达币 */
	private Integer totalLcdFee;
	/** 担保金额类型 */
	private String vouchMoneyType;
	/** RP业务ID */
	private String ratePlanId;
	/** 活动ID */
	private String lcdActivityId;

	/**
	 * 返回: the terminalId <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final String getTerminalId() {
		return terminalId;
	}

	/**
	 * 参数: terminalId to set the terminalId <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	/**
	 * 返回: the hotelId <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final String getHotelId() {
		return hotelId;
	}

	/**
	 * 参数: hotelId to set the hotelId <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * 返回: the roomTypeId <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final String getRoomTypeId() {
		return roomTypeId;
	}

	/**
	 * 参数: roomTypeId to set the roomTypeId <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	/**
	 * 返回: the checkInDate <br>
	 * 时间: 2013-5-29 下午5:14:58
	 */
	public final String getCheckInDate() {
		return checkInDate;
	}

	/**
	 * 参数: checkInDate to set the checkInDate <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	/**
	 * 返回: the checkOutDate <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * 参数: checkOutDate to set the checkOutDate <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	/**
	 * 返回: the arrivePeriod <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getArrivePeriod() {
		return arrivePeriod;
	}

	/**
	 * 参数: arrivePeriod to set the arrivePeriod <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setArrivePeriod(String arrivePeriod) {
		this.arrivePeriod = arrivePeriod;
	}

	/**
	 * 返回: the count <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getCount() {
		return count;
	}

	/**
	 * 参数: count to set the count <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setCount(String count) {
		this.count = count;
	}

	/**
	 * 返回: the rotalPrice <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final double getRotalPrice() {
		return rotalPrice;
	}

	/**
	 * 参数: rotalPrice to set the rotalPrice <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setRotalPrice(double rotalPrice) {
		this.rotalPrice = rotalPrice;
	}

	/**
	 * 返回: the minCheckinRooms <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getMinCheckinRooms() {
		return minCheckinRooms;
	}

	/**
	 * 参数: minCheckinRooms to set the minCheckinRooms <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setMinCheckinRooms(String minCheckinRooms) {
		this.minCheckinRooms = minCheckinRooms;
	}

	/**
	 * 返回: the firstDayPrice <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final double getFirstDayPrice() {
		return firstDayPrice;
	}

	/**
	 * 参数: firstDayPrice to set the firstDayPrice <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setFirstDayPrice(double firstDayPrice) {
		this.firstDayPrice = firstDayPrice;
	}

	/**
	 * 返回: the isArriveTimeVouch <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getIsArriveTimeVouch() {
		return isArriveTimeVouch;
	}

	/**
	 * 参数: isArriveTimeVouch to set the isArriveTimeVouch <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setIsArriveTimeVouch(String isArriveTimeVouch) {
		this.isArriveTimeVouch = isArriveTimeVouch;
	}

	/**
	 * 返回: the isRoomCountVouch <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getIsRoomCountVouch() {
		return isRoomCountVouch;
	}

	/**
	 * 参数: isRoomCountVouch to set the isRoomCountVouch <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setIsRoomCountVouch(String isRoomCountVouch) {
		this.isRoomCountVouch = isRoomCountVouch;
	}

	/**
	 * 返回: the arriveEndTime <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getArriveEndTime() {
		return arriveEndTime;
	}

	/**
	 * 参数: arriveEndTime to set the arriveEndTime <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setArriveEndTime(String arriveEndTime) {
		this.arriveEndTime = arriveEndTime;
	}

	/**
	 * 返回: the arriveStartTime <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getArriveStartTime() {
		return arriveStartTime;
	}

	/**
	 * 参数: arriveStartTime to set the arriveStartTime <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setArriveStartTime(String arriveStartTime) {
		this.arriveStartTime = arriveStartTime;
	}

	/**
	 * 返回: the roomCount <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getRoomCount() {
		return roomCount;
	}

	/**
	 * 参数: roomCount to set the roomCount <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setRoomCount(String roomCount) {
		this.roomCount = roomCount;
	}

	/**
	 * 返回: the totalLcdFee <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final Integer getTotalLcdFee() {
		return totalLcdFee;
	}

	/**
	 * 参数: totalLcdFee to set the totalLcdFee <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setTotalLcdFee(Integer totalLcdFee) {
		this.totalLcdFee = totalLcdFee;
	}

	/**
	 * 返回: the vouchMoneyType <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getVouchMoneyType() {
		return vouchMoneyType;
	}

	/**
	 * 参数: vouchMoneyType to set the vouchMoneyType <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setVouchMoneyType(String vouchMoneyType) {
		this.vouchMoneyType = vouchMoneyType;
	}

	/**
	 * 返回: the ratePlanId <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final String getRatePlanId() {
		return ratePlanId;
	}

	/**
	 * 参数: ratePlanId to set the ratePlanId <br>
	 * 时间: 2013-5-29 下午5:14:59
	 */
	public final void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	/**
	 * 返回: the lcdActivityId <br>
	 * 时间: 2013-8-8 上午11:30:30
	 */
	public final String getLcdActivityId() {
		return lcdActivityId;
	}

	/**
	 * 参数: lcdActivityId to set the lcdActivityId <br>
	 * 时间: 2013-8-8 上午11:30:30
	 */
	public final void setLcdActivityId(String lcdActivityId) {
		this.lcdActivityId = lcdActivityId;
	}
}
