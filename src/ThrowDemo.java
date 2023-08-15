//throw , throws
class ThrowDemo{
	
	public static void main(String[] args){
		System.out.println("Inside main method "); 
		m1();
	}
	
	public static void m1(){
		
		//System.out.println(10/0); //AE //mkethod m1 is responsible to throw //exception objct automatically
		throw new ArithmeticException(); //programmer is responsible 
	}
	
	
}