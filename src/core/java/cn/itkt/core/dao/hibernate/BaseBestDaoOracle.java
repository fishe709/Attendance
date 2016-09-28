package cn.itkt.core.dao.hibernate;

import org.aspectj.lang.JoinPoint;

import cn.itkt.core.CustomerContextHolder;
import cn.itkt.core.dao.IBaseBestDaoOracle;

public class BaseBestDaoOracle implements IBaseBestDaoOracle {
	public void setdataSourceMysql1(JoinPoint jp) {
		System.out.println("sssssssssssssssssssssssssssssssssssdataSourceOracle");
		 CustomerContextHolder.setCustomerType(CustomerContextHolder.SESSION_FACTORY_ORACLE);
	}
}
