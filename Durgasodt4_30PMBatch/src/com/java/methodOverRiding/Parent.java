package com.java.methodOverRiding;

public  class Parent
{
	
	
	 public  Number workhard()
	{
		System.out.println("Wakeup early, Goto College...");
		return 0;
	}
	
	public void care()
	{
		System.out.println("Atmost Care....");
	}

	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.workhard();
		p.care();

	}

}
