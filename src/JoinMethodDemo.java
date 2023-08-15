class MyThread extends Thread{
	Thread t1; 
	MyThread(Thread t1){
		this.t1 = t1;
	}//DeadLock Situation 
	public void run(){
	try{
			//t1.join();
	}
	catch(Exception ex){
		ex.printStackTrace();		
	}Thread.currentThread().setName("Sohan");
		 for(int i = 0;i<500;i++){
				 System.out.println("Hello "+" "+Thread.currentThread().getName());//sysout
				 try{
					Thread.sleep(2000); 
				 }
				catch(Exception ex){
					ex.printStackTrace();
				} 
	}			
	}	
}
public class JoinMethodDemo{
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = Thread.currentThread(); //main thread Object 
		
		Thread.currentThread().setName("Vishudha");
		MyThread t = new MyThread(t1);		// 1000ms - 1sec
		t.start();	
		t.join(10000);//Main Thread is waiting till 10 sec 
             for(int i = 0;i<10;i++){
				System.out.println("Hello "+" "+Thread.currentThread().getName());
				 try{
					Thread.sleep(2000); 
				 }
				catch(Exception ex){
					ex.printStackTrace();
				} 
			 }				
	}	
}