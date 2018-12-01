package com.tib.firstclass;

public class OperatorsExample {

	public static void unary() {
		int x = 10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
	}
	
	public static void unary2(){
		int a=10;
		int b=10;
		int c=10;
		int d=10;
		System.out.println(a++ + ++a); //10
		System.out.println(b++ + b++); //11+12
		System.out.println(c++ + c-- + ++c);
		System.out.println(++d + d++ + d-- + --d);
		
	}
	
	public static void unary3(){  
		int a=10;  
		int b=-10;  
		boolean c=true;  
		boolean d=false;  
		System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
		System.out.println(!c);//false (opposite of boolean value)  
		System.out.println(!d);//true  
		}
	
	public static void unary4(){  
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a<b&&a<c);  
		System.out.println(a<b&a<c);  
		}
	
	public static void unary5(){
		int a=10;
		a+=10;
		int b=20;
		b-=15;
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		unary5();
	}

}
