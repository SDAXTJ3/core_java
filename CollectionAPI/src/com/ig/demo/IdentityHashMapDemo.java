package com.ig.demo;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new IdentityHashMap<>();
		
		Integer i1 = new Integer(10);// Deprecated
		
		Integer i2 = new Integer(10);
		
		map.put(i1, "Parth");
		map.put(i2, "Omkar");
		
		System.out.println(map);
		
	}

}
