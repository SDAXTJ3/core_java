class Base{  //Parent
	
	
	static int x = 10; //1 x = 0 , RIWO - Read Indirectly Write Only, // 12->x = 10 R&W
	
	static{  //2 , 13 
		
		m1();
		System.out.println("Base SB");
	}
	
	public static void main(String[] args){ //3 
		
		m1();
		System.out.println("Base Main");
	}
	
	public static void m1(){  //4
		System.out.println("y value = "+y); 
	}
	
	static int y = 20; //5 y = 0 , RIWO , 14 y = 20 R&W
}

class Derived extends Base{ // Child 
	
	static int i = 100; //6 i = 0 , RIWO , 15 -> i = 100, R&W
	static{ //7 , 16 
		m2();
		System.out.println("Derived  First Static Block");		
	}
	
		public static void main(String[] args){ //8 , 19
		
		m2();
		System.out.println("Derived Main");
	}
	
	public static void m2(){ //9
		System.out.println("j value = "+j); //17 j = 0 
	}
	
	static{ //10 , 18
		System.out.println("Derived Second Static Block ");
		
	}
	static int j = 200; //11 j = 0 RIWO , 19 j =200 R&W
		
}