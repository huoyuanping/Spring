package com.et.lession01_ioc_di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.et.lession01.A;
import com.et.lession01.B;

public class TestCotainer {
	public static void main(String[] args) {
		//创建容器对象
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession01_ioc_di/spring.xml");
	
		A a=(A)context.getBean("a1");
		System.out.println(a);
		System.out.println(a.getName());
		B b=(B)context.getBean("b");
		System.out.println(b.getA().getName());
		
		C c=(C)context.getBean("c");
		System.out.println(c.getB().getA().getName());
		System.out.println(c.getId()+"---"+c.getName());

	}
}
