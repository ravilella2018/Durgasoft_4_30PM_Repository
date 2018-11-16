package com.java.Strings;

public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
		StringBuffer s1=new StringBuffer("ravikanth");
		System.out.println("S1 : " + s1);
		System.out.println(s1.hashCode());
		
		
		StringBuffer s2=new StringBuffer("lella");
		System.out.println("S2 : " + s2);
		System.out.println(s2.hashCode());
		
		s1=s1.append(s2);
		System.out.println("S1 : " + s1);
		System.out.println(s1.hashCode());
		

	}

}
