package cn.itkt.hotel.local.pojo.sysmsg;

import cn.itkt.core.exception.UnsupportedValueException;

public enum SysMsgStatus {

	/**
	 * 未处理 0
	 */
	UnProcessed(0),

	/**
	 * 已处理 1
	 */
	Processed(1);

	private int value;

	private SysMsgStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public static SysMsgStatus indexOf(int value) {
		for (SysMsgStatus item : SysMsgStatus.values()) {
			if (item.value == value) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 SysMsgStatus 不支持整型值 " + value);
	}

	public static SysMsgStatus nameOf(String name) {
		for (SysMsgStatus item : SysMsgStatus.values()) {
			if (item.toString().equals(name)) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 SysMsgStatus 不支持字面值 " + name);
	}

}
