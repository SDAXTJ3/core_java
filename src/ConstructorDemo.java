//Constructor in Java

class ConstructorDemo{  // java.lang.Object

int x1 ;//instance 
int x2;
int x3;
        //Normal method
ConstructorDemo(int x1, int x2 , int x3){  // does not returns anything , constructor
	this.x1 = x1; //Current class Object 
	this.x2 = x2;
	this.x3 = x3;
	System.out.println("Inside ConstructorDemo method");
	
	
}

public static void main(String[] args){
ConstructorDemo cd = new ConstructorDemo(10,20,30);	
}








} 