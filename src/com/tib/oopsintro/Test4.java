package com.tib.oopsintro;

public class Test4 {

	int rollNo;
	String studentName;
 static String collegeName;
	
	Test4(int id,String sn){
		rollNo=id;
		studentName=sn;
		
		System.out.println(rollNo);
		System.out.println(studentName);
		System.out.println(collegeName);
	}
	
	static{
		collegeName="I DONT KNOW";
		System.out.println();
	}
	
	public static void main(String[] args) {

		Test4 t1=new Test4(001, "Aditya");
		
		Test4 t2=new Test4(002, "Bhima");
		
		Test4 t3=new Test4(003, "Chitra");
		
	}

}
