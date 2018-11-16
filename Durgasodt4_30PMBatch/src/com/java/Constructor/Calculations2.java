package com.java.Constructor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Calculations2 
{
	int c;
	
	
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println("Addition of A & B is : " + c);
	}
	
	public void sub(int a,int b)
	{
		c=a-b;
		System.out.println("Sub of A & B is : " + c);
	}

	public static void main(String[] args) throws FileNotFoundException 
	{
		Calculations2 obj=new Calculations2();
		obj.add(10,20);
		obj.sub(100,200);
		
		FileInputStream fis=new FileInputStream("d:\\abc.txt");
	}

}
