public class StringInterningDemo{
	
	public static void main(String[] args){
		
		String s1 = new String("durga");
		String s2 = s1.intern();
		String s3 = "durga";
		System.out.println(s2 == s3); //true
	}
	
	
	
	
	
}