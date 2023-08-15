package com.ig.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetUniquenessDemo {
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(10, "Amit", "Software Developer");
		
		Employee emp2 = new Employee(20, "Parth", "Senior Software Developer");
		
		Employee emp3 = new Employee(10, "Anuja", "CEO");
		
		Employee emp4 = new Employee(10, "Ekta", "MD");
		
		Set<Employee> set = new HashSet<>();
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
		System.out.println(set);
		
		
		
	}

}
