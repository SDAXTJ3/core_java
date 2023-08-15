public class YieldMethodDemo{
	
	
	
	public static void main(String[] args){
		
		MyThread t = new MyThread();		
		t.start();	
             for(int i = 0;i<10;i++){
				 System.out.println("Thread -"+Thread.currentThread().getName());
				 try{
					Thread.sleep(2000); 
				 }
				catch(Exception ex){
					ex.printStackTrace();
				} 
			 }				
	}	
}
class MyThread extends Thread{
	
	
	public void run(){
		Thread.yield();
		Thread.currentThread().setName("Amit");
		 for(int i = 0;i<100;i++){
				 System.out.println("Thread -"+Thread.currentThread().getName());
				 try{
					Thread.sleep(2000); 
				 }
				catch(Exception ex){
					ex.printStackTrace();
				} 

	}			
	}	
}