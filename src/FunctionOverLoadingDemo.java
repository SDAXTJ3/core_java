class FunctionOverLoadingDemo{


public void m1(Integer x){  //m1(String)  papad
	
	System.out.println("m1(Integer) instance method");
}

public void m1(Number  y){  //m1(Object) .. Number is parent class of Interger
//Object is parent class of Number
	
	System.out.println("m1(Float ) instance method");
}




public static void main(String[] args){
	FunctionOverLoadingDemo d = new FunctionOverLoadingDemo();
	
	d.m1(null);
	
	
}
}

//Ref type
//Parent p = new Parent();// Runtime Object
//ref type
//Child ch  = new Child();  //Runtime Object
//ref type
//Parent p = new Child(); //Runtime Object
//function overloading -- Static polymorphism, compile time polymorphism
//function overriding  - Dynamic Polymorphism, Runtime Polymorphism