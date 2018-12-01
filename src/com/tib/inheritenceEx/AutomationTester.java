package com.tib.inheritenceEx;

public class AutomationTester extends Employee{
	
	int bonus=10000;  

	public static void main(String[] args) {
	
		AutomationTester at=new AutomationTester();
		
		System.out.println(at.bonus);
		
		System.out.println(at.salary);

	}

}
