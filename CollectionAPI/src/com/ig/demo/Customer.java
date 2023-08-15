package com.ig.demo;

public class Customer implements Comparable<Customer> {

	private String custName;

	private String custAdd;

	public Customer(String custName, String custAdd) {
		super();
		this.custName = custName;
		this.custAdd = custAdd;
	}

	public String getCustName() {
		return custName;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAdd=" + custAdd + "]";
	}

	public String getCustAdd() {
		return custAdd;
	}

	@Override
	public int compareTo(Customer obj) {

		String custName = obj.getCustName();
		
		return this.custName.compareTo(custName);
	}

	

}
