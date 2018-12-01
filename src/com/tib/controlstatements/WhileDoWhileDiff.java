package com.tib.controlstatements;

public class WhileDoWhileDiff {
	
	public static void whileloop(){
		int i=10;		
		while(i<9){
			
			System.out.println("While loop executed");
		}	
		System.out.println("While loop status");
	}

	public static void dowhileloop(){
		int i=10;		
		do{
			System.out.println("Do While loop executed");
		}	while(i<9);
		System.out.println("Do while loop status");
	}
	
	public static void main(String[] args) {
		dowhileloop();

	}

}
