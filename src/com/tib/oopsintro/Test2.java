package com.tib.oopsintro;

import java.net.NetworkInterface;

public class Test2 {
	
	int id;
	String name;
	int d;
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		//Anonymous Object
		new Test2().id=10;
		
		new Test2().name="Saritha";
		
		new Test2().d=40;
		
		//Multiple Objects with single class name
		
		Test2 t1=new Test2() , t2=new Test2();
		
		
		//Object ccreation by newInstance
		
		Test2 t3= Test2.class.newInstance();
		
	}

}
