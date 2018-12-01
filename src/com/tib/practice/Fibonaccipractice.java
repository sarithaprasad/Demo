package com.tib.practice;

public class Fibonaccipractice {

	public static void main(String[] args) {
		int n =10,j=0,k=1,f;
		for(int i=0;j<=n;i++)
		{
			System.out.println(j);
			f= j+k;
			j=k;
			k=f;			
		}

	}

}
