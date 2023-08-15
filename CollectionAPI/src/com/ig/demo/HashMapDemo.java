package com.ig.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Employee, String> map = new HashMap<>();

		map.put(new Employee(10, "Omkar", "Software Developer"), "Karad");
		map.put(new Employee(50, "Parth", "Software Developer"), "Pune");
		map.put(new Employee(1, "Rohan", "Software Developer"), "Mumbai");
		map.put(new Employee(100, "Shreya", "Software Developer"), "Klpr");
		map.put(new Employee(11, "Rinku", "Software Developer"), "Satara");
	
		System.out.println(map);

	}

}
