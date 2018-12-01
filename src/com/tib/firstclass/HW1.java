package com.tib.firstclass;

public class HW1 {
	
	 int a=10;
	 int b=3;
	
	
	//Add two numbers method
	public void addition(){
		System.out.println("Sum of a and b is"+(a+b));
	}
	
   //Subtract two numbers method
	public void Substraction(){
		System.out.println("subtraction of and b is"+(a-b));
		
	}
	
	//Multiple 3 numbers  static method
	
	public static void multiplication(){
		 int i=15;
		 int j=12;
		 int k= 4;
		
	System.out.println("multiplication of i,j,k is"+(i*j*k));
		
		}
	
	//Multiple 3 numbers  static method

	public static void main(String[] args) {
		HW1 add= new HW1();
		add.addition();
		add.Substraction();
		multiplication();
		
	System.out.println(add instanceof HW1);	
		//Call all the methods

	}

}
