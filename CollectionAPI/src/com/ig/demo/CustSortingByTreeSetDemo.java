package com.ig.demo;

import java.util.Set;
import java.util.TreeSet;

public class CustSortingByTreeSetDemo {

	public static void main(String[] args) {

		Set<Customer> set = new TreeSet<>();
		set.add(new Customer("Amol","Pune"));	
		set.add(new Customer("Zahir khan","Klpr"));
		set.add(new Customer("Parth","Mumbai"));
		set.add(new Customer("Parth","Mumbai"));
		
		
		System.out.println(set);
	}

}
