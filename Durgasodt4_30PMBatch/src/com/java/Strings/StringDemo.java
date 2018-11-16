package com.java.Strings;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1="ravikanth";
		System.out.println("S1 : " + s1);
		System.out.println(s1.hashCode());
		
		String s2=new String("lella");
		System.out.println("S2 : " +s2);
		System.out.println(s2.hashCode());
		
		//s1=s1+s2;
		s1=s1.concat(s2);
		System.out.println("S1 : " + s1);
		System.out.println(s1.hashCode());

	}

}
