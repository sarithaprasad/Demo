package com.tib.thisex;

public class Test6 {

	static void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		m();
		//m();//same as this.m() 
	}

	public static void main(String[] args) {
		
		Test6 t = new Test6();
		
		t.n();
		
	}

}
