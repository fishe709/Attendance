package cn.itkt.core;

public class DBContextHolder{
	public static final String DATA_SOURCE_FROM = "dataSourceMySql";
	public static final String DATA_SOURCE_TO = "dataSourceMySql1";
	
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	
	public static void setDBType(String dbType) {
		contextHolder.set(dbType);
	}
	
	public static String getDBType() {
		return contextHolder.get();
	}
	
	public static void clearDBType() {
		contextHolder.remove();
	}
}
