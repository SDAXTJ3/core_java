public class ThreadPriorityDemo{

public static void main(String[] args){ //main thread is having by default 5 is priority
	
		System.out.println("Thread name - "+Thread.currentThread().getName()+"Thread priority is "+Thread.currentThread().getPriority());
	
	Thread.currentThread().setPriority(1);
	
	System.out.println("Thread name - "+Thread.currentThread().getName()+"Thread priority is "+Thread.currentThread().getPriority());
	
	MyThread mt = new MyThread();
	mt.start();
	mt.setPriority(10);
	
	MyThread mt2 = new MyThread();
	mt2.start();
		mt2.setPriority(5);
		
		for(int i =0;i<10;i++){
		try{
			Thread.sleep(2000);
			System.out.println("Thread name - "+Thread.currentThread().getName()+"priority is "+Thread.currentThread().getPriority());
		}
	catch(Exception ex){
		
		
	}
		
	}
	
}

}

class MyThread extends Thread{
	
	public void run(){
		
		System.out.println("Thread name - "+Thread.currentThread().getName()+" Thread priority is "+Thread.currentThread().getPriority());
		
		for(int i =0;i<10;i++){
		try{
			Thread.sleep(2000);
			System.out.println("Thread name - "+Thread.currentThread().getName()+"priority is "+Thread.currentThread().getPriority());
		}
	catch(Exception ex){
		
		
	}
		
	}
	
	
	
}
}