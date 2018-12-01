package com.tib.stringsconcepts;

public class SubStringEx {

	public static void main(String[] args) {
		
		String s= "SarithaPrasad";
		
		System.out.println(s.substring(7));
		
		System.out.println(s.subSequence(7, 13));
		
		System.out.println(s.contains("tha"));
		
		System.out.println(s.endsWith("sa"));
		
		System.out.println(s.charAt(7));
		
		System.out.println(s.length());

	}

}
