package com.et.lession01_autowire;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * spring ���Զ�װ��
 * @author Administrator
 *
 */

public class TestCotainer {
	public static void main(String[] args) {
		//������������
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession01_autowire/spring.xml");
		B b=(B)context.getBean("b");
		System.out.println(b.getA().size());
	}
}
