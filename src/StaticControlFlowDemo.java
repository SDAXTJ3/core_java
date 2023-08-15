//Static Control Flow

// Oracle Certified Java Programmer -- 10k 

class Base{

static int x = 10;  // 1 x = 0 , RIWO , 7-> x = 10 R & W 

static{  //2 // 8 
	
	m1();
	System.out.println("FSB"); //SYSOUT
}

public static void main(String[] args){// p s v main(String[] args)  //3
	
	m1();
	System.out.println("main method"); 
}

public static void m1(){  //4
	System.out.println("y value is "+y); 
	
}

static{   //5
	
	
	System.out.println("SSB"); //9
}

static int y = 20;//6 y = 0 Read Indirectly Write Only RIWO , 10 y = 20
}


