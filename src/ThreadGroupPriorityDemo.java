class ThreadGroupPriorityDemo{
	
	public static void main(String[] args){
		
		ThreadGroup g1 = new ThreadGroup("Ahire"); //setMaxPriority
		
		System.out.println(g1.getMaxPriority());  //10
		
		MyThread mt1 = new MyThread(g1,"Sohan");
		mt1.start();
		
		MyThread mt2 = new MyThread(g1,"Omkar");
		mt2.start();
		
		System.out.println(mt1.getPriority()); // 5
		System.out.println(mt2.getPriority()); //5
		
		g1.setMaxPriority(3); //max priority of group is now 3
		
			MyThread mt3 = new MyThread(g1,"Rohit");
		    mt3.start();
		
		System.out.println(g1.getMaxPriority());//3
		System.out.println(mt3.getPriority()); //3
		System.out.println(mt1.getPriority()); // 5
		System.out.println(mt2.getPriority());//5
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
