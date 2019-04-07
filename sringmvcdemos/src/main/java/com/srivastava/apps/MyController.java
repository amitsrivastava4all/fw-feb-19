package com.srivastava.apps;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Scope("session")
//@SessionAttributes("user")
public class MyController {
	@Autowired
	private MyService myService;
	
	@RequestMapping(method=RequestMethod.POST,value="/dologin")
	public ModelAndView doLogin(@RequestParam("userid") String userid,@RequestParam("pwd")  String password, @RequestParam("role") String roleName) {
		ModelAndView md = new ModelAndView();
		if(userid.equals("amit") && password.equals("123") && roleName.equals("admin")) {
			md.setViewName("welcome");
			md.addObject("msg", "Welcome "+userid+" You are "+roleName);
		}
		else {
			md.setViewName("invalid");
			md.addObject("msg", "Invalid Userid and Password");
		}
		return md;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/dologin2")
	public ModelAndView doLogin2(@ModelAttribute("user") User user , HttpSession session) {
		session.setAttribute("myuser", user.getUserid());
		System.out.println("Id "+session.getId());
		System.out.println("User is "+user);
		ModelAndView md = new ModelAndView();
		if(user.getUserid().equals("amit") && 
				user.getPwd().equals("123") && 
				user.getRole().equals("admin")) {
			md.setViewName("welcome");
			md.addObject("msg", "Welcome.... "+user.getUserid()+" You are "+user.getRole());
		}
		else {
			md.setViewName("invalid");
			md.addObject("msg", "Invalid Userid and Password");
		}
		return md;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public String loadHomePage() {
		System.out.println("Inside index ");
		return "index";
	}
	@RequestMapping(method=RequestMethod.GET,value="/login")
	public ModelAndView loadLoginPage(Model model) {
		System.out.println("Inside Login ");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login");
		modelAndView.addObject("user",new User());
		modelAndView.addObject("roles",myService.getRoles());
		//model.addAttribute("roles", myService.getRoles());
		
		//return "login";
		return modelAndView;
	}
	// http://localhost:8080/
}
