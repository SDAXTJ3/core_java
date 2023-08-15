//Proof Of Concept - POC

public class DaemonThreadDemo{
	
	public static void main(String[] args){
		
		System.out.println("Thread name is "+Thread.currentThread().getName());
		
		System.out.println("Is Daemon??"+Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		DaemonThread dt = new DaemonThread(); //Main Thread is creating //Child Thread
		dt.setDaemon(true);
		dt.start();
		
		System.out.println("Is child Thread Daemon??"+dt.isDaemon());
	}
	
}

//public boolean isDaemon()
class DaemonThread extends Thread{
	
	public void run(){
		MyThread mt = new MyThread();
		mt.start();
	
		try{
		Thread.sleep(5000);
		}     //IE 
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("DaemonThread ");
			System.out.println("Is child MyThread Thread Daemon??"+mt.isDaemon());
	}
	
	
}

class MyThread extends Thread{
	
	public void run(){
		try{
		Thread.sleep(5000); //HSBC
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("MyThread ");
	}
	
	
	
	
	
}