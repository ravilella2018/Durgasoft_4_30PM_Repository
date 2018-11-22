package com.java.Collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumarationClassDemo 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<>();
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		
		System.out.println(v);
		
		Enumeration<Integer> val = v.elements();
		
		while(val.hasMoreElements())
		{
			Integer obj = val.nextElement();
			if(obj%2==0)
				System.out.println(obj);
		}
		
		System.out.println(v);
	}

}
