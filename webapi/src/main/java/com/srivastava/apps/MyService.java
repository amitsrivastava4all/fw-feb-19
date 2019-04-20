package com.srivastava.apps;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	public boolean verifyToken(String tokenId) {
		String tokens [] = {"A123","BB99887","CDE22"};
		for(String token : tokens) {
			if(token.equals(tokenId)) {
				return true;
			}
		}
		return false;
	}
	public ArrayList<Item> getProducts(Item itemObject) {
		ArrayList<Item> items = new ArrayList<>();
		for(int i = 1; i<=10; i++) {
			items.add(new Item(i, "Apple"+i,10000*i));
		}
		ArrayList<Item> newItems  = new ArrayList<>() ;
		for(Item item : items) {
			if(item.getPrice()>=itemObject.getPrice() 
					&& item.getName().equals(itemObject.getName())) {
				newItems.add(item);
			}
		}
		return newItems;
	}
	public ArrayList<Item> getItems(double  price) {
		ArrayList<Item> items = new ArrayList<>();
		for(int i = 1; i<=10; i++) {
			items.add(new Item(i, "Apple"+i,10000*i));
		}
		ArrayList<Item> newItems  = new ArrayList<>() ;
		for(Item item : items) {
			if(item.getPrice()>=price) {
				newItems.add(item);
			}
		}
		return newItems;
	}

}
