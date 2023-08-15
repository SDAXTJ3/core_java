class WaitNotifyDemo{
	
	public static void main(String[] args){
		
		
		LetterBox bx = new LetterBox();
		
		
		Thread.currentThread().setName("Amit");
		
		
		Postman pt = new Postman(bx);
		pt.start(); // responsible for updating letter Box and calls notify //method
		synchronized(bx){
			System.out.println("I am waiting for updation");
			try{
				bx.wait(5000);	
			}
	catch(InterruptedException ex){
		ex.printStackTrace();
	}System.out.println("Yes, I recived notification from Postman now I am reading the objet by getting lock from Postman");	
         System.out.println(bx.total);		
		}		
	}	
}

class Postman extends Thread{
	
	LetterBox bx ; 
	
	Postman(LetterBox bx){
		this.bx = bx;
	}
	
	public void run(){
		
		try{
			System.out.println("I am updating the LetterBox");
			Thread.sleep(5000); //5 sec
			synchronized(bx){ // acquring 
				bx.add(10,20); // responsible for updation
				//bx.notify();
				System.out.println("I have done with updation , and have notified Amit--");
			}
		}
		catch(InterruptedException ex){
			ex.printStackTrace();
		}
	}
	
	
}

class LetterBox {
	
	static int total = 0;
	
	
	public synchronized int add(int a,int b){
		
		total = a+b;
		return total;
	}
	
	
}
