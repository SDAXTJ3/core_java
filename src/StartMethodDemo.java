class MyRunnableStart extends Thread{
	
	
	private String name ;
	
	public MyRunnableStart(String name){
		this.name = name;
	}
	
	public void run(){  //job
		
		for(int i =0;i<10;i++){
		try{
			Thread.sleep(2000);
			System.out.println("MyRunnableStart "+name);
		}
	catch(Exception ex){
		}		
}
}	
public void start(){ 	
		super.start();
		System.out.println("after calling Thread class start method");	
	}
}
public class StartMethodDemo{
		
	public static void main(String[] args){
		
		String name = "Dhoni";
		MyRunnableStart r1 = new MyRunnableStart("Shreya");
		 //
		r1.start(); // 
		
		
		MyRunnableStart r2 = new MyRunnableStart("Bhagyashree ");
		
		r2.start();
		MyRunnableStart r3 = new MyRunnableStart("Sohan ");
		
		r3.start();
		 //normal method call
		for(int i =0;i<10;i++){
		try{
			Thread.sleep(2000);
			System.out.println("main Thread");
		}
	catch(Exception ex){
		
		
	}
	}	
	}
}