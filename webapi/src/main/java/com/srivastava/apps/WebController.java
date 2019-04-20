package com.srivastava.apps;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@Autowired
	private MyService service;
	@RequestMapping(value = "/items/{price}/{tokenId}")
	public HashMap<String,ArrayList<Item>> getItems(@PathVariable("price") Double price, @PathVariable("tokenId") String tokenId) {
		HashMap<String,ArrayList<Item>> map = new HashMap<>();
		if(service.verifyToken(tokenId)) {
			
			map.put("items",service.getItems(price));
			
		}
		return map;
		
		//return "{id:1001, \"name\":\"Apple\"}";	
		//return "Total Items are 10";
	}
	@RequestMapping(value = "/products")
	public HashMap<String,ArrayList<Item>> getProducts(@RequestParam("price") Double price) {
		HashMap<String,ArrayList<Item>> map = new HashMap<>();
		map.put("items",service.getItems(price));
		return map;
		//return "{id:1001, \"name\":\"Apple\"}";	
		//return "Total Items are 10";
	}
	@RequestMapping(value = "/product", method=RequestMethod.POST)
	public HashMap<String,ArrayList<Item>> getProduct(@RequestBody Item item) {
		HashMap<String,ArrayList<Item>> map = new HashMap<>();
		map.put("items",service.getProducts(item));
		return map;
		//return "{id:1001, \"name\":\"Apple\"}";	
		//return "Total Items are 10";
	}

}
