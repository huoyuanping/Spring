package com.et.lession02.cycle;

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
		 context=new ClassPathXmlApplicationContext("classpath:/com/et/lession02/cycle/spring.xml");
	
	}
	public static void main(String[] args) {
		context.close();
	}
}
