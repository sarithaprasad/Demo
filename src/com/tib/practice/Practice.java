package com.tib.practice;
import java.util.Scanner;

public class Practice {


public static void main(String args[])
{
int i;
int j=0;
int k=0;int l=1;int f=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number ");
i=sc.nextInt();
while(k<=i){
	System.out.println(k);
	f=k+l;
	k=l;
	l=f;
	}
}
}