package com.ig.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		
		Set set = new TreeSet(); //String, SB, Wrapper classes implemnets Comparable
		
		set.add(10); //65
		set.add(5);
		set.add(100); //97
		set.add(2);   
		
		System.out.println(set);  //DNSO-> [A,M,P,Z]
	}

}
