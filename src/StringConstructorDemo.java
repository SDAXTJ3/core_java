public class StringConstructorDemo{
	
	public static void main(String[] args){
		
		String s1 = new String("durga");
		String s2 = new String();
		System.out.println(s1); //durga
		System.out.println(s2); //
		
		StringBuffer sb = new StringBuffer("Soft");
		String s3 = new String(sb);
		System.out.println(s3);
		
		char[] ch = {'a','b','c','d'};
		String s4 = new String(ch);
		System.out.println(s4);
	}
	
	
	
	
	
}