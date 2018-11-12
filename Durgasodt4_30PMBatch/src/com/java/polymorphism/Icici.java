package com.java.polymorphism;

public class Icici implements Rbi
{

	public static void main(String[] args) 
	{
		Icici i =new Icici();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() 
	{
		System.out.println("iam withdrawl from ICICI Class");
	}

	@Override
	public void deposit() 
	{
		System.out.println("iam deposit from ICICI Class");
	}

}
