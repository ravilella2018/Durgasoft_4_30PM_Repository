package com.java.polymorphism;

public class DriverClass 
{

	public static void main(String[] args) 
	{
		P1 obj;
		
		obj=new P2();
		obj.m1();
		
		obj=new P3();
		obj.m1();
		

	}

}
