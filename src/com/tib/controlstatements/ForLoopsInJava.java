package com.tib.controlstatements;

public class ForLoopsInJava {

	public void simplefor() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public void forEach(){
		   int arr[]={12,23,44,56,78};  
		   
		   for(int i=0;i<5;i++){
			   System.out.println(arr[i]);
		   }
		   
		    for(int i:arr){  
		        System.out.println(i);  
		    } 
	}
	
	public void labeledforloop(){
		   int arr[]={12,23,44,56,78};  
		   
		   simple_for_loop_example:
		   for(int i=0;i<5;i++){
			   System.out.println(arr[i]);
		   }
		   
		   for_each_loop_example:
		    for(int i:arr){  
		        System.out.println(i);  
		    } 
	}
	
	public void infiniteforloop(){
		for(;;){
			System.out.println("Infinite");
		}
	}

	static {
		System.out.println("Static block is getting executed");
	}
	
	public static void main(String[] args) {
		
		ForLoopsInJava flij=new ForLoopsInJava();
		
		flij.simplefor();
		
	}

}
