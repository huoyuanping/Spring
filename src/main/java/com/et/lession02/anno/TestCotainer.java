package com.et.lession02.anno;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestCotainer {

	static ConfigurableApplicationContext context;
	
	static{
		//������������
		 context=new ClassPathXmlApplicationContext("classpath:/com/et/lession02/anno/spring.xml");
	
	}
	public static void main(String[] args) {
		A a=(A)context.getBean("abc");
		System.out.println(a);
		context.close();
	}
}
