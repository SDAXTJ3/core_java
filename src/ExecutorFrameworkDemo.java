//Executor Framework
import java.util.concurrent.*;
public class ExecutorFrameworkDemo{
	

public static void main(String[] args){
	
	ExecutorService service = Executors.newFixedThreadPool(4);	
	
	// A thread pool of 4 threads has been created
	MyRunnable[] jobs = new MyRunnable[]{
		new MyRunnable("Amit"),
		new MyRunnable("Shreya"),
		new MyRunnable("Rohit"),
		new MyRunnable("Parth"),
		new MyRunnable("Anuja"),
		new MyRunnable("Trupti")
	
	};
	
	for(MyRunnable job: jobs ){
		service.submit(job); // t.start();
	}
	service.shutdown();
}	


	
	
	
} 
class MyRunnable implements Runnable{
	
	String name;
	
	MyRunnable(String name){
		this.name = name;
	}
	
	public void run(){ //Thread won't return anything
		System.out.println("Thread "+Thread.currentThread().getName()+" running run method for "+name);
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("Completed!!");
	}
	
	
	
}
