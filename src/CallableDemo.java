import java.util.concurrent.*;
class CallableDemo{
	
	public static void main(String[] args) throws Exception{
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Callable[] jobs = new MyCallable[]{
			new MyCallable(10,20,"Amit"),
			new MyCallable(30,20,"Amar"),
			new MyCallable(40,20,"Amol"),
			new MyCallable(50,20,"Aditya"),
			new MyCallable(60,20,"Rohit"),
			new MyCallable(70,20,"Parth")
			
		} ;		
		for(Callable job: jobs){
		Future future = service.submit(job);
		System.out.println(future.get());
		}
		service.shutdown();		
	}	
}
class MyCallable implements Callable{	
	int number1;
	int number2;
	String name;	
	MyCallable(int number1, int number2,String name){
		this.number1 = number1;
		this.number2 = number2;
		this.name = name;		
	}
	public Object call()throws InterruptedException{
		Thread.currentThread().setName(name);
		System.out.println("Thread ----> "+Thread.currentThread().getName());
		Integer sum = 0;
		sum = number1+number2;
		return sum;		
	}
	
}