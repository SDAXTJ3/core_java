//Customized Exception Handling using try catch 

class CustExcepHandlingDemo{

public static void doStuff(){
		
	//System.out.println("inside doStuff method--");
		doMoreStuff();
	}
	
	public static void doMoreStuff()//Shirwal, police -jvm - 5000 line
	
	{
		try{
		System.out.println("inside doMoreStuff method--");//sysout 1
		
			System.out.println(10/0);//ArithmeticException - unchecked, forcefully//2 //,accident //terminate, Abnormal Termination, worst 1000line risky code
			System.out.println("Hello "); //3
		}
		 catch(NullPointerException ex){
			
			System.out.println("Hey Catch"); //4
		 }
		System.out.println("Hey Catch"); //5
	}
	
	public static void main(String[] args){
		
		doStuff();
	}




}