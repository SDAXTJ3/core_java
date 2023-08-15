package com.ig.demo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetHetrogenousDemo {

	public static void main(String[] args) {

		Comparator<Object> comp = new MyAnimalComparator();
		TreeSet<Object> set = new TreeSet<>(comp);
		set.add(new Animal("Elephant"));
		set.add("Parth");
		
		
		System.out.println(set);
		
	}

}
