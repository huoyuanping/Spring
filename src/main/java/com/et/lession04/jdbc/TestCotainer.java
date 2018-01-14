package com.et.lession04.jdbc;

import java.sql.Connection;
import java.sql.SQLException;


import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 编程式事务
 * 声明式事务（配置）
 * xml声明（全局）
 * 注解声明
 *
 */
public class TestCotainer {

	static DataSource dataSource;
	static Connection con;
	static{
		//创建容器对象
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession04/jdbc/spring.xml");
		dataSource=(DataSource)context.getBean("dataSource");

	}
	public static void main(String[] args) throws SQLException {
		try {
			//前置通知
			 con=dataSource.getConnection();
			 //设置为手动提交
			 con.setAutoCommit(false);
			 //业务逻辑
			 //jdbc默认自动提交
			 aminus(10);
			 int i=5/0;
			 badd(10);
			 //后置通知
			 con.commit();
		} catch (Exception e) {
			con.rollback();
			e.printStackTrace();
		}finally{
			con.close();
		}
		
	}
	/**
	 * 扣钱
	 * @param money
	 * @throws SQLException
	 */
	 public static void aminus(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where username='A'";
		 con.prepareStatement(sql).executeUpdate();
	 }
	/**
	 * 加钱
	 * @param money
	 * @throws SQLException
	 */
	 public static void badd(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where username='A'";
		 con.prepareStatement(sql).executeUpdate();
	 }
}
