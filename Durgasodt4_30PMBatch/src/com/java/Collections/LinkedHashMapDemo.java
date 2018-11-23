package com.java.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo 
{

	public static void main(String[] args) 
	{
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        map.put(1, 100);
        map.put(20, 100);
        map.put(30, 100);
        map.put(4, 100);
        System.out.println(map);

	}

}
