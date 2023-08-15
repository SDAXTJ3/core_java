class ThrowsDemo{


public static void giveTaskTovishwajeet() throws Exception{
	
	System.out.println("Calling doMoreStuff method");
	assignTasktoOmkar();
}


public static void assignTasktoOmkar() throws Exception{
	
	System.out.println("going to sleep");
	
		Thread.sleep(5000); //checked exception InterruptedException
	
	
	
}


public static void main(String[] args) throws Exception{
	doStuff();
}
}