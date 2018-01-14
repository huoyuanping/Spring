package com.et.lession03.aop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * spring 的生命周期
 * @author Administrator
 *
 */

public class TestCotainer {

	static ConfigurableApplicationContext context;
	
	static{
		//创建容器对象
		 context=new ClassPathXmlApplicationContext("classpath:/com/et/lession03/aop/spring.xml");
	
	}
	public static void main(String[] args) {
		AfHouseOwner ho=(AfHouseOwner)context.getBean("afHouseOwner");
		ho.seekMyHouse();
		context.close();
	}
}
