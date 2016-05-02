package com.zhaojun.log4jtest;

import org.apache.log4j.Logger;

public class Log4jTest {
	public static void main(String[] args){
		//Logger.getLogger(String name)返回该name的一个日志记录器的引用，如果没有，则创建一个返回
		Logger logger = Logger.getLogger(Log4jTest.class.getName());		
		logger.debug("debug");
		logger.error("error");
		logger.fatal("fatal");
		logger.info("info");
	}
}
