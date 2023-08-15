class WrapperBooleanDemo{
	
	public static void main(String[] args){
		
		Boolean b1 = new Boolean("yes");  //false
		Boolean b2 = new Boolean("no"); //false
	
		
		Boolean b3 = new Boolean("true");  //true
		Boolean b4 = new Boolean("True"); //true
		
		Boolean b5 = new Boolean("Amit"); //false
		Boolean b6 = new Boolean("Amit"); //false
		
		
		
		System.out.println(b1.equals(b2));  //true
		System.out.println(b3.equals(b4));  // true
		System.out.println(b5.equals(b6));  // true
		//System.out.println(i2);
		//System.out.println(i3); // NumberFormatException
	}
	
	
	
}