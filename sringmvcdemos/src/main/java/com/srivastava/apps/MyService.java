package com.srivastava.apps;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public String[] getRoles() {
		String roles [] = {"admin","guest","clerk"};
		return roles;
	}
}
