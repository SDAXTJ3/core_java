public final class FinalDemo{


public void m1(){
	
	System.out.println("hello world from parent");
}

public void m2(){
	
	System.out.println("hello there from parent");
}



}

class FinalDemoTest extends FinalDemo{
	
	
	
	public static void main(String[] args){
		
		FinalDemoTest fd = new FinalDemoTest();
		
		fd.m1();
	}
	
}