package com.tib.controlstatements;

public class WhileLoopExample {

	public static void whileloopex(){
		 int weight=65;  
		    while(weight<=70){  
		        System.out.println("weight of person is :"+weight+" feed him");  
		    weight++;  
		    }  
	}
	
	public static void infinitewhileloop(){
		while(true){
			System.out.println("Infinite");
		}
	}
	
	public static void main(String[] args) {
		whileloopex();
	}

}
