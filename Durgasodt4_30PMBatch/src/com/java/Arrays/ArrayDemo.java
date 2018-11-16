package com.java.Arrays;

import java.util.Scanner;

public class ArrayDemo 
{
	
	public int m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arry size :");
		int asize = sc.nextInt();
	
		int[] a=new int[asize];
		int sum=0;
	
		System.out.println("Enter Array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		//System.out.println("Sum of array is  : "+ sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		
		ArrayDemo demo=new ArrayDemo();
		int count = demo.m1();
		System.out.println("SUmof Array in outside :" + count);
		
		
		/*int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		
	}

}
