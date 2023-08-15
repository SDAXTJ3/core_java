public class JVMWorkingPrincipal{

int x = 10; // instance control flow -7 x = 0  9 x = 10


static int y = 20; // static - static control flow  - 1 y = 0; RIWO - Read Indirectly //Write Only // 4 -- y = 20

//static block // 
static{ // static - static control flow  -- 2

System.out.println("Class is loading -- ");  //5 -  Class is loading -- 
}

public static void main(String[] args){ // static - static control flow  -3 
// 6 -
System.out.println("Class is loaded and we are creating Object "+y);
JVMWorkingPrincipal jvm1 = new JVMWorkingPrincipal();
jvm1.m1();
System.out.println("y value is "+y); 

}
// instance block - instance control flow
{
System.out.println("Before creating object ");// 8 
}
//constructor
public JVMWorkingPrincipal(){ //- instance control flow //9 

super();
System.out.println("Object created successfully-- "+x);
}

public void m1(){ // instance method
	
	System.out.println("Static variable y value is in instance method "+y);
}

}