class StringSCPDemo{
	
	public static void main(String[] args){
		String s1 = new String("Amol");
		String s2 = new String("Amol");
		
		
	//runtime method call
		
		System.out.println(s1 == s2); //false
		System.out.println(s1.equals(s2)); //true
		//System.out.println(s2 == s3);
		//System.out.println(s3); //Amol
		//System.out.println(s4); //AmolSoft
		
	}
	
	
}