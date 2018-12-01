package com.tib.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListEx {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		
		ListIterator lit = l.listIterator();
		
		System.out.println(l);
		
		while (lit.hasNext()){
			
			String s=(String)lit.next();
			
			if(s.equals("venki"))
			{
			lit.remove();
			System.out.println(l);
			}
			else if (s.equals("chiru"))
			{
				lit.set("Charan");
				System.out.println(l);
			}
			else if (s.equals("nag")){
				lit.add("chiranjivi");
				System.out.println(l);
			}
			
			
		}

	}

}
