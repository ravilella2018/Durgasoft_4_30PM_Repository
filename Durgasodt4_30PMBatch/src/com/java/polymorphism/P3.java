package com.java.polymorphism;

public class P3 extends P1
{
	
	public void m1()
	{
		System.out.println("iam overridden m1 from class P3");
	}

	public void m3()
	{
		System.out.println("iam m3 from class P3");
	}
	
	public static void main(String[] args) 
	{
		P3 obj=new P3();
		obj.m3();
		obj.m1();

	}

}
