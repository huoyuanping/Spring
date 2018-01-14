package com.et.lession02.jdbc;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * spring 的生命周期
 * @author Administrator
 *
 */

public class TestCotainer {

	static JdbcTemplate jt;
	
	static{
		//创建容器对象
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/com/et/lession02/jdbc/spring.xml");
		jt=(JdbcTemplate)context.getBean("jdbcTemplate");

	}
	public static void main(String[] args) throws SQLException {
		
		
		query("SELECT * FROM goods");
		//update();
		
	}
	/**
	 * 查询方法
	 * @param sql
	 * @return
	 */
	public static void query(String sql){
		List<Map<String, Object>> list=jt.queryForList(sql);
		System.out.println(list);
	}
	
	public static void update(){
		String sql="delete from goods  where id=1";
		jt.execute(sql);
	}
}
