class MyRunnable implements Runnable{
	
	
	private String name ;
	
	public MyRunnable(String name){
		this.name = name;
	}
public void run(){ //override 
	//job
	for(int i =0;i<20;i++){
		
		System.out.println("Hello "+name);
	}
		
}
	
}

public class RunnableDemo{
	
	public static void main(String[] args){ // 1 to 10 - 5 
		
		String name = "Dhoni";
		MyRunnable r1 = new MyRunnable("Virat Kohli");
		Thread t = new Thread(r1); ///Thread Creation
		t.start(); // Thread started
		
		
		MyRunnable r2 = new MyRunnable("Sachin ");
		Thread t2 = new Thread(r2);
		t2.start();
		for(int i =0;i<20;i++){
		
		System.out.println("Hello "+name);
	}	
	}
	
}