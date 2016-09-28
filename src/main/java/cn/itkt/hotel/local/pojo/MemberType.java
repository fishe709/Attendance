package cn.itkt.hotel.local.pojo;

import cn.itkt.core.exception.UnsupportedValueException;

public enum MemberType {

	/**
	 * 司机类型 0
	 */
	Driver("0"),
	
	/**
	 * 仓管类型 1
	 */
	Keeper("1");

	private String value;

	private MemberType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static MemberType indexOf(String value) {
		for (MemberType item : MemberType.values()) {
			if (item.value == value) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 MemberType 不支持整型值 " + value);
	}

	public static MemberType nameOf(String name) {
		for (MemberType item : MemberType.values()) {
			if (item.toString().equals(name)) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 MemberType 不支持字面值 " + name);
	}

}
