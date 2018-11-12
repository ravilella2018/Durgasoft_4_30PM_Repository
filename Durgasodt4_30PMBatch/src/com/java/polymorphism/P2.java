package com.java.polymorphism;

public class P2 extends P1
{
	
	public void m1()
	{
		System.out.println("iam overridden m1 from class P2");
	}
	
	public void m2()
	{
		System.out.println("iam m2 from class P2");
	}

	public static void main(String[] args) 
	{
		P2 obj=new P2();
		obj.m2();
		obj.m1();

	}

}
