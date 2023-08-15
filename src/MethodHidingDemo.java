public class MethodHidingDemo{
	
	public  static void m1(int x){ //m1(int)
	
    System.out.println("M1 from parent");	
		
	}
	
		
}

class MethodHidingDemoChild extends MethodHidingDemo{
	
	
	public static void m1(int x){ //m1(int)
	
    System.out.println("M1 from Child")	;
		
	}
	
	public static void main(String[] args){
		MethodHidingDemoChild ch = new MethodHidingDemoChild(); // no polmorphism
		
		ch.m1(10);//child
		
		MethodHidingDemo p = new MethodHidingDemo();
		p.m1(20); //parent
		
		MethodHidingDemo p2 = new MethodHidingDemoChild(); // polymorphism
		p2.m1(30); //child
		
		
	}
	
}