class FinallyDemo{
	
	
	public static void m1(){
		System.out.println("Open the DB conection");
		try{
			
			System.out.println(10/0);
		}catch(NullPointerException ex){
			System.out.println("Inside Arithmatic Exception catch block");
			
		}finally{
			
			System.out.println("Close the conection ");
		}
		System.out.println("end of the method----- ");
		
	}
	
	public static void main(String[] args){
		
		m1();
	}
	
	
	
	
}