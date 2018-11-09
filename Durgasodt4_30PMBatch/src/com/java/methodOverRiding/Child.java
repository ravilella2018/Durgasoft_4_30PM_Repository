package com.java.methodOverRiding;

public class Child extends Parent
{
	 public Number  workhard()
	{
		System.out.println("Wakeup anytime, Goto Bar...");
		return 0;
	}
	
	public void love()
	{
		System.out.println("Iam in love....");
	}

	public static void main(String[] args) 
	{
		Child c=new Child();
		c.workhard();
		c.love();
		c.care();
		
		
		Parent p=new Parent();
		p.workhard();
		p.care();
		
		Parent obj=new Child();
		obj.workhard();
		obj.care();
		
	}

}
