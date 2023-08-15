public abstract class Parent{

int x = 10 ;
public void m1(){

System.out.println(" Summer Season--");
}

abstract private void m2(int a); 


public void m3(){

System.out.println(" Winter Season--");
}


}

 class Child extends Parent{
	
	public void m2(int a){
		System.out.println(" Hello World");
	}
	
	public static void main(String[] args){
	//Parent class ref	           
		Child p = new Child(); // Runtime Object
		p.m3(10);
		System.out.println(p.x);
	}
	
}

