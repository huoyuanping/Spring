package com.et.lession04.jdbc;

import java.sql.Connection;
import java.sql.SQLException;


import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.et.lession04.jdbc.dao.MyMoneyDao;

/**
 * ���ʽ����
 * ����ʽ�������ã�
 * xml������ȫ�֣�
 * ע������
 *
 */
public class Test {

	static MyMoneyDao myMoneyDao;

	static{
		//������������
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession04/jdbc/spring.xml");
		myMoneyDao=(MyMoneyDao)context.getBean("myMoneyDaoImpl");

	}
	public static void main(String[] args) throws SQLException {
		myMoneyDao.updateAminus(10);
		int i=5/0;
		myMoneyDao.updateBbadd(10);
		
	}

}
