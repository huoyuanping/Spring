package com.et.lession04.jdbc.dao;

import java.sql.SQLException;

public interface MyMoneyDao {

	void updateAminus(int money) throws SQLException;

	/**
	 * ��Ǯ
	 * @param money
	 * @throws SQLException
	 */
	void updateBbadd(int money) throws SQLException;

}