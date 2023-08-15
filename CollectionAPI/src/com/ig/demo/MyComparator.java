package com.ig.demo;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {

		return -std1.getRollNo().compareTo(std2.getRollNo());
	}

}


// (r1,r2)-> -r1.compareTo(r2); // 