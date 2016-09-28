package cn.itkt.core.util;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 类: ApplicationContextUtil <br>
 * 描述: Spring ApplicationContext工具类 <br>
 * 作者: 王鹏 wangpeng@itkt.com <br>
 * 时间: 2013-5-14 下午3:05:10
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

	private static ApplicationContextUtil util;

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	@PostConstruct
	protected void init() {
		util = this;
		util.applicationContext = this.applicationContext;
	}

	@PreDestroy
	protected void destroy() {
		applicationContext = null;
	}

	/**
	 * 方法: getApplicationContext <br>
	 * 描述: 获取ApplicationContext <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-3-5 下午3:48:38
	 * @return ApplicationContext对象
	 */
	public static ApplicationContext getApplicationContext() {
		return util.applicationContext;
	}

	/**
	 * 方法: getBean <br>
	 * 描述: 从ApplicationContext中获取Bean <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-3-5 下午3:45:42
	 * @param name Bean名称
	 * @return Bean实例化对象
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		return (T) util.applicationContext.getBean(name);
	}

	/**
	 * 方法: getBean <br>
	 * 描述: 从ApplicationContext中获取Bean <br>
	 * 作者: 王鹏 wangpeng@itkt.com <br>
	 * 时间: 2013-3-5 下午3:46:23
	 * @param requiredType Bean数据类型
	 * @return Bean实例化对象
	 */
	public static <T> T getBean(Class<T> requiredType) {
		return util.applicationContext.getBean(requiredType);
	}
}
