package cn.itkt.core.log;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

public class LogManager {
	
	public static final String LEVEL_INFO = "INFO";
	public static final String LEVEL_MAININFO = "MAININFO";
	public static final String LEVEL_ERROR = "ERROR";
	public static final String LEVEL_EXCEPTION = "EXCEPTION";
	public static final String MODULE_EXCEPTION = "SERVICE_EXCEPTION_IP" ;/*+TicketDictionary.LOCAL_IP;*/
		
	//酒店预订日志
	public static final String LEVEL_INFO_HOTEL = "HOTELINFO";
	public static final String LEVEL_EXCEPTION_HOTEL = "HOTELEXCEPTION";//异常信息

	
	//艺龙酒店预订日志
	public static final String EL_LEVEL_INFO_HOTEL = "EL_HOTELINFO";
	public static final String EL_LEVEL_EXCEPTION_HOTEL = "EL_HOTELEXCEPTION";//异常信息

	
	//神州租车
	public static final String LEVEL_INFO_RENTCAR = "RENTCARINFO";
	public static final String LEVEL_EXCEPTION_RENTCAR = "RENTCAREXCEPTION";//异常信息



	
	//海航
	public static final String LEVEL_INFO_HUTICKET = "HUTICKETINFO";
	public static final String LEVEL_EXCEPTION_HUTICKET = "HUTICKETEXCEPTION";//异常信息

	public static final String LEVEL_INFO_WEIXIAOYUAN = "WEIXIAOYUANINFO";
	public static final String LEVEL_EXCEPTION_WEIXIAOYUAN = "WEIXIAOYUANEXCEPTION";//异常信息


	private String curTime =null;
	private String logLevel = null;
	private String module = null;
	private String statusCode = null;
	private String description = null;
	public String getFormatLog(String curTime) {
		StringBuffer sb = new StringBuffer();
		sb.append(curTime);
		sb.append(", ");
		sb.append(this.logLevel);
		sb.append(", ");
		sb.append(this.module);
		sb.append(", ");
		sb.append(this.statusCode);
		sb.append(", ");
		sb.append(this.description);
		return sb.toString();
	}

	public void log() {
		try {
			log2Device(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void log2Device(LogManager log) throws IOException {
		String curTime = String.valueOf(new Timestamp(System.currentTimeMillis()));	
		log.setCurTime(curTime);
		String logingo = log.getFormatLog(curTime);
		String saveFilePath = "/data/tomcat7/webapps/web_logs/Album/";
		File file = new File(saveFilePath);
		if(!file.exists())
		{
			try {
				  file.mkdirs() ; 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        log2file(logingo, saveFilePath, log);

	}

	public static void log2file(String log, String saveFilePath, LogManager logObj) throws IOException {
		String LogFileRootPath = saveFilePath;
		LogFile.log(logObj, LogFileRootPath);	
	}

	public static void log(String level, String module, String statusCode,
			String description) {
		LogManager log = new LogManager();
		log.logLevel = level;
		log.module = module;
		log.statusCode = statusCode;
		log.description = description;
		log.log();
	}
	
	public static void logInfo(String statusCode, String description){
		LogManager.log(LogManager.LEVEL_INFO_WEIXIAOYUAN,LogManager.MODULE_EXCEPTION, statusCode, description);
	}
	
	public static void logExp(String statusCode, String description){
		LogManager.log(LogManager.LEVEL_EXCEPTION_WEIXIAOYUAN, LogManager.MODULE_EXCEPTION, statusCode, description);
	}
	
	public static void logMainInfo(String statusCode, String description) {
		LogManager.log(LogManager.LEVEL_MAININFO, LogManager.MODULE_EXCEPTION, statusCode, description);
	}
	
	public LogManager getLogger() {
		return new LogManager();
	}	
	
	public String getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCurTime() {
		return curTime;
	}

	public void setCurTime(String curTime) {
		this.curTime = curTime;
	}

}
