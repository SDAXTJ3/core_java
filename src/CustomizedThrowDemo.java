import java.io.IOException;
class ATMMAchine  extends IOException{ //child class of Throwable
                          //Fully checked 
ATMMAchine(String message){
	super(message);
}

}

public class CustomizedThrowDemo {
	
	public static void main(String[] args)  {
	try{
		int balance = 10000;
		int inputAmount = 0;
		if(args[0] !=null){
		 inputAmount = Integer.parseInt(args[0]);	
		}
		//common sense 
		if( inputAmount<balance ){
			System.out.println("Take your cash..");
	
		}
			
		else if(inputAmount > balance){
			
		throw new ATMMAchine("Insufficient Balance..");
		// program should stop 
		
		}
		
	}
	catch(Exception ex){
	System.out.println("Catch block ");	
	}	
	}
		
}