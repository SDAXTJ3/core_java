class ToStringDemo{
	
	public static void main(String[] args){
		Student s1 = new Student(10,"Amol","Ahire");
		Student s2 = s1;
		System.out.println(s1.hashCode()); //Student@dfu3834km
		System.out.println(s2.hashCode()); //Student@dfu3834km
		System.out.println(s1 == s2); //Student@dfu3834km
		System.out.println(s1.hashCode() == s2.hashCode() ); //Student@dfu3834km
	}	
}
class Student{	
	int id;
	String name;
	String collegeName;
	
	Student(int id,String name,String collegeName){
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
	}
	
	//override toString method from class Object
	public String toString(){
		return "student id - "+this.id+" Student name - "+this.name+" student collegeName - "+this.collegeName;  	
	}
}
	
