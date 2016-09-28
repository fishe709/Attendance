package cn.itkt.core.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.aspectj.lang.JoinPoint;

import cn.itkt.core.CustomerContextHolder;

/**
 * 数据库访问操作对象
 * @author Wang
 * @param <T> 实体类
 * @param <PK> 主键类型
 */
public interface IBaseBestDaoMysql{
	public void setdataSourceMysql(JoinPoint jp);
}
