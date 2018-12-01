package com.tib.stringsconcepts;

public class CompareToMethod {

	public static void main(String[] args) {
		
		String s1="Sachin";
		String s2="Sachin";
		String s3 = "Sachina";
		String s4="Sachi";
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s3.compareTo(s1));
		
		System.out.println(s1.compareTo(s4));
	}

}
