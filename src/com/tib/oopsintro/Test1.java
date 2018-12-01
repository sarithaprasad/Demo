package com.tib.oopsintro;

public class Test1 {

	int id1;
	String name1;

	int id2;
	String name2;

	int id3;
	String name3;

	// This is the method
	public void initialvar(int d, String s) {
		id2 = d;
		name2 = s;
		System.out.println(id2 + "             " + name2);
	}

	// This is constructor
	Test1(int d1, String s1) {
		id3 = d1;
		name3 = s1;
		System.out.println(id3 + "             " + name3);
	}

	Test1() {
	}
	
	Test1(int d1, String s1,int d2) {
		id3 = d1;
		name3 = s1;
		System.out.println(id3 + "             " + name3+ "             " + d2);
	}

	public static void main(String[] args) {

		Test1 t1 = new Test1() , t2=new Test1(30, "Savitha", 50);
		
		System.out.println(t1.id1 + "             " + t1.name1);
		
		t1.id1 = 10;
		t1.name1 = "Sarika";
		System.out.println(t1.id1 + "             " + t1.name1);

		t1.initialvar(20, "Saritha");
		
		

	}

}
