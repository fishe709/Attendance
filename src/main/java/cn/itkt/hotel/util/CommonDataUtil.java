package cn.itkt.hotel.util;

public class CommonDataUtil {

	private static final ThreadLocal<CommonData> THREAD_LOCAL = new ThreadLocal<CommonData>();

	public static CommonData get() {
		return THREAD_LOCAL.get();
	}

	public static void set(CommonData commonData) {
		if (THREAD_LOCAL.get() == null) {
			THREAD_LOCAL.set(commonData);
		} else {
			throw new RuntimeException("同一线程中只能设置一次commonData");
		}
	}

	public static void clear() {
		THREAD_LOCAL.remove();
	}
}
