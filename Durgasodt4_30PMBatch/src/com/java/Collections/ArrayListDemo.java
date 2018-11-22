package com.java.Collections;

import java.util.ArrayList;

public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add(30);
		a.add("ravilella");
		a.add(13.23f);
		a.add(10);
		a.add(20);
		a.add(500);
		
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
		Object val = a.get(0);
		
		if(val instanceof Integer)
		{
			Integer o1 = (Integer)val;
			System.out.println(o1);
		}
		else if(val instanceof String)
		{
			String o1 = (String)val;
			System.out.println(o1);
		}
	}

}
