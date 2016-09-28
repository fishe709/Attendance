package cn.itkt.hotel.util;

import java.util.UUID;
/**
 * 
 * @author wangjinkui
 * 2014-12-6 下午03:18:25
 */
public class SerialNumberUtil {
	/**
	 * 获得一个UUID
	 * 
	 * @return String UUID
	 */
	public static String getId() {
		String uuId = UUID.randomUUID().toString();
		return uuId;
	}

	/**
	 * 获得指定数目的UUID
	 * 
	 * @param number
	 *            int 需要获得的UUID数量
	 * @return String[] UUID数组
	 */
	public static String[] getId(int number) {
		if (number < 1) {
			return null;
		}
		String[] ss = new String[number];
		for (int i = 0; i < number; i++) {
			ss[i] = getId();
		}
		return ss;
	}

	public static void main(String[] args) {
		System.out.println(getId().length());
/*		String[] ss = getId(10);
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}*/
	}
}
