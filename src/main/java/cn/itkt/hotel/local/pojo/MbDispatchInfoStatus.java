package cn.itkt.hotel.local.pojo;

import cn.itkt.core.exception.UnsupportedValueException;

/**
 * 调度单状态枚举值
 * @author chenqiushi
 */
public enum MbDispatchInfoStatus {

	// 1调度单生成；2装车前检查；3开始装车；4结束装车；5装车后检查；6确认发车；7卸货到达；8开始卸货；9卸货完成；10签收确认；11上传回单

	/**
	 * 调度单生成
	 */
	Arrived(1),

	/**
	 * 开始装车检查
	 */
	CheckBeforeCargo(2),

	/**
	 * 开始装车
	 */
	StartCargo(3),

	/**
	 * 结束装车
	 */
	EndCargo(4),

	/**
	 * 结束装车检查
	 */
	CheckAfterCargo(5),

	/**
	 * 确认发车
	 */
	StartDeparture(6),

	/**
	 * 卸货到达
	 */
	LandedArrival(7),

	/**
	 * 开始卸货
	 */
	BeginUnload(8),

	/**
	 * 结束卸货
	 */
	EndUnload(9),

	/**
	 * 签收确认
	 */
	SignTaskInfo(10),

	/**
	 * 上传回单
	 */
	UploadReceipt(11);

	private int value;

	private MbDispatchInfoStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public static MbDispatchInfoStatus indexOf(int value) {
		for (MbDispatchInfoStatus item : MbDispatchInfoStatus.values()) {
			if (item.value == value) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 MbDispatchInfoStatus 不支持整型值 " + value);
	}

	public static MbDispatchInfoStatus nameOf(String name) {
		for (MbDispatchInfoStatus item : MbDispatchInfoStatus.values()) {
			if (item.toString().equals(name)) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 MbDispatchInfoStatus 不支持字面值 " + name);
	}

}
