package com.et.lession01_homework;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyFactory {
	public static void main(String[] args) {
		//������������
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession01_homework/spring.xml");
		//��ȡ����
		Connection con=context.getBean("con",Connection.class);
		System.out.println(con);
		
		
	}
}
