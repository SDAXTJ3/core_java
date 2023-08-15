//synchronized Block 

public class SyncBlockDemo{
	
	public static void main(String[] args)
	{
		//Wmg wmg = new Wmg()
		WishMessageGenerator wmg = new WishMessageGenerator();
		MyThread t1 = new MyThread(wmg,"Shreya"); // 
		MyThread t2 = new MyThread(wmg,"Priti");
		MyThread t3 = new MyThread(wmg,"Radhika");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}

class WishMessageGenerator{

	public void m1(String name){
		
		System.out.println("Statement 1");	
		System.out.println("Statement 2");	
		System.out.println("Statement 3 ");	
		
		synchronized(this){  //synchronized area
		for(int i =0;i<5;i++){
			
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			ex.printStackTrace();	
			}
		System.out.println("Hello  "+name);	
		}
		}
		System.out.println("Statement 4 ");
		System.out.println("Statement 5 ");
		System.out.println("Statement 6 ");
		
	}
}
class MyThread extends Thread{
	
	private WishMessageGenerator wmg;
	
	private String name;
	
	MyThread(WishMessageGenerator wmg,String name){
		this.wmg = wmg;
		this.name = name;
	}
	
	
	public void run(){
		System.out.println("Object wmg hashcode "+wmg.hashCode());
		wmg.m1(this.name);
	}
	
}