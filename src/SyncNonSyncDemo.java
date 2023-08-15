public class SyncNonSyncDemo{
	
	public static void main(String[] args){
		WishMessageGenerator wmg = new WishMessageGenerator();
		
		MyThread1 t1 = new MyThread1(wmg, "Parth");
		MyThread1 t2 = new MyThread1(wmg,"Aaba");
		
		MyThread2 t3 = new MyThread2(wmg,"Omkar");
		MyThread2 t4 = new MyThread2(wmg,"Dawood");
		
		t1.start(); //calling sync m1 
		t2.start(); //calling sync m1 waiting state 
		
		t3.start(); //calling non sync m2 
		t4.start();// calling non sync m2 
		
		
	}
	
	
	
}

class MyThread1 extends Thread{
	
	private WishMessageGenerator wmg;
	
	private String name;
	
	MyThread1(WishMessageGenerator wmg,String name){
		this.wmg = wmg;
		this.name = name;
	}
	
	
	public void run(){
		System.out.println("Object wmg hashcode "+wmg.hashCode());
		wmg.m1(this.name);
	}
	
}class MyThread2 extends Thread{
	
	private WishMessageGenerator wmg;
	
	private String name;
	
	MyThread2(WishMessageGenerator wmg,String name){
		this.wmg = wmg;
		this.name = name;
	}
	
	
	public void run(){
		System.out.println("Object wmg hashcode "+wmg.hashCode());
		wmg.m2();
	}
	
}

class WishMessageGenerator{

	public  synchronized  void  m1(String name){ //m1
		
		for(int i =0;i<5;i++){
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			ex.printStackTrace();	
			}
		System.out.println("Wish you happy new year "+name);	
		}
		
		
	}
	
	public static  synchronized  void m2(){ //m2
		for(int i =0;i<5;i++){
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			ex.printStackTrace();	
			}
		System.out.println("Hello World ");	
		}
		
	}
	
	
	
}
