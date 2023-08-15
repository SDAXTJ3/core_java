import java.util.*;
class ArrayListDemo{
	//int[] x = new int[3]; 
	public static void main(String[] args){
		
		ArrayList al = new ArrayList(); //10
		
		System.out.println(al.size());//0
		
		al.add(10);
		al.add(new Test());  //from ahire folder -- Default //package
		al.add(null);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("Amol");
		al.add("Amol");
		al.add("Amit");
		al.add("Parth");
		al.add("Parth");
		System.out.println(al.size()); //10		
		System.out.println(al); // //[10,Test@hduh9121,null,10,20,30,"Amol"]		
	}
	
		
}