package com.ig.demo;

public class Student  {
	
	public Student(Integer rollNo, String name, String dept) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}

	private Integer rollNo; 
	
	private String name;
	
	private String dept;

	public Integer getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dept=" + dept + "]";
	}

}
