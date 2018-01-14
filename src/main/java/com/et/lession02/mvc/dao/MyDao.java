package com.et.lession02.mvc.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * 持久层（连接数据库）
 * @author Administrator
 *
 */
@Repository
public class MyDao {
	//自动装配
	@Autowired
	private JdbcTemplate template;
	public List<Map<String, Object>> queryMyResult(String sql){
		return template.queryForList(sql);
	}
}
