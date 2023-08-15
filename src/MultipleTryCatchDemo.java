//Try with Multiple Catch Block


class MultipleTryCatchDemo{

public static void m1(){
	
	
	try{
		
	System.out.println(10/0);//ArithmeticException
	MultipleTryCatchDemo md = null;
	//md.m2();//NullPointerException
	
	
	}
	
	//System.out.println("Before Catch Block");
	catch(NullPointerException t){// worst coding practice
		
		System.out.println("Inside NullPointerException Catch Block");
		
	}
	catch(Throwable t){
		System.out.println("Inside Throwable Catch Block");
	}
	
}
	public void m2(){
		
	}

public static void main(String[] args){
		
		m1();
	}
	



}