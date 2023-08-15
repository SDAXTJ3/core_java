class A{  
	

public synchronized void d1(B b){ // T1
	
	System.out.println("T1 is operating on A");
	try{
		Thread.sleep(2000);
	}
	catch(InterruptedException ex){
		ex.printStackTrace();
	}
	System.out.println("T1 is now calling B's last method");
	b.last();
	System.out.println("Completed"); //sysout
}	

public synchronized void last(){ //T2
	System.out.println("T2 is operating on A's last method");
	
}
	
	
}

class B{
	
public synchronized void d1(A a){ //T2
	
	System.out.println("T2 is operating on B");
	try{
		Thread.sleep(2000);
	}
	catch(InterruptedException ex){
		ex.printStackTrace();
	}
	System.out.println("T2 is now calling A's last method");
	a.last();
	System.out.println("Completed");
	
}	

public synchronized void last(){ //T1
	System.out.println("T1 is operating on B's last method");
	
}
	
	
}

public class DeadLockDemo {
	
	public static void main(String[] args){
		
		A a = new A();
		B b = new B();
		MyThread mt = new MyThread(a,b);
		mt.start();
		
		try{
		Thread.sleep(2000);
	}
	catch(InterruptedException ex){
		ex.printStackTrace();
	}
		b.d1(a);
		
	}
	
	
}

class MyThread extends Thread{
	
	A a ;
	B b;
	
	MyThread(A a , B b){ ///constructor
		this.a = a;
		this.b = b;
	}
	
	public void run(){
		System.out.println("T1 is now calling A's d1 method");
		try{
		Thread.sleep(2000);
	}
	catch(InterruptedException ex){
		ex.printStackTrace();
	}
	
	a.d1(b);
	
	}
	
}