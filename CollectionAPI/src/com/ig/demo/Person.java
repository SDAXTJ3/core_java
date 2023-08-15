package com.ig.demo;

public class Person {

	private String name;

	private String address;

	public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Before killing Person Object ,  finalize method got called");
	}

}
