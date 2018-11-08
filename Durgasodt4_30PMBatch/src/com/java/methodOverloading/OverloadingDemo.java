package com.java.methodOverloading;

public class OverloadingDemo 
{
	
	/*public void m1(int i)
	{
		System.out.println(i);
	}*/
	
	/*public void m1(float f)
	{
		System.out.println(f);
	}*/
	
	/*public void m1(String s)
	{
		System.out.println(s);
	}*/
	
	/*public void m1(Integer n)
	{
		System.out.println(n);
	}*/
	
	/*public void m1(Number num)
	{
		System.out.println(num);
	}*/
	
	
	public void m1(Object o)
	{
		System.out.println(o);
	}

	public static void main(String[] args) 
	{
		OverloadingDemo obj=new OverloadingDemo();
		obj.m1(100);
		obj.m1(23.34f);
		obj.m1("ravilella");
		obj.m1(1);
		obj.m1(12.23f);
		obj.m1("vmware");
	}

}
