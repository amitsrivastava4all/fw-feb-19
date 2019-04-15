package com.srivastava.apps;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.srivastava.apps.dao.UserDAO;

@Controller
public class UserController {
	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String loadHome() {
			return "index";
	}
	@RequestMapping(value="/user")
	public String loadUser(Model model) {
		model.addAttribute("userModel",new UserModel());
		return "login";
	}
	@RequestMapping( method=RequestMethod.POST,params={"login=Login"})
	public ModelAndView doLogin(HttpServletRequest request, HttpSession session, @ModelAttribute("userModel") UserModel userModel) {
		System.out.println("Inside DoLogin "+userModel);
		ModelAndView mv = new ModelAndView();
		boolean isFound = userDAO.search(userModel);
		if(isFound) {
			mv.setViewName("dashboard");
			mv.addObject("message", "Welcome "+userModel.getUserid());
			session.setAttribute("userid", userModel.getUserid());
		}
		else {
		mv.setViewName("login");
		mv.addObject("message", "Invalid Userid or Password");
		
		}
		return mv;
	}
//	@RequestMapping(method=RequestMethod.GET, value="/dashboard")
//	public ModelAndView dashBoardPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("dashboard");
//		return mv;
//	}
	
	@RequestMapping(  method=RequestMethod.POST,params={"register=Register"})
	public ModelAndView doRegister(HttpServletRequest request , @ModelAttribute("userModel") UserModel userModel) {
		System.out.println("Inside DoRegister "+userModel);
		ModelAndView mv = new ModelAndView();
		boolean isAdded = userDAO.add(userModel);
		if(isAdded) {
			mv.setViewName("login");
			mv.addObject("message", "Welcome "+userModel.getUserid());
		}
		else {
		mv.setViewName("login");
		mv.addObject("message", "Unable to Register");
		
		}
		return mv;
	}
	
}
