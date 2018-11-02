package com.java.AccessModifiers;

public  class A 
{
	
	
	int x=100; // instance (or) global (or) non-static variable
	static float roi= 8.5f; // static variable
	static A a;
	
	public void m1()
	{
		int x=200;
		System.out.println("iam m1 in class A");
		System.out.println(x);
		System.out.println(A.roi);
	}
	
	public static void m5()
	{
		a=new A();
		System.out.println(a.x);
		System.out.println(A.roi);
		
	}
	
	public static void main(String[] args) 
	{
		a=new A();
		a.m1();
		System.out.println(a.x);
		System.out.println(A.roi);
		
	}

}


