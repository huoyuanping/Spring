package com.et.lession02.cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring ����������
 * @author Administrator
 *
 */

public class TestCotainer {

	static ConfigurableApplicationContext context;
	
	static{
		//������������
		 context=new ClassPathXmlApplicationContext("classpath:/com/et/lession02/cycle/spring.xml");
	
	}
	public static void main(String[] args) {
		context.close();
	}
}
