package com.ig.demo;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Map<Person, String> map = new WeakHashMap<>();
		Person p1 = new Person("Omkar", "Kadegaon");
		
		map.put(p1, "IT");
		
		System.out.println(map);
		
		p1 = null; //as per the rule it is eligible FOR GC
		
		Thread.sleep(5000);
		
		System.gc(); // calling Garbage collector, it works depending on JVM wish
		
		System.out.println(map);
	}
}
