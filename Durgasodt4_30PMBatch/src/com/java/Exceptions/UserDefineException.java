package com.java.Exceptions;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String string) 
	{
		super(string);
	}

	public static void main(String[] args) throws UserDefineException 
	{
		String num;
		Scanner sc=new Scanner(System.in);
		
		
		
		while (true) 
		{
			System.out.println("Enter the alpha Numaric Number : ");
			num=sc.nextLine();
			try 
			{
				if (num.length() != 10) 
				{
					throw new UserDefineException("Number should be 10 digit");
				} 
				else 
				{
					System.out.println(num);
					break;
				}
			}
			catch (UserDefineException e)
			{
				e.printStackTrace();
			} 
			finally 
			{
				System.out.println("Iam Last Statemt....");
			}
		}

	}

}
