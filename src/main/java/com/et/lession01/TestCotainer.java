package com.et.lession01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCotainer {
	public static void main(String[] args) {
		//创建容器对象
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		A a=(A)context.getBean("a");
		System.out.println(a);
		A b=(A)context.getBean("b");
		System.out.println(b);
		System.out.println(a==b);
		//获取B的实例 （没有名字的时候）类的方式只能有一个
	/*	B bi=context.getBean(B.class);
		System.out.println(bi);*/
		//字符串的方式可以取多个但是只能取到第一个
		B b1=(B)context.getBean("com.et.lession01.B");
		System.out.println(b1);
		//获取名字没有指定id的类 默认名字是 #号
		String[] str=context.getBeanDefinitionNames();
		for (String temp : str) {
			System.out.println(temp);
		}
	
	}
}
