package com.tib.stringsconcepts;

public class Immutability {

	public static void main(String[] args) {

		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		String s5="SACHIN";
		
		System.out.println(s1.concat(s4));
		
		System.out.println(s1+s4);
		
		//System.out.println(s1.equals(s5));
		//System.out.println(s1.equalsIgnoreCase(s5));
		//System.out.println(s1.equals(s2));
		//System.out.println(s1.equals(s3));
		//System.out.println(s1.equals(s4));
		
		
		

	}

}
