//POC
import java.util.concurrent.locks.*;
class LockUnlockDemo{
	
	public static void main(String[] args){

//Main Thread

Display d = new Display();



MyThread mt = new MyThread("Sachin", d);
mt.start();


MyThread mt2 = new MyThread("Sehwagn", d);
mt2.start();

	}		
	
	
	
	
	
}

class MyThread extends Thread{
	
	
	String name;
	
	Display d;
	
	MyThread(String name, Display d){
		this.name = name;
		this.d = d;
	}
	
	public void run(){
		
		d.wishMessage(name);			
	}
	
}

class Display{
	
	
	
public synchronized  void  wishMessage(String name){
	ReentrantLock l = new ReentrantLock();
	l.lock();
	
	for(int i =0;i<10;i++){
	System.out.print("Hello ");
	try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println(name);
}
	l.unlock();
}
	
}