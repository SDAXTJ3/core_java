class MyThread extends Thread{ 
	//override from Thread class
	public void run(){  //Job 
		
		for(int i = 1;i<=1000;i++){
			
			System.out.println("My Thread --"+i);
		}
		
	}	
}

public class ThreadCreationDemo{
	
	
	public static void main(String[] args){
		
		MyThread mt = new MyThread(); //create thread //main thread is //responsible to create child thread
		mt.start();
		for(int i =1;i<=1000;i++){
			
			System.out.println("Main Thread --"+i);
		}
	}
	
	
	
}