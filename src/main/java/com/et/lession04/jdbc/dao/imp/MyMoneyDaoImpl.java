package com.et.lession04.jdbc.dao.imp;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.et.lession04.jdbc.dao.MyMoneyDao;
@Repository
public class MyMoneyDaoImpl implements MyMoneyDao {
	/**
	 * ¿ÛÇ®
	 * @param money
	 * @throws SQLException
	 */
	@Autowired
	JdbcTemplate jdbc;
	
	public  void updateAminus(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where username='A'";
		 jdbc.execute(sql);
	 }
	
	 public void updateBbadd(int money) throws SQLException{
		 String sql="update mymoney set lostedmoney=lostedmoney+"+money+" where username='B'";
		 jdbc.execute(sql);
	 }

	
}
