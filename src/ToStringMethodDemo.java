class ToStringMethodDemo{

int id = 10;

String name = "Omkar, Dawood , Rohit are Trimurti--";

String collegeName = "DACOE";


public static void main(String[] args){

ToStringMethodDemo td = new ToStringMethodDemo();
System.out.println(td);	//ToStringMethodDemo@13ruqwdg48// toString() from //Object //sysout
System.out.println(td.toString());	//ToStringMethodDemo@13ruqwdg48// toString() from //Object
	
	
}

//override
public String toString(){
	
	return id+"-"+name+"-"+collegeName;
}

// It is always recommended to override toString method for meaningful //representation of class



}