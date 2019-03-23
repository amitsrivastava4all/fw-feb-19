package com.srivastava.apps.aopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

@Repository
public class MyDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean addRecord(UserDTO userDTO){
			int recordUpdatedCount = jdbcTemplate.update("insert into users (userid , password) values(?,?)", userDTO.getUserid(), userDTO.getPassword());
			return recordUpdatedCount>0;
	}
	public boolean readRecord(UserDTO userDTO) {
		Object params [] = {userDTO.getUserid(), userDTO.getPassword()};
		UserDTO userObject = jdbcTemplate.queryForObject("select userid, password from users where userid=? and password=?",params, new UserRowMapper());
		return userObject!=null; 
	}

	
	
	
	
	
		
}
