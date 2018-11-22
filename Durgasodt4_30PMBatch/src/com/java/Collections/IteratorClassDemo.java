package com.java.Collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class IteratorClassDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> v=new ArrayList<>();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		Iterator<Integer> val = v.iterator();
		
		while(val.hasNext())
		{
			Integer obj = val.next();
			if(obj%2==0)
				System.out.println(obj);
			else
				val.remove();
		}
		
		System.out.println(v);
	}

}
