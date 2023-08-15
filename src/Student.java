public class Student{  //VIP Modi, Shinde  java safe ;; garbage 

static String dept = "CSE"; // method area

static String collegeName = "DACOE" ; // method area

String name;  // heap area . instance

int rollNo; // heap , instance

String address ;// heap , instance

// constructor overloading
public Student(){ // zero arg constructor
	
	super(); // statement but not keyword
}
public Student(String name,int rollNo, String address){
this.name = name;
this.rollNo = rollNo;
this.address = address;
}

public static void main(String[] args){
	
	Student s1 = new Student();// zero arg constructor
	System.out.println(s1.name+" "+s1.rollNo+" "+s1.address+" "+dept+" "+collegeName);  // null,0,null, CSE, DACOE
	s1.dept = "ECE";
    Student s2 = new Student("Rohit",23,"Pune");
	System.out.println(s2.name+" "+s2.rollNo+" "+s2.address+" "+dept+" "+collegeName);
	
	Student s3 = new Student("Trupi",21,"Mumbai");
	System.out.println(s3.name+" "+s3.rollNo+" "+s3.address+" "+dept+" "+collegeName);
	s3.dept = "Mech";
	
	Student s4 = new Student("Raj",21,"Klpr");
	System.out.println(s4.name+" "+s4.rollNo+" "+s4.address+" "+dept+" "+collegeName);
}


}

