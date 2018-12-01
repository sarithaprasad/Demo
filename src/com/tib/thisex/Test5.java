package com.tib.thisex;

public class Test5 {

	int id;
	String name;
	
	Test5(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void assign(){
		id=50;
		name="savitha";
	}
	
	void display(){
		System.out.println(id);
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		
		Test5 t=new Test5(30, "Saritha");
		
		t.display();
		
		t.assign();
		
		t.display();
	}

}
