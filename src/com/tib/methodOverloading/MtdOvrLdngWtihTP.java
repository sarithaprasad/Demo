package com.tib.methodOverloading;

public class MtdOvrLdngWtihTP {

	void sum(int a, long b) {
		System.out.println(a + b);
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		
		MtdOvrLdngWtihTP m=new MtdOvrLdngWtihTP();
		
		m.sum(210, 120);

	}

}
