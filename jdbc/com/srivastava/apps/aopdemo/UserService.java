package com.srivastava.apps.aopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

	@Autowired
	private MyDAO myDAO;
	@Override
	public String add(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return myDAO.addRecord(userDTO)?"Register SuccessFully":"Problem in Register";
		
	}

	@Override
	public String read(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return myDAO.readRecord(userDTO)?"Welcome"+userDTO.getUserid():"Invalid Userid or Password";
	}
	
}
