package com.ig.demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<>();
		
		map.put("Z",10 );
		map.put("A",50 );
		map.put("S",40 );
		map.put("B",100);
		map.put("K",5 );
		map.put("E",1);
		
		System.out.println(map);
		
	}

}
