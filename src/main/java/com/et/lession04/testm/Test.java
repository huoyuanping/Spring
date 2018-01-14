package com.et.lession04.testm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.et.lession04.testm.dao.AdaoImpl;

/**
 * 编程式事务
 * 声明式事务（配置）
 * xml声明（全局）
 * 注解声明
 *
 */
public class Test {

	static AdaoImpl Dao;

	static{
		//创建容器对象
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession04/testm/spring.xml");
		Dao=(AdaoImpl)context.getBean("adaoImpl");

	}
	public static void main(String[] args) throws Exception {
		Dao.updateAminus(10);
	
		
	}

}
