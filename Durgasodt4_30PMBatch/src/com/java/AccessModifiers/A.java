package com.java.AccessModifiers;

public  class A 
{
	int x=100; // instance (or) global (or) non-static variable
	static float roi= 8.5f; // static variable
	
	public void m1()
	{
		int x=200;
		System.out.println("iam m1 in class A");
		System.out.println(this.x);
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		System.out.println(a.x);
		System.out.println(A.roi);
		
	}

}


