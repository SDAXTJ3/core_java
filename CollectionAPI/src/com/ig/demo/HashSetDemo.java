package com.ig.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		boolean add = false;
		Set<String> set = new HashSet<>();
		
		add = set.add("parth");
		set.add("amit");
		set.add("Ravi");
		set.add("Rajesh");	
		add = set.add("Parth");
		
		System.out.println(set);
		
	}

}
