package com.tib.instanceinitializer;

public class IIB {
	
	static{System.out.println("Executing Static block");}
	
	{System.out.println("Executing Instance block");}
	
	public IIB() {
		{System.out.println("Executing Constructor block");}
	}

	public static void main(String[] args) {
		
		IIB o=new IIB();
		
		IIB o1=new IIB();

	}

}
