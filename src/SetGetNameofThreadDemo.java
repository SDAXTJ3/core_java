public class SetGetNameofThreadDemo{
	

public static void main(String[] args){
	MyThread t = new MyThread();
	t.start();
	
	Thread.currentThread().setName("Sohan");
	System.out.println("Main thread name is "+Thread.currentThread().getName());  //main
		
		Thread.currentThread().start();//IllegalThreadStateException
		
		MyThread t2 = new MyThread();
	t2.start();
	
		MyThread t3 = new MyThread();
	t3.start();
}	
	
	
}
class MyThread extends Thread{
	
	public void run(){	
	Thread.currentThread().setName("Vishwajeet");
		System.out.println(Thread.currentThread().getName()); //Thread-0
		//System.out.println(10/0);
	}
	
	
	
}