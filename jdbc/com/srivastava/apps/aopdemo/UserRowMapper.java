package com.srivastava.apps.aopdemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<UserDTO> {

	@Override
	public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(rs.getString("userid"));
		userDTO.setPassword(rs.getString("password"));
		return userDTO;
	}

}
