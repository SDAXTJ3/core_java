class A  { //parent

public void m1(){  

System.out.println("Class A parent m1 method--");
}

public void m2(int x){

System.out.println("Class A parent m2 method--");
}

}

class B extends A{  // B is child
	
public void m1(){ //override

System.out.println("Class B Child m1 method--");
}
	
	public static void main(String[] args){
		
		A a = new A(); //compiler will decide
		a.m1(); //Class A parent m1 method--"
		
		B b = new B(); //compiler
		b.m1();//Class B child m1 method--"
		
		A a1 = new B(); //JVM 
		a1.m1();//Class B child m1 method--" 
		
		
		
	}
	
	
	
}