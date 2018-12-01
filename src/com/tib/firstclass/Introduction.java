package com.tib.firstclass;

public class Introduction {
	int l;

	Introduction() {
		l = 2;
		System.out.println("Value of l is: "+ l );
		System.out.println("constructor Called");
	}

	public static void laddu() {
		System.out.println("Laddu method called");
	}

	public void boondi() {
		System.out.println("Boondi method called");
	}

	public static void main(String[] args) {
		
		//ClassName Objectreference = new constructor();
		
		Introduction saritha = new Introduction();
		
		
		laddu();
		
		saritha.boondi();
		

	}

}
