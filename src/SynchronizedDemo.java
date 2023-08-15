class WishMessageGenerator{
	

	public  synchronized  void  getWishMessage(String name){
		
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
	
	
	
}

public class SynchronizedDemo{
	
	public static void main(String[] args){
		
		WishMessageGenerator wmg1 = new WishMessageGenerator(); 
		WishMessageGenerator wmg2 = new WishMessageGenerator(); 
		WishMessageGenerator wmg3 = new WishMessageGenerator(); 
		WishMessageGenerator wmg4 = new WishMessageGenerator(); 
		
		MyThread t1 = new MyThread(wmg1,"Anuja"); 
		t1.start();
		
		MyThread t2 = new MyThread(wmg2,"Prajkta");
		t2.start();
		
		MyThread t3 = new MyThread(wmg3,"Bhagyashree");
		t3.start();
		
		MyThread t4 = new MyThread(wmg4,"Vishwajeet");
		t4.start();
		
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
		wmg.getWishMessage(this.name);
	}
	
}