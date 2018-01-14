package com.et.lession01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * FileSystemXmlApplicationContext���ļ�ϵͳ����xml�ļ�
 * ClassPathXmlApplicationContext ����·������
 * GenericXmlApplicationContext ͨ���൱��ClassPathXmlApplicationContext
 * �ͽ�ԭ�� ���Ե�ApplicationContextָ�� ��֧���ַ������ҷ�ʽ
 * classpath
 * file
 * @author Administrator
 *
 */

public class Test {
	public static void main(String[] args) {
		//������������
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
