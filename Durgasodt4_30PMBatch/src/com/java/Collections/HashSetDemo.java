package com.java.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<>();
		h.add(10);
		h.add(20);
		h.add(30);
		h.add(10);
		h.add(40);
		h.add(50);
		
		System.out.println(h);
		
		
		LinkedHashSet<Integer> l =new LinkedHashSet<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(40);
		l.add(50);
		
		System.out.println(l);
		
		
		TreeSet<Integer> t =new TreeSet<>();
		t.add(150);
		t.add(10);
		t.add(40);
		t.add(10);
		t.add(20);
		t.add(1);
		
		System.out.println(t);
		
		
		
	}

}
