package com.srivastava.springapp;

import java.util.HashMap;
import java.util.Map;

class Ck{
	int x,y;
	Ck(int x , int y){
		this.x = x;
		this.y = y;
	}
}
public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , String> m  = new HashMap<String, String>();
		m.put("Hi", "Bye");
		String p1 = new String("Hello");
		String p2 = new String("Hello");
		System.out.println(p1.hashCode()==p2.hashCode());
		m.put(p1, "OK");
		System.out.println(m.get(p2));
		System.out.println("P1 and P2 "+(p1==p2));
		String e = new String("Hello");
		
		Map<Ck,String> map = new HashMap<>();
		map.put(new Ck(100,200),"A");
		String t = map.get(new Ck(100,200));
		System.out.println(t);
		
	}

}
