package cn.itkt.core.exception;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;

import cn.itkt.core.factory.PropertiesFactory;

public class ErrorInfo {

	public static final String ERRORCODE_DEFAULT = "default";

	public static final String ERRORCODE_SUCCESS = "0";

	public static final String ERRORCODE_FAIL = "fail";

	/** 国际化信息源 */
	private static MessageSource messageSource;

	private static PropertiesFactory propertiesFactory;

	private static final String INFO_PREFIX = "info:";

	private String name;

	private int level;

	private boolean isInfo;

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	protected void setLevel(int level) {
		this.level = level;
	}

	public boolean isInfo() {
		return isInfo;
	}

	protected void setInfo(boolean isInfo) {
		this.isInfo = isInfo;
	}

	@Resource
	protected final void setMessageSource(MessageSource messageSource) {
		ErrorInfo.messageSource = messageSource;
	}

	@Resource
	protected final void setPropertiesFactory(PropertiesFactory propertiesFactory) {
		ErrorInfo.propertiesFactory = propertiesFactory;
	}

	public static ErrorInfo initError(String errorCode) {
		ErrorInfo error = null;

		// info：前缀处理
		if (errorCode.startsWith(INFO_PREFIX)) {
			return createErrorInfo(errorCode.substring(INFO_PREFIX.length()), -1, true);
		}
		// 原始默认Exception处理(抛出异常时没有message)
		if (errorCode.equals(ERRORCODE_DEFAULT)) {
			return createErrorInfo(ERRORCODE_DEFAULT, ErrorInfo.getPrintLevel(), false);
		}

		// 在配异常资源文件中找不到则为原始默认Exception
		try {
			messageSource.getMessage(errorCode, null, Locale.CHINA);
		} catch (Exception e) {
			return createErrorInfo(ERRORCODE_DEFAULT, ErrorInfo.getPrintLevel(), false);
		}

		String errorName = errorCode.substring(0, errorCode.indexOf("-"));
		Set<ErrorInfo> errors = new HashSet<ErrorInfo>();
		String[] errorObjs = propertiesFactory.getResolvedProps().get("error").split(",");

		for (String errorObj : errorObjs) {
			String[] errorInfos = errorObj.split("@");
			ErrorInfo errorTmp = new ErrorInfo();
			errorTmp.setName(errorInfos[0]);
			errorTmp.setLevel(Integer.parseInt(errorInfos[1]));
			errors.add(errorTmp);
		}

		for (ErrorInfo errorTmp : errors) {
			if (errorTmp.getName().equals(errorName)) {
				error = errorTmp;
				break;
			}
		}

		if (error == null) {
			throw new RuntimeException("config.properties文件error配置有误");
		}
		return error;
	}

	public static String getMessage(String errorCode) {
		return getMessage(errorCode, null, Locale.CHINA);
	}

	public static String getMessage(String errorCode, Object[] args, Locale locale) {
		String message = null;
		try {
			message = messageSource.getMessage(errorCode, args, locale);
		} catch (Exception e) {
			if (errorCode.startsWith(INFO_PREFIX)) {
				message = errorCode.substring(INFO_PREFIX.length());
			}
		}
		return message;
	}

	public static int getPrintLevel() {
		return Integer.parseInt(propertiesFactory.getResolvedProps().get("printLevel"));
	}

	public static int getLogLevel() {
		return Integer.parseInt(propertiesFactory.getResolvedProps().get("logLevel"));
	}

	private static ErrorInfo createErrorInfo(String name, int level, boolean isInfo) {
		ErrorInfo error = new ErrorInfo();
		error.setName(name);
		error.setLevel(level);
		error.setInfo(isInfo);
		return error;
	}
}
