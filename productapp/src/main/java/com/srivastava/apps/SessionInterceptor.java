package com.srivastava.apps;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class SessionInterceptor extends HandlerInterceptorAdapter {
@Override	
public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
	System.out.println("Pre Handle Called....");
	HttpSession session = request.getSession(false);
	if(session!=null) {
		if(session.getAttribute("userid")!=null) {
			return true;
		}
		else {
			response.sendRedirect("http://localhost:8080/productapp/");
		}
	}
	else {
		response.sendRedirect("http://localhost:8080/productapp/");
	}
	return false;
}

}
