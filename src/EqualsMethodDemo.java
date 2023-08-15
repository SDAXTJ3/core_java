//boolean equals(Object obj)

class Student{ 
	
	int rollNo;
	String name;
	String dept;
	
	Student(int rollNo,String name,String dept){
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}
	
	public boolean equals(Object obj){
		//CCE 
		if(obj instanceof Student){
			Student s1 = (Student)obj; //parent to child relation
		if((this.rollNo == s1.rollNo && this.name.equals(s1.name) ) && this.dept.equals(s1.dept))
			return true;
		else
			return false;	
		
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	public int hashCode(){
		
		
		return rollNo+name.hashCode()+dept.hashCode();
	}
	
}

//Student std1 = new Student(10,"Amit","CSE");
//Student std2 = new Student(10,"Amit","CSE");

//Object - equals method meant for reference comparison

public class EqualsMethodDemo{ 
	//p s v m(String[] args)
	public static void main(String[] args){
		
		Student std1 = new Student(10,"Amol","IIT");
        Student std2 =  new Student(10,"Amol","CSE");
		System.out.println(std1.hashCode()); //918221580
		System.out.println(std2.hashCode()); //2055281021
		StringBuffer sb = new StringBuffer("Karad");
		System.out.println(std1 == std2); //false
		System.out.println(std1.equals(std2)); //true
		
		String s1 = "Ahire";
		String s2 = "Ahire";
		System.out.println(s1.hashCode()); //918221580
		System.out.println(s2.hashCode());
		
		//System.out.println(s1.equals(sb)); //
		
		
		
	}
}