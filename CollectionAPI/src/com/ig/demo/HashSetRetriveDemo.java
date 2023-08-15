package com.ig.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetRetriveDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Amit", "Software Developer");

		Employee emp2 = new Employee(20, "Parth", "Senior Software Developer");

		Employee emp3 = new Employee(10, "Anuja", "CEO");

		Employee emp4 = new Employee(30, "Ekta", "MD");

		Set<Employee> empSet = new HashSet<>();

		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);

		
		
		Iterator<Employee> itr = empSet.iterator();
		
		while(itr.hasNext()) {
			
			Employee emp = itr.next();
			if(emp.getEmpName().equalsIgnoreCase("ekta"))
				emp.setEmpName("Aishwarya");
			empSet.add(emp);
		}
		
		System.out.println(empSet);
		

	}

}
