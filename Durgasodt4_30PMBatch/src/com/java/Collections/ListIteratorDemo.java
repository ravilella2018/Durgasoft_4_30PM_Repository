package com.java.Collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.add("sriram");
		ll.add("ravikanth");
		ll.add("kosmik");
		ll.add("vision");
		System.out.println(ll);
		
		ListIterator<String> litr=ll.listIterator();
		while(litr.hasNext())
		{
			String  s=litr.next();
			if (s.equals("kosmik"))
				litr.set("bigclasses");
			else
				litr.remove();
		}
		System.out.println(ll);
		


	}

}
