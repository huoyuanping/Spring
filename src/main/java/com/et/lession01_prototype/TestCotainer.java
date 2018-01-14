package com.et.lession01_prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.et.lession01_autowire.B;


public class TestCotainer {
	public static void main(String[] args) {
		//创建容器对象
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession01_prototype/spring.xml");
		A a=(A)context.getBean("a");
		A a1=(A)context.getBean("a");
		System.out.println(a==a1);//true 单例
		//scope="prototype"多例
		System.out.println(a==a1);//false


	}
}
