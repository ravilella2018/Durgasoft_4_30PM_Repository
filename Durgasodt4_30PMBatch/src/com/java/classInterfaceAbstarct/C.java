package com.java.classInterfaceAbstarct;

import com.java.AccessModifiers.A;

public class C extends A
{
	
	public void m3()
	{
		System.out.println("iam m3 in class C");
	}

	public static void main(String[] args) 
	{
		C c=new C();
		c.m3();
		c.m1();

	}

}
