package com.et.lession04.testm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.et.lession04.testm.dao.AdaoImpl;

/**
 * ���ʽ����
 * ����ʽ�������ã�
 * xml������ȫ�֣�
 * ע������
 *
 */
public class Test {

	static AdaoImpl Dao;

	static{
		//������������
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession04/testm/spring.xml");
		Dao=(AdaoImpl)context.getBean("adaoImpl");

	}
	public static void main(String[] args) throws Exception {
		Dao.updateAminus(10);
	
		
	}

}
