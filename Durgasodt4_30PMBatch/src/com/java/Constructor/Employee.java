package com.java.Constructor;

public class Employee 
{
	int eno;
	String ename;
	
	public Employee()
	{
		System.out.println("iam default constructor....");
	}

	public Employee(int i, String string) 
	{
		eno=i;
		ename=string;
	}

	public static void main(String[] args) 
	{
		Employee emp1=new Employee(1744,"ravilella"); 
		System.out.println(emp1.eno);
		System.out.println(emp1.ename);
		
		Employee emp2=new Employee(1745,"keerthan"); 
		System.out.println(emp2.eno);
		System.out.println(emp2.ename);

	}

}
