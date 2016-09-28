package cn.itkt.core.dao.persistence;

import java.util.HashMap;
import java.util.Map;

import cn.itkt.core.dao.IBaseDaoIII;

/**
 * 缓存
 * @author chenqiushi
 *
 */
public class Daos {
	private static Map<String, IBaseDaoIII> daos = new HashMap<String, IBaseDaoIII>();
	public static void put(IBaseDaoIII dao, String type) {
		daos.put(type, dao);
	}
	public static IBaseDaoIII get(String type) {
		return daos.get(type);
	}
}
