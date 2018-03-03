package com.yuzf.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class TxDao {

	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	//不写业务
	
	//出账
	public void giveMoney() {
		String sql = "update account set salary = salary+? where username = ?";
		jdbcTemplate.update(sql, -1000,"james");
	}
	
	
	//进账
	public void getMoney() {
		String sql = "update account set salary = salary+? where username = ?";
		jdbcTemplate.update(sql, 1000,"harden");
		
	}
}
