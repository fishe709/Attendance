package cn.itkt.hotel.local.pojo.sysmsg;

import cn.itkt.core.exception.UnsupportedValueException;

public enum SysMsgType {

	/**
	 * 博客系统（调度订单消息） 0
	 */
	BOKE(0);

	private int value;

	private SysMsgType(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}

	public static SysMsgType indexOf(int value) {
		for (SysMsgType item : SysMsgType.values()) {
			if (item.value == value) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 SysMsgType 不支持整型值 " + value);
	}

	public static SysMsgType nameOf(String name) {
		for (SysMsgType item : SysMsgType.values()) {
			if (item.toString().equals(name)) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 SysMsgType 不支持字面值 " + name);
	}

}
