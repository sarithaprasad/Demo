package com.tib.controlstatements;

public class SwitchStatements {
	
	public static void switchexp(){
	    int number=20;  
	  
	    switch(number){
	    
	    case 10: System.out.println("The number is 10");break;
	    case 20: System.out.println("The number is 20");break;
	    case 30: System.out.println("The number is 30");break;
	    default: System.out.println("The given number is not in the cases");
	    }
	  
	}

	public static void main(String[] args) {

		switchexp();
	}

}
