//VIMP - Question for every java developer in interview and day to day coding

class StartThread extends Thread{
	
	
	public void run(){
		
		for(int i =0;i<10;i++){
		try{
			Thread.sleep(2000);
			System.out.println("Start Thread");
		}
	catch(Exception ex){
		
		
	}
	}
	}	
}

public class StartThreadConceptDemo{
	
	
	public static void main(String[] args){
		StartThread mt = new StartThread(); // Thread created, New State, Born State
		
		mt.start(); //Runnable state  // Thread Scheduler - Running ,Dead 
		mt.start(); //IllegalThreadStateException
		
	}
	
	
}