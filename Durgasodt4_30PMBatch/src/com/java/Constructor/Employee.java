package com.java.Constructor;

public class Employee 
{
	int eno;
	String ename;
	float sal;
	
	/*public Employee()
	{
		System.out.println("iam default constructor....");
	}*/

	public Employee(int eno) 
	{
		//this();
		
		this.eno=eno;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	public Employee(int eno, String ename) 
	{
		this(1743);
		
		this.eno=eno;
		this.ename=ename;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}

	

	public Employee(int eno, String ename, float sal) 
	{
		this(1744,"ravilella");
		
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
		System.out.println(this.eno);
		System.out.println(this.ename);
		System.out.println(this.sal);
	}
	
	public static  void m2()
	{
		
	}

	public static void main(String[] args) 
	{		
		//Employee emp3=new Employee(1745,"keerthan",1000.23f); 
	}

}
