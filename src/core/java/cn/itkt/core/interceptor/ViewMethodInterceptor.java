package cn.itkt.core.interceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import cn.itkt.core.exception.ErrorInfo;
import cn.itkt.core.exception.IException;
import cn.itkt.core.util.BeanUtil;
import cn.itkt.core.util.ClassUtil;
import cn.itkt.hotel.util.CommonDataUtil;
import cn.itkt.hotel.vo.BaseVo;

/**
 * 类: ViewMethodInterceptor <br>
 * 描述: 表现层方法拦截器 <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-1-28 上午10:22:39
 */
public class ViewMethodInterceptor {

	private static final Logger logger = Logger.getLogger(ViewMethodInterceptor.class);

	/** 方法状态Map */
	private static Map<String, MethodState> methodStateMap = new ConcurrentHashMap<String, MethodState>();

	/** 方法超时时间 */
	private long methodTimeout;

	/**
	 * 方法: doBefore <br>
	 * 描述: 前置拦截 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-28 上午10:23:37
	 * @param jp 连接点对象
	 */
	public void doBefore(JoinPoint jp) {
		MethodSignature methodSignature = (MethodSignature) jp.getSignature();
		String className = methodSignature.getDeclaringTypeName();
		String methodName = methodSignature.getName();
		String[] parameterNames = methodSignature.getParameterNames();
		Object[] parameters = jp.getArgs();

		StringBuffer sb = new StringBuffer();
		sb.append("请求类名: ");
		sb.append(className);
		sb.append("; 请求方法名: ");
		sb.append(methodName);
		sb.append("; 方法请求参数: ");

		for (int i = 0; i < parameters.length; i++) {
			Object parameter = parameters[i];
			if (parameter != null && ClassUtil.isCustom(parameter.getClass())) {
				sb.append(BeanUtil.beanToString(parameter));
			} else {
				sb.append(parameterNames[i]).append(": ").append(parameter);
			}
			if (i < parameters.length - 1) {
				sb.append(", ");
			}
		}
		logger.info(sb.toString());
	}

	/**
	 * 方法: doAround <br>
	 * 描述: 环绕拦截 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-28 上午10:24:45
	 * @param pjp 方法连接点对象
	 * @return 方法返回值
	 * @throws Throwable 方法异常对象
	 */
	public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
		Object result = null;
		long startTime = System.currentTimeMillis();
		try {
			result = pjp.proceed();
			parseBaseVo(result);
		} catch (Exception e) {
			logging(e);
			result = ((MethodSignature) pjp.getSignature()).getReturnType().newInstance();
			parseBaseVo(result, e);
		} finally {
			long endTime = System.currentTimeMillis();
			String methodLongName = pjp.getSignature().toLongString();
			methodRunState(methodLongName, endTime - startTime);
			CommonDataUtil.clear();
		}
		return result;
	}

	/**
	 * 方法: setMethodTimeout <br>
	 * 描述: 设置方法执行超时时间 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-28 上午10:27:12
	 * @param methodTimeout 方法超时时间
	 */
	public void setMethodTimeout(long methodTimeout) {
		this.methodTimeout = methodTimeout;
	}

	private void logging(Exception e) {
		if (e instanceof IException) {
			if (!((IException) e).isLogLevel()) {
				logger.info(e.getMessage());
				return;
			}
		}
		logger.error(e.getMessage(), e);
	}

	/**
	 * 方法: parseBaseVo <br>
	 * 描述: 处理BaseVo对象 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-28 下午03:23:30
	 * @param result 返回值
	 */
	private void parseBaseVo(Object result) {
		this.parseBaseVo(result, null);
	}

	/**
	 * 方法: parseBaseVo <br>
	 * 描述: 处理BaseVo对象 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-28 下午01:34:12
	 * @param result 返回值
	 * @param e 异常对象
	 */
	private void parseBaseVo(Object result, Exception e) {
		if (result instanceof BaseVo) {
			BaseVo baseVo = (BaseVo) result;
			if (e != null) {
				if (e instanceof IException) {
					baseVo.setStatusCode(((IException) e).getErrorCode());
				} else {
					baseVo.setStatusCode(ErrorInfo.ERRORCODE_FAIL);
				}
				baseVo.setMessage(e.getMessage());
			} else {
				if (baseVo.getStatusCode() == null) {
					baseVo.setStatusCode(ErrorInfo.ERRORCODE_SUCCESS);
					baseVo.setMessage(ErrorInfo.getMessage(ErrorInfo.ERRORCODE_SUCCESS));
				}
			}
		}
	}

	/**
	 * 方法: methodRunState <br>
	 * 描述: 记录方法执行状态 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-28 上午10:26:01
	 * @param methodLongName 方法完整名称
	 * @param runTime 运行时间
	 */
	private void methodRunState(String methodLongName, long runTime) {
		MethodState state = methodStateMap.get(methodLongName);
		if (state == null) {
			state = new MethodState(methodLongName);
			methodStateMap.put(methodLongName, state);
		}

		synchronized (state) {
			state.count++;
			state.totalTime += runTime;

			if (runTime > state.maxTime) {
				state.maxTime = runTime;
			}

			if (runTime < methodTimeout) {
				long avgTime = state.totalTime / state.count;
				logger.info("method: " + methodLongName + "(), 方法执行次数 = " + state.count + ", 执行时间 = " + runTime + ", 平均执行时间 = " + avgTime
						+ ", 最大执行时间 = " + state.maxTime);
			} else {
				long avgTime = state.totalTime / state.count;
				logger.warn("method: " + methodLongName + "(), 方法执行次数 = " + state.count + ", 执行时间 = " + runTime + ", 平均执行时间 = " + avgTime
						+ ", 最大执行时间 = " + state.maxTime);
			}
		}
	}

	/**
	 * 类: MethodStats <br>
	 * 描述: 方法状态监控 <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-1-25 上午11:19:46
	 */
	class MethodState {
		/** 方法名称 */
		public String methodName;
		/** 总调用次数 */
		public long count;
		/** 总执行时间 */
		public long totalTime;
		/** 执行最大时间 */
		public long maxTime;

		/**
		 * 标题: 构造器 <br>
		 * 描述: 方法状态监控构造器<br>
		 * 作者: 王鹏 wangpeng@itkt.com<br>
		 * 时间: 2013-1-25 上午11:19:33
		 * @param methodName 方法名称
		 */
		public MethodState(String methodName) {
			this.methodName = methodName;
		}
	}
}
