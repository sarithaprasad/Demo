package com.tib.misc;

public class RecursionEx {

	static int count = 0;

	static void p() {
		count++;
		if (count <= 5) {
			System.out.println("hello " + count);
			p();
		}
	}
	
	 static int factorial(int n){      
         if (n == 1)      
           return 1;      
         else      
           return(n * factorial(n-1));      
   }    

	public static void main(String[] args) {

		//p();
		
		System.out.println("Factorial of 5 is: "+factorial(5)); 

	}

}
