class SystemThreadGroup{


public static void main(String[] args){

Thread t = Thread.currentThread();	

ThreadGroup sys = t.getThreadGroup().getParent();

int activeThreadscount = sys.activeCount();

System.out.println("No of Active Threads in System group "+activeThreadscount);

ThreadGroup g1 = new ThreadGroup("Ahire"); // executed by main Thread 

 MyThread mt1 = new MyThread(); // main thread - main group
 System.out.println("MyThread with no arg is belong to "+mt1.getThreadGroup().getName()); //
 
  MyThread mt2 = new MyThread(g1,"Sohan"); 
  MyThread mt3 = new MyThread(g1,"Omkar"); 
  
  mt2.start();
  mt3.start();
  System.out.println(mt2.getName()+" is belong to "+mt2.getThreadGroup().getName()); 
  System.out.println("No of active threads from Ahire group "+g1.activeCount());
  
Thread[] input = new Thread[activeThreadscount];

sys.enumerate(input); //copy each active threads one by one into given Thread //Array

for(Thread t1: input){
	System.out.println("Name --> "+t1.getName()+" is Daemon?? "+t1.isDaemon());
	
}
	
}
}

class MyThread extends Thread{
	
	
	
	MyThread(ThreadGroup g1,String name){
		super(g1,name);
	}
	MyThread(){
		super();
	}
	
	public void run(){
		
		System.out.println("Hello Prajkta-");
		
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
	
}

