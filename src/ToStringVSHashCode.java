public class ToStringVSHashCode{

int id;
String name ;
String address;

ToStringVSHashCode(int id,String name,String address){
this.id = id;	
this.name = name;	
this.address = address;		
}

//overriden
public int hashCode(){
	return id; 
}

public static void main(String[] args){
	ToStringVSHashCode vsd1 = new ToStringVSHashCode(10,"Rohit","Karad");
	ToStringVSHashCode vsd2 = new ToStringVSHashCode(11,"Rohit","Karad");
	
	
	
	System.out.println(vsd1); //toString 
	System.out.println(vsd2); //toString 
}


}