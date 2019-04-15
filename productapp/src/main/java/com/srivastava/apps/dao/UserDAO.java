package com.srivastava.apps.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.srivastava.apps.UserModel;

@Repository
public class UserDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public boolean add(UserModel userModel) {
		System.out.println("UserModel DAO "+userModel);
		int recordCount = jdbcTemplate.update("insert into user_mst (userid, password) values(?,?)",userModel.getUserid(),userModel.getPwd());
		return recordCount>0;
	}
	public boolean search(UserModel userModel) {
		UserModel userModelObj = jdbcTemplate.queryForObject("select userid, password from user_mst where userid=? and password=?"
				, new Object[] {userModel.getUserid(), userModel.getPwd()}, new UserRowMapper());
		if(userModelObj!=null) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
