class WrapperUtilityMethodsDemo{
	
	// wrapper class immutability is limitedf to byte range
	public static void main(String[] args){
		
		int i = 128; //primitive int type
		//--> wrapping
		Integer i1= Integer.valueOf(i);
		Integer i2 = 128; //Integer.valueOf(127);
		
		//convert Wrapper to primitive
		int i3 = i1.intValue();
		
		String s1 = "10";
	//convert String to primitive	
int i4= Integer.parseInt(s1);
	// convert wrapper Object to String
	
	String s5 = i1.toString();
	
		System.out.println(s5);
		System.out.println(i1.hashCode() == i2.hashCode());
		
		System.out.println(i1 == i2); //true
		System.out.println(i1.equals(i2));  //true
		
	}
	
	
	
}