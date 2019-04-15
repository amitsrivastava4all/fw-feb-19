package com.srivastava.apps;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

@Controller
public class ProductController {
	@RequestMapping(value="/addproduct.do",method=RequestMethod.GET)
	public String addProductPage(Model model) {
		model.addAttribute("productModel", new ProductModel());
		return "addproduct";
	}
	@RequestMapping(value="/add.do",method=RequestMethod.POST)
	public ModelAndView addProduct(@Valid @ModelAttribute("productModel") ProductModel productModel
			, BindingResult validationResult) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addproduct");
		if(validationResult.hasErrors()) {
			mv.addObject("message", "Validation Failed....");
		}
		else {
			mv.addObject("message", "Record Added");
			
		}
		
		return mv;
		
	}
}
