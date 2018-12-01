package com.tib.controlstatements;

public class DoWhileLoopExample {
	
	public static void dowhileloopex(){
		 int weight=65;  
		    do{  
		        System.out.println("weight of person is :"+weight+" feed him");  
		    weight++;  
		    }  while(weight<=70);
	}
	
	public static void infinitedowhileloop(){
		do{  
			System.out.println("Infinite");
			}while(true);  
	}
	
	public static void main(String[] args) {
		dowhileloopex();
		

	}

}
