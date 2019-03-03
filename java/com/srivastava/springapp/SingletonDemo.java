package com.srivastava.springapp;
class MySingleton{
	//private static MySingleton obj = new MySingleton();
	private static MySingleton obj;
	public static  MySingleton getInstance() {
		synchronized(MySingleton.class) {
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(obj==null) {
			obj = new MySingleton();
		}
		}
		return obj;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton obj1 = MySingleton.getInstance();
		MySingleton obj2 = MySingleton.getInstance();
		System.out.println(obj1==obj2);

	}

}
