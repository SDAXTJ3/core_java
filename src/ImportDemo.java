
package com.ahire.learning; // note : atmost max 1 package is allowed and must be first //statement in java

import java.util.Date; // explicit import 
import java.sql.*;  //ambiguity == ref to date is ambiguos // Implicit import 
import java.util.List;
import java.util.ArrayList;
class ImportDemo{
	
	// 1000 line 
	public static void main(String[] args){  // String - java.lang 
		
		// code readability -- 
		List<Integer> list = new ArrayList<>();
		System.out.println("Hello World !!"); // System ,//PrintStream -- java.lang
		Date date = new Date();
		System.out.println("Hello World !!"+date.getClass().getName());
	}
	
	
}

// java.lang - important - bydefault available 
// Object  

// int[] x = new int[20];
// x.getClass().getName(); [I , Parent as Object
// java.util.


// Date - java.sql.Date
// java.util.Date