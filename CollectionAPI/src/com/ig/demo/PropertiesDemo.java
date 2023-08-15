package com.ig.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException  {

		Properties properties = new Properties(); // FileOuputStream
		//FileInputStream
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\khodk\\OneDrive\\Desktop\\Ahire\\TestData.properties"));
		
		properties.load(fis);
		
		
		Set<Object> keySet = properties.keySet();
		
		System.out.println(Arrays.toString(keySet.toArray()));
		
		for(Object obj: keySet) {
			String s1 = (String)properties.get(obj);
			System.out.println(obj.toString()+"-"+s1);
		}
		
		Collection<Object> values = properties.values();
		
		List al = new ArrayList<>(values);
		
		for(int i = 0 ; i< al.size();i++) {
			
			String s1 = (String)al.get(i);
			System.out.println(s1);
			
		}
		
		

}
}
