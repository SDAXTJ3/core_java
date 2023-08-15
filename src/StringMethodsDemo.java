public class StringMethodsDemo{
	
	public static void main(String[] args){
		
		String s2 = "AmolSoft";
		char ch = s2.charAt(3); //
		System.out.println (ch); 
		System.out.println (s2.equalsIgnoreCase("aMOL"));//true
		System.out.println (s2.equals("aMOL"));  // false 
		String s3 =s2.substring(1,6); //molsoft
		System.out.println (s3);//molSo
		
		String s4 = " Amol Software Solutions ";
		System.out.println(s4.trim());//Amol Software Solutions
		System.out.println(s2.indexOf('o'));
	}
	
	// public boolean equals(Object obj) object -- overriden for //content comparison
	// public boolean equalsIgnoreCase(Object obj)
	//public String subString(int begin);
	//public String subString(int begin,int end);
	
	
}