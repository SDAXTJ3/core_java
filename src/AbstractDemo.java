abstract  public class AbstractDemo{ // instance not applicable - new keyword
// m1 to m100 - not abstract 
public void m1(){
System.out.println("Abstract class m1 method");

}

 final public void m2(){
	
System.out.println("Abstract class m2 method");	
	 
 }//abstract keyword is missing 

final public void m3(){
	
}


}

class Client extends AbstractDemo{
	
	
	
	public static void main(String[] args){
	
	Client c = new Client();
	c.m2();
	
}
	
	
}



