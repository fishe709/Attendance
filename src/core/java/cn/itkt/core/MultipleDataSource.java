package cn.itkt.core;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
 
/**
 * <b>function:</b> Spring  多数据源实现
 * @author hoojo
 * @createDate 2013-9-27 上午11:24:53
 * @file MultipleDataSource.java
 * @package com.hoo.framework.spring.support
 * @project SHMB
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
 
    @Override
    protected Object determineCurrentLookupKey() {
        return CustomerContextHolder.getCustomerType();
    }
}
