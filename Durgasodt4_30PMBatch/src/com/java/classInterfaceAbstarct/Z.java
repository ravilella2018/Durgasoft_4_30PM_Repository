package com.java.classInterfaceAbstarct;

import com.java.Inheritance.X;

public class Z extends X
{
	public void m1()
	{
		System.out.println("Iam overridden m1 in Class Y");
	}
	
	
	public void m3()
	{
		System.out.println("Iam m3 in Class Z");
	}

	public static void main(String[] args) 
	{
		X x=new X();
		x.m1();
		System.out.println(x.a);
		
		Z z=new Z();
		z.m3();
		z.m1();
		System.out.println(z.a);
	}

}
