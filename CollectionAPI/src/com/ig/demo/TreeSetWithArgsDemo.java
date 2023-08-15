package com.ig.demo;

import java.util.TreeSet;

public class TreeSetWithArgsDemo {

	public static void main(String[] args) {

		TreeSet<Student> ts = new TreeSet<>(new MyComparator());
		
		ts.add(new Student(10, "Parth", "CSE"));
		ts.add(new Student(2, "Omkar", "Civil"));
		ts.add(new Student(50, "Aishwarya", "IT"));
		ts.add(new Student(100, "Rohan", "Mech"));
		ts.add(new Student(1, "Sohan", "Electrical"));
		

		System.out.println(ts);
	}

}
