class SuperStatDemoP{

SuperStatDemoP(){
super(); // calling Object class no arg default constructor
System.out.println("Parent class no arg constructor ");
}

SuperStatDemoP(int x){ // constructor overloading
this();
System.out.println("Parent class int arg constructor "+x);	
	
}


}
class SuperStatDemoC extends SuperStatDemoP{
	
	SuperStatDemoC(){ //zero arg constructor 
		super(10);
		System.out.println("Programmer created child class no arg constructor ");
	}
	public static void main(String[] args){
		
		
		SuperStatDemoC ch = new SuperStatDemoC();
	}
	
}