package com.ig.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
         Employee emp1 = new Employee(10, "Amit", "Software Developer");
		
		Employee emp2 = new Employee(20, "Parth", "Senior Software Developer");
		
		Employee emp3 = new Employee(10, "Anuja", "CEO");
		
		Employee emp4 = new Employee(10, "Ekta", "MD");
		
		Employee emp5 = new Employee(30, "Omkar", "Owner");
		
		Employee emp6 = new Employee(40, "Aishwarya", "TH");
		
		Set<Employee> set = new LinkedHashSet<>();
		
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		
		System.out.println(set);
		
	}

}
