package com.srivastava.apps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.srivastava.apps.UserModel;

public class UserRowMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserModel userModel = new UserModel();
		userModel.setUserid(rs.getString("userid"));
		userModel.setPwd(rs.getString("password"));
		return userModel;
	}

}
