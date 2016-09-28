package cn.itkt.hotel.local.pojo;

import cn.itkt.core.exception.UnsupportedValueException;

public enum OriginApp {

	/**
	 * WEB
	 */
	WEB("WEB"),
	
	/**
	 * IOS
	 */
	IOS("IOS"),
	
	/**
	 * ANDROID
	 */
	ANDROID("ANDROID"),
	
	/**
	 * BOKE
	 */
	BOKE("BOKE");

	private String value;

	private OriginApp(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public static OriginApp indexOf(String value) {
		for (OriginApp item : OriginApp.values()) {
			if (item.value == value) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 OriginApp 不支持整型值 " + value);
	}

	public static OriginApp nameOf(String name) {
		for (OriginApp item : OriginApp.values()) {
			if (item.toString().equals(name)) {
				return item;
			}
		}
		throw new UnsupportedValueException("枚举类型 OriginApp 不支持字面值 " + name);
	}

}
