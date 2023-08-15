//constructor

//Compiler will create default constructor only when there is no //constructor created by programmer 


//Default constructor

public class StudentConstructDemo{
	
int rollNo;
String name;
String add;
String collegeName; 
// Parameterized constructor
public StudentConstructDemo(int rollNo, String name,String add, String collegeName){	

this.rollNo = rollNo;
this.name = name;
this.add= add;
this.collegeName = collegeName;
	System.out.println("4 args constructor ");
	
}

public StudentConstructDemo(String collegeName){
	
	super(); //statement 
	 
	this.collegeName = collegeName;
	System.out.println("1 args constructor ");
	
}

// Constructor overloading
public StudentConstructDemo(){
	
	super();
	System.out.println("no arg constructor ");
}


public static void main(String[] args){
	
	StudentConstructDemo s1 = new StudentConstructDemo(10,"Amit", "Pune", "CSE" );// we dont have any option of passing no //values
	
	StudentConstructDemo s2 = new StudentConstructDemo();
	
	StudentConstructDemo s3 = new StudentConstructDemo("DACOE");
}

}

