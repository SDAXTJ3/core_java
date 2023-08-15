
class ThreadGroupDemo{
	
	public static void main(String[] args){
	// Main Thread is running by default by JVM 
	Thread t = Thread.currentThread();
		System.out.println("Thread name is "+t.getName());
		
		System.out.println("Thread group is --> "+t.getThreadGroup().getName());
		
			System.out.println("main Thread group parent  is --> "+t.getThreadGroup().getParent().getName());
		
		System.out.println("Creating new Thread Group--");
		ThreadGroup g1 = new ThreadGroup("Dawood--");
		System.out.println(g1.getName()); // Dawood
		System.out.println(g1.getParent().getName());//main
		
		ThreadGroup g2  = new ThreadGroup(g1, "Infosys"); //
		System.out.println(g2.getName()); // Infosys
		System.out.println(g2.getParent().getName());//Dawood
	}
	
}