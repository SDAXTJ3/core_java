class ParentMain{
 //method Hiding --main method is a static

public static void main(String[] args){
	
	System.out.println("A class Main string method ");
}

public static void main(int[] args){
	
	System.out.println("A class Main int  method ");
}


}

class ChildMain extends ParentMain{

public static void main(int[] args){
	
	System.out.println("B class Main int method ");
}

public static void main(String[] args){
	
	System.out.println("B class Main String method ");
	
	//ChildMain ch = new ChildMain();
	
}


}

//javac mainMethodInheritance.java  --  ParentMain.class, ChildMain.class

//java ParentMain 

//java ChildMain