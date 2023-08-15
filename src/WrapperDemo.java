class WrapperDemo{
	
	public static void main(String[] args){
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		Integer i3 = new Integer("Ten");
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3); // NumberFormatException
	}
	
	
	
}