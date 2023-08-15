package com.ig.demo;

import java.util.Comparator;

public class MyAnimalComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		int result = 0;
		
		if(o1 instanceof Animal || o2 instanceof Animal) {
			Animal a1 = (Animal)o1;
			Animal a2 = (Animal)o2;
			result = -a1.getName().compareTo(a2.getName());
		}
		else if (o1 instanceof String || o2 instanceof String ) {
			
			String s1 = (String)o1;
			String s2 = (String)o2;
			result = -s1.compareTo(s2);
		}
		else if (o1 instanceof Animal || o2 instanceof String) {
			Animal a1 = (Animal)o1;
			String s1 = (String)o2;
			result = -a1.getName().compareTo(s1);
		}
		else if(o1 instanceof String || o2 instanceof Animal) {
			String s1 = (String)o1;
			Animal a1 = (Animal)o2;
			result = -s1.compareTo(a1.getName());
		}
		
		
		return 100;
	}

}
