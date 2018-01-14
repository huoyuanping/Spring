package com.et.lession01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCotainer {
	public static void main(String[] args) {
		//������������
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		A a=(A)context.getBean("a");
		System.out.println(a);
		A b=(A)context.getBean("b");
		System.out.println(b);
		System.out.println(a==b);
		//��ȡB��ʵ�� ��û�����ֵ�ʱ����ķ�ʽֻ����һ��
	/*	B bi=context.getBean(B.class);
		System.out.println(bi);*/
		//�ַ����ķ�ʽ����ȡ�������ֻ��ȡ����һ��
		B b1=(B)context.getBean("com.et.lession01.B");
		System.out.println(b1);
		//��ȡ����û��ָ��id���� Ĭ�������� #��
		String[] str=context.getBeanDefinitionNames();
		for (String temp : str) {
			System.out.println(temp);
		}
	
	}
}
