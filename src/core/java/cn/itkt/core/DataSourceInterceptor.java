package cn.itkt.core;

import org.aspectj.lang.JoinPoint;

public class DataSourceInterceptor {

	public void setdataSourceMysql(JoinPoint jp) {
		System.out.println("已经拦截sssssssssssssssssssssssssssssssssssdataSourceMySql");
		 CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_MYSQL);
	}
	public void setdataSourceMysql1(JoinPoint jp) {
		System.out.println("已经拦截sssssssssssssssssssssssssssssssssssdataSourceOracle");
		 CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_ORACLE);
	}
	public void setdataSourceMysqlII(JoinPoint jp) {
		System.out.println("base拦截sssssssssssssssssssssssssssssssssssdataSourceMySql");
		CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_MYSQL);
	}
	public void setdataSourceMysql1II(JoinPoint jp) {
		System.out.println("base拦截sssssssssssssssssssssssssssssssssssdataSourceOracle");
		CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_ORACLE);
	}
	
}