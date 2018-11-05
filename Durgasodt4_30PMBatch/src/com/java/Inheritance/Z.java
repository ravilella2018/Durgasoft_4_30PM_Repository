package com.java.Inheritance;

public class Z extends X
{
	
	public void m3()
	{
		System.out.println("Iam m3 in Class Z");
	}

	public static void main(String[] args) 
	{
		Z obj=new Z();
		obj.m3();
		obj.m1();
	}

}
