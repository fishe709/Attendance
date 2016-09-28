package cn.itkt.core.interceptor;

import java.util.Map;
import java.util.Map.Entry;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;

import cn.itkt.core.exception.BaseRuntimeException;
import cn.itkt.core.exception.ErrorInfo;
import cn.itkt.core.exception.IException;

/**
 * 类: ExceptionInterceptor <br>
 * 描述: 异常拦截器 <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-1-24 上午10:04:11
 */
public class ExceptionInterceptor {

	/** 包与errorCode映射Map key：包名，value：errorCode */
	@Resource
	private Map<String, String> packageMap;

	/**
	 * 方法: doAfterThrowing <br>
	 * 描述: 异常处理 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-24 上午10:03:12
	 * @param jp 连接点对象
	 * @param e 异常对象
	 */
	public void doAfterThrowing(JoinPoint jp, Exception e) {
		if (!hasErrorCode(e)) {
			String exPackageName = jp.getTarget().getClass().getPackage().getName();
			String errorCode = getPackageErrorCode(exPackageName);
			if (errorCode != null) {
				throw new BaseRuntimeException(errorCode, e);
			}
		}
	}

	/**
	 * 方法: isPackageErrorCode <br>
	 * 描述: 是否含有错误码 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-24 上午10:03:18
	 * @param e 异常对象
	 * @return 布尔值
	 */
	private boolean hasErrorCode(Exception e) {
		boolean flag = false;
		if (e instanceof IException) {
			IException exception = (IException) e;
			if (!exception.getError().getName().equals(ErrorInfo.ERRORCODE_DEFAULT)) {
				flag = true;
			}
		}
		return flag;
	}

	/**
	 * 方法: getPackageErrorCode <br>
	 * 描述: 获取包的错误码，没有则返回null <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-24 上午10:03:20
	 * @param exPackageName 抛出异常的类所在的包名
	 * @return 错误码
	 */
	private String getPackageErrorCode(String exPackageName) {
		if (exPackageName != null) {
			for (Entry<String, String> entry : packageMap.entrySet()) {
				if (exPackageName.startsWith(entry.getKey())) {
					return entry.getValue();
				}
			}
		}
		return null;
	}
}