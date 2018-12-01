package com.tib.methodOverriding;

public class Test {

	public static void main(String[] args) {
		
		AxisBank a=new AxisBank();
		SBI s=new SBI();
		HDFC h=new HDFC();
		
		System.out.println("Axis bank interest is   "+a.getRateOfInterest());
		System.out.println("SBI bank interest is   "+s.getRateOfInterest());
		System.out.println("HDFC bank interest is   "+h.getRateOfInterest());
	}

}
