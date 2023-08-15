//Function Overriding--

class Parent{

public void getFlat(){
	
	System.out.println("Parent class getFlat method");
	
	
}

public void getPlot(){
	
	System.out.println("Parent class getPlot method");
	
}

public void getCar(){
	
	System.out.println("Parent class getCar method");
	
}


public void getBankBalance(){
	
	System.out.println("Parent class getBankBalance method");
	
	
}

public void getGold(){
	
	System.out.println("Parent class getGold method");
	
}

public  void getMarry(){
	
	System.out.println("Parent class Deepika marry  method");
}


}

class Child extends Parent{ // java.lang.Object - 11 5000 X 11 methods - Boiler Plate Code 
  
 public void getSuperBike(){
	 
	 System.out.println("Child class getSuperBike method");
 }
public void getMarry(){
	
	System.out.println("Child class Anushka Shetty  marry  method");
} 

public static void main(String[] args){


Parent p = new Parent(); //no polymorphism 
//p.getSuperBike();// can not find symbol	
p.getMarry(); //Deepika//



Child ch = new Child();  //no polymorphism
ch.getMarry(); //Anushka

//ref type //runtime object //JVM RT Runtime Polymorphism , load on fly, Dynamic Polymorphism
Parent p1 = new Child(); // parent class ref to hold child class Object - Polymorphism
//Compiler - first check into Parent class
// if found in parent class dont execute because special case of polymorphism
// search into child class - 
//if found let JVM invokes
//if not raise Compile Time error
p1.getMarry();
	
}



}