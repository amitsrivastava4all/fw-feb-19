package com.srivastava.springapp;

import java.util.HashMap;
import java.util.Map;

class Ck{
	static int counter;
	private int id;
	int x,y;
	Ck(int x , int y){
		this.x = x;
		this.y = y;
		counter++;
		this.id = counter;
		
	}
	public boolean equals(Object object) {
		if(this==object) {
			return true;
		}
		if(object instanceof Ck) {
			Ck ck = (Ck) object;
			if(this.x== ck.x && this.y == ck.y) {
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
//		if(id>=1 && id<=100) {
//			return 1;
//		}
		return x  * 1000;
	}
}
public class Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String , String> m  = new HashMap<String, String>();
//		m.put("Hi", "Bye");
//		String p1 = new String("Hello");
//		String p2 = new String("Hello");
//		System.out.println(p1.hashCode()==p2.hashCode());
//		m.put(p1, "OK");
//		System.out.println(m.get(p2));
//		System.out.println("P1 and P2 "+(p1==p2));
//		String e = new String("Hello");
		
		Map<Ck,String> map = new HashMap<>();
		Ck obj =  new Ck(10,2000);
		System.out.println(obj.hashCode());
		map.put(obj,"A");
		Ck obj2 = new Ck(10,200);
		System.out.println(obj2.hashCode());
		String t = map.get(obj2);
		System.out.println(t);
		
	}

}
