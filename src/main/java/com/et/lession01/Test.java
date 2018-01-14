package com.et.lession01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * FileSystemXmlApplicationContext从文件系统中找xml文件
 * ClassPathXmlApplicationContext 从类路径下找
 * GenericXmlApplicationContext 通用相当于ClassPathXmlApplicationContext
 * 就近原则 所以的ApplicationContext指令 都支持字符串查找方式
 * classpath
 * file
 * @author Administrator
 *
 */

public class Test {
	public static void main(String[] args) {
		//创建容器对象
		ApplicationContext context=new FileSystemXmlApplicationContext("E:\\spring.xml");
		A a=(A)context.getBean("a"); 
		System.out.println(a);
		A b=(A)context.getBean("b");
		System.out.println(b);
		System.out.println(a==b);
	
		String[] str=context.getBeanDefinitionNames();
		for (String temp : str) {
			System.out.println(temp);
		}
	
	}
}
