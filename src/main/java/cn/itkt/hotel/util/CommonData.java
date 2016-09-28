package cn.itkt.hotel.util;

/**
 * 类: CommonData <br>
 * 描述: 公共数据对象。需要共享的数据可自行添加字段 <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-2-27 下午4:27:59
 */
public class CommonData {

	/** 入住日期 */
	private String checkInDate;

	/**
	 * 返回: the checkInDate <br>
	 * 时间: 2013-2-27 下午4:26:05
	 */
	public String getCheckInDate() {
		return checkInDate;
	}

	/**
	 * 参数: checkInDate to set the checkInDate <br>
	 * 时间: 2013-2-27 下午4:26:05
	 */
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
}
