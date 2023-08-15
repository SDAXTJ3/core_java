import java.util.concurrent.locks.*;
import java.util.concurrent.*;
public class ReentrantLockDemo{

public static void main(String[] args){

ReentrantLock l = new ReentrantLock();

Display d = new Display(l);

MyThread t1 = new MyThread("Rohit Sharma",d);
t1.setName("Maruti");

MyThread t2 = new MyThread("Hardik Pandya",d);
t2.setName("TATA");
t1.start();
t2.start();


}	
	
}

class MyThread extends Thread{

Display d;

String name;

MyThread(String name, Display d){
		this.name = name;
		this.d = d;
	}
	
	public void run() {
		try{
			d.wishMessage(name);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}			
	}
	
	
}

class Display{
	
	ReentrantLock lock;
	
	Display(ReentrantLock lock){
		this.lock = lock;
	}
	
	public void  wishMessage(String name) throws InterruptedException{

	if(lock.tryLock(30,TimeUnit.SECONDS)){
		for(int i =0;i<4;i++){
	System.out.print("Hello "+Thread.currentThread().getName());
	try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println(name);
}
lock.unlock();
	}
	else{
		for(int i =0;i<10;i++){
	System.out.println("Hello I am doing another operation--"+Thread.currentThread().getName());
	try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
}
	}
	
}

	
	
}