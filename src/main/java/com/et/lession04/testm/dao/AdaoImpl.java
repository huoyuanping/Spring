package com.et.lession04.testm.dao;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AdaoImpl {
	
	@Autowired
	JdbcTemplate jdbc;
	@Autowired
	BdaoImpl b;
	/**
	 * 扣钱
	 * @param money
	 * @throws SQLException
	 */
	public  void updateAminus(int money) throws Exception{
		//扣钱
		 String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where id=1";
		 jdbc.execute(sql);
		 //加钱
		 b.saveBadd(money);
		 //int i=5/0;
		 //运行时异常(自动回滚)
		 throw new RuntimeException();
		 //非运行时异常(不会回滚)
		// throw new FileNotFoundException();
	 }
}
