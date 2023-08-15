class ParentClass{
	
	int x1 = 10;
	static int y = 20;
	Object obj;
	int j;	
}
class ChildClass extends ParentClass{	
	Integer i1 ; //default value = null
	Integer i2 = 10;
	
public static void main(String[] args){
	
	ChildClass c1 = new ChildClass();
	c1.m1(); //null	
}
public void m1(){
	System.out.println(""+(i1+i2)); //null + 1  ==>  i1.intValue()+i2.intValue(); //NullPointerException
}	
}