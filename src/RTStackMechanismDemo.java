class RTStackMechanismDemo{
	
	public static void doStuff(){
		
		System.out.println("inside doStuff method--");
		doMoreStuff();
	}
	
	public static void doMoreStuff()//Shirwal, police -jvm
	
	{
		System.out.println("inside doMoreStuff method--"); //sysout
		try{
		System.out.println(10/0);//ArithmeticException - unchecked, forcefully ,accident //terminate, Abnormal Termination, worst 1000line risky code 	
		}
		catch(ArithmeticException ex){
				ex.printStackTrace();
			System.out.println(ex.toString()); //same
			System.out.println(ex); //same
			System.out.println(ex.getMessage()); //same
			
		}
		
		System.out.println("End of the doMoreStuff method "); //NT
	}
	
	public static void main(String[] args){
		
		doStuff();//default exception Handler printStackTrace()
	}
	
	
}