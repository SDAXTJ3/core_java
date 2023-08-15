public class MethodSignatureClass{

//method Signature -- method name(type of arguments)


public static void m1(float y,  int x ){  //var arg method m1(float,int)
	
	System.out.println("m1(int...,float) method "); //2001
}


public static void  m1(int x){ //m1(int) 
System.out.println("m1(int) method ");  //1996 
}


public static void main(String[] args){
	
m1(10,10); 

}

//can not find symbol m1(int x)--> you are perfectly wrong
}

