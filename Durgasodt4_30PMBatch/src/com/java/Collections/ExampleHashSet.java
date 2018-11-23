package com.java.Collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashSet 
{

	public static void main(String[] args) 
	{
		
		 Map<Integer,Integer> map = new HashMap<Integer,Integer>();
         map.put(1, 100);
         map.put(20, 300);
         map.put(30, 100);
         map.put(4, 500);
         map.put(20, 100);
         System.out.println(map);
         
         System.out.println(map.get(20));

	}

}
