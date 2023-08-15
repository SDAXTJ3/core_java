import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class Display{
ReentrantLock l = new ReentrantLock();
public  void wishMessage(String name) throws InterruptedException{
	

	if(l.tryLock(16,TimeUnit.SECONDS)){
		
	//safe operation
	System.out.println(Thread.currentThread().getName()+" holding lock for "+l.getHoldCount()+" times ");
	for(int i = 0;i<5; i++){
	System.out.print("Hello ");
	try{
        Thread.sleep(3000); //15 sec0
	}
	catch(InterruptedException ex){
		ex.printStackTrace();
		
	}
		System.out.println(name);
}


	System.out.println(Thread.currentThread().getName()+" holding lock for "+l.getHoldCount()+" times ");
	l.unlock();
}
else{
	//alteranate operation
	for(int i = 0;i<4; i++){
	System.out.print("Hello ");
	try{
        Thread.sleep(2000);
	}
	catch(InterruptedException ex){
		ex.printStackTrace();
		
	}
		System.out.println(Thread.currentThread().getName()+" I didn't get lock and I am doing alternate operation");
}
	
	
}
}	
}

class MyThread extends Thread{
	
	Display d;
	String name;
	
	MyThread(Display d, String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		try{
			d.wishMessage(name);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
	}
	
}

public class ReentrantLockDemoSync{
	
	
	public static void main(String[] args){
		
		
		Display d = new Display();
		
		MyThread mt1 = new MyThread(d,"Dhoni");
		MyThread mt2 = new MyThread(d,"Kohli");
		
		mt1.start();
		mt2.start();
	}
	
	
}