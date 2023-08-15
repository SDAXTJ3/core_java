class PrivateConstructDemo{

public  PrivateConstructDemo(){
	
	
}

public String getMessage(String name){
	
	return "Hello "+name;
}

//factory method
public static PrivateConstructDemo getInstance(){
	
	return new PrivateConstructDemo();
}
public static void main(String[] args){
		super();
		PrivateConstructDemo ch = new PrivateConstructDemo();
	}

}
class ConstructorTest{
	
	public static void main(String[] args){
		//PrivateConstructDemo obj2 = new PrivateConstructDemo();
		
		
		PrivateConstructDemo obj = PrivateConstructDemo.getInstance();
		String msg = obj.getMessage("Shreya");
		System.out.println(msg);
		
	}
	
}