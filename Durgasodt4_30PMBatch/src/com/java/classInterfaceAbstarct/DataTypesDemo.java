package com.java.classInterfaceAbstarct;

public class DataTypesDemo 
{
	// Integeral Types
	byte b;  // 1 byte
	short s;  // 2 bytes
	int i; // 4 bytes
	long l; // 8 bytes
	
	
	//Floating Types
	float f; // 4 bytes
	double d;  // 8 bytes
	
	//Non Numarics
	boolean bb;
	char ch; // 2 byte
	
	String str;
	
	
	public static void main(String[] args) 
	{
		DataTypesDemo obj=new DataTypesDemo();
		System.out.println("Byte : " + obj.b);
		System.out.println("Short : " + obj.s);
		System.out.println("Integer : " + obj.i);
		System.out.println("Long : " + obj.l);
		
		System.out.println("Float :" + obj.f);
		System.out.println("Double :" + obj.d);
		
		System.out.println("Boolean : "+ obj.bb);
		System.out.println("Char :" + obj.ch);
		
		System.out.println("String : " + obj.str);
		
	}

}
