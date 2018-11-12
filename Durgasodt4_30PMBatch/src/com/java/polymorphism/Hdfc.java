package com.java.polymorphism;

public class Hdfc implements Rbi
{

	public static void main(String[] args) 
	{
		Hdfc h=new Hdfc();
		h.withdrawl();
		h.deposit();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam withdrawl from HDFC Class");
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam deposit from HDFC Class");
	}

}
