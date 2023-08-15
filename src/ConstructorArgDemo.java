class ConstructorArgDemo{

Object x ;

ConstructorArgDemo(Object x){
this.x = x;
System.out.println("Constructor called..");
}


public static void  main(String[] args){

String s1= "Amol";
ConstructorArgDemo t = new ConstructorArgDemo(s1);
System.out.println("value of x is "+t.x);
}

}
