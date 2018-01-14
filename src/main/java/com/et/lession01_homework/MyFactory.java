package com.et.lession01_homework;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyFactory {
	public static void main(String[] args) {
		//创建容器对象
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession01_homework/spring.xml");
		//获取连接
		Connection con=context.getBean("con",Connection.class);
		System.out.println(con);
		
		
	}
}
