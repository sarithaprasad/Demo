package com.tib.thisex;

public class Test8 {

	void m(Test8 s){
		System.out.println("Method m is invoked");
	}
	
	void n(){
		System.out.println("Method n is invoked");
		
		this.m(this);
	}
	
	public static void main(String[] args) {
		
		Test8 t= new Test8();
		
		t.n();

	}

}
