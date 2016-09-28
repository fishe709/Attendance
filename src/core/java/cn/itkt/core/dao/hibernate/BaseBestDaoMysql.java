package cn.itkt.core.dao.hibernate;

import org.aspectj.lang.JoinPoint;

import cn.itkt.core.CustomerContextHolder;
import cn.itkt.core.dao.IBaseBestDaoMysql;

public class BaseBestDaoMysql implements IBaseBestDaoMysql {
	public void setdataSourceMysql(JoinPoint jp) {
		System.out.println("sssssssssssssssssssssssssssssssssssdataSourceMySql");
		 CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_MYSQL);
	}
}
