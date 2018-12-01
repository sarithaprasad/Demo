package com.tib.oopsintro;

public class Test3 {

	int id;
	String name;

	Test3(int i, String n) {
		id = i;
		name = n;
	}

	Test3(Test3 s) {
		id = s.id;
		name = s.name;
	}
	
	 void display(){System.out.println(id+" "+name);}  
	
	public static void main(String[] args) {
		
		Test3 t=new Test3(50, "Shankar");
		
		t.display();
		
		Test3 t1=new Test3(t);
		
		t1.display();
	}

}
