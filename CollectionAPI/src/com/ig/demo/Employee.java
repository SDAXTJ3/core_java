package com.ig.demo;

public class Employee implements Comparable<Employee> {

	private Integer empId;

	private String empName;

	private String desg;

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Calling Employee Object finalize before destroying ");
		super.finalize();
	}
	public Employee(Integer empId, String empName, String desg) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.desg = desg;
	}

	public Integer getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	/*
	 * @Override public int hashCode() { return this.empId; }
	 * 
	 * @Override public boolean equals(Object obj) { boolean result = false; if (obj
	 * instanceof Employee) {
	 * 
	 * Employee emp = (Employee) obj; if (this.empId == emp.empId) result = true;
	 * else result = false;
	 * 
	 * } else result = false; return result; }
	 * 
	 */	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public String getDesg() {
		return desg;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", desg=" + desg + "]";
	}

	@Override
	public int compareTo(Employee emp) {

		return this.empId.compareTo(emp.getEmpId());
	}

}
