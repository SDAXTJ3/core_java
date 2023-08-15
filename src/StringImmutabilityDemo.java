class StringImmutabilityDemo{
	
	public static void main(String[] args){
		
		String s1 = new String("you cannot change me!");
		String s2 = new String("you cannot change me!");
		System.out.println(s1 == s2); //false
		String s3 = "you cannot change me!";
		String s4 = "you cannot change me!";
		System.out.println(s1 == s4); //false
		System.out.println(s1 == s3);//false
		String s5 = "you cannot "+"change me!";
		System.out.println(s3 == s5); //true
	    String s6 = "you cannot "; //s6 is not final 
	     String s7 = s6+"change me!";
		 System.out.println(s3 == s7); //false
		 final String s8 = "you cannot ";
		 String s9 = s8+"change me!";
		 System.out.println(s3 == s9); //true
		 System.out.println(s6 == s8); //.true

		
	}
	
	
}