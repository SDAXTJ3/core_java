public class InterruptDemo{
	
	public static void main(String[] args){// 60% String , parsing from String wrapper //classes
		Thread t1 = Thread.currentThread(); //main thread
		Thread.currentThread().setName("Vishwajeet--");
		System.out.println("Hello from  "+Thread.currentThread().getName());
		MyThread mt = new MyThread(t1);//
		mt.start();
        mt.interrupt(); //if running thread is in sleeping or not continueously //check		
	}	
}

class MyThread extends Thread{
	
	Thread t1; //coming from Main Thread
	
	MyThread(Thread t1){
		this.t1 = t1;
	}
	
	public void run(){
	
		Thread.currentThread().setName("Omkar--");
		for(int i = 0;i<10;i++){
			System.out.println("Hello from  "+Thread.currentThread().getName());
			try{
			t1.join();
			}
			catch(InterruptedException ex){
				System.out.println("I got interrupted!!");
			}
		}
			
	}
		
}