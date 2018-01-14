package com.et.lession04.testm.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BdaoImpl {
	
	@Autowired
	JdbcTemplate jdbc;
	/**
	 * ¿ÛÇ®
	 * @param money
	 * @throws SQLException
	 */
	public  void saveBadd(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where id=2";
		 jdbc.execute(sql);
	 }
}
