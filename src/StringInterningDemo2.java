public class StringInterningDemo2{
	
	public static void main(String[] args){
		
		String s1 = new String("durga");
		String s2 = s1.concat("software");
		String s3 = s2.intern();
		String s4 = "durgasoftware";
		System.out.println(s3 == s4); //true
	}
	
	
	
	
	
}