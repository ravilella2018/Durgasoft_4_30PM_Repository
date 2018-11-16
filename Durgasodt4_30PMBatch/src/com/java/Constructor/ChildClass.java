package com.java.Constructor;

public class ChildClass extends Employee
{
	int x;

	public ChildClass(int x) 
	{
		super(1745,"keerthan",1000.23f);
		this.x=x;
		
		System.out.println(this.x);
	}
	
	
	public  void m1()
	{
		System.out.println(this.x);
		System.out.println(super.eno);
		
	}

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass(10);
		
	}

}
