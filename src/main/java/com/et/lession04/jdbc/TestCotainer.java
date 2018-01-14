package com.et.lession04.jdbc;

import java.sql.Connection;
import java.sql.SQLException;


import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ���ʽ����
 * ����ʽ�������ã�
 * xml������ȫ�֣�
 * ע������
 *
 */
public class TestCotainer {

	static DataSource dataSource;
	static Connection con;
	static{
		//������������
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession04/jdbc/spring.xml");
		dataSource=(DataSource)context.getBean("dataSource");

	}
	public static void main(String[] args) throws SQLException {
		try {
			//ǰ��֪ͨ
			 con=dataSource.getConnection();
			 //����Ϊ�ֶ��ύ
			 con.setAutoCommit(false);
			 //ҵ���߼�
			 //jdbcĬ���Զ��ύ
			 aminus(10);
			 int i=5/0;
			 badd(10);
			 //����֪ͨ
			 con.commit();
		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
		}finally{
			con.close();
		}
		
	}
	/**
	 * ��Ǯ
	 * @param money
	 * @throws SQLException
	 */
	 public static void aminus(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where username='A'";
		 con.prepareStatement(sql).executeUpdate();
	 }
	/**
	 * ��Ǯ
	 * @param money
	 * @throws SQLException
	 */
	 public static void badd(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where username='A'";
		 con.prepareStatement(sql).executeUpdate();
	 }
}
