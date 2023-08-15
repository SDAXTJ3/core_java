package com.ig.demo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<Animal, String> map = new TreeMap<>();
		map.put(new Animal("A"), "Jungle");
		map.put(new Animal("D"), "Jungle");
		map.put(new Animal("B"), "Jungle");
		
		System.out.println(map);

	}

}
