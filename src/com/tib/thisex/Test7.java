package com.tib.thisex;

public class Test7 {

	Test7(){
		System.out.println("I am test7 default constructor");
	}
	
	Test7(int x){
		this();
		System.out.println(x);		
	}
	
	public static void main(String[] args) {
		
		Test7 t= new Test7(55);

	}

}
