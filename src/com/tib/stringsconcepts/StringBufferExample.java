package com.tib.stringsconcepts;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Saritha");
		
		StringBuilder sb2=new StringBuilder("Prasad");
		
		sb1.append("Prasad");
		
		sb1.insert(7, "Laddu");
		
		sb1.reverse();
		
		System.out.println(sb1);
		
		
	}

}
