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
	 * ��Ǯ
	 * @param money
	 * @throws SQLException
	 */
	public  void updateAminus(int money) throws Exception{
		//��Ǯ
		 String sql="update mymoney set lostedmoney=lostedmoney-"+money+" where id=1";
		 jdbc.execute(sql);
		 //��Ǯ
		 b.saveBadd(money);
		 //int i=5/0;
		 //����ʱ�쳣(�Զ��ع�)
		 throw new RuntimeException();
		 //������ʱ�쳣(����ع�)
		// throw new FileNotFoundException();
	 }
}
