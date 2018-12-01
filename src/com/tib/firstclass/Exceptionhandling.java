package com.tib.firstclass;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;

public class Exceptionhandling {
	
	enum days {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	
	public static void main(String[] args) {
		
		
		HashSet s = new HashSet();
		
		s.add("Saritha");
		s.add("kavitha");
		s.add("pramitha");
		s.add("jakartha");
		
		Iterator it = s.iterator();
		
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

}
