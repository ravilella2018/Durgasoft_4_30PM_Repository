package com.java.Inheritance;

public class Y extends X
{
	
	public void m1()
	{
		System.out.println("Iam overridden m1 in Class Y");
	}
	
	public void m2()
	{
		System.out.println("Iam m2 in Class Y");
	}

	public static void main(String[] args)
	{
		X x=new X();
		x.m1();
		System.out.println(x.a);
		
		Y obj=new Y();
		obj.m2();
		obj.m1();
		System.out.println(obj.a);
		
		

	}

}
