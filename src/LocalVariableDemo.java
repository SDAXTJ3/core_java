//Postmartum on Local varible

public class LocalVariableDemo{
//java.lang
static int z ; // special arrangment default values  = 0

int y ; //0                               //Command Line Argument
public synchronized final static void main(String[] args){
//vimp concept
int x  ; //local variable , JVM will not assign default value

if(args.length > 2){
	
	x = 20;
}else{
	
	x = 30;
}
System.out.println(x);
}

}
// java Localvariable 10 20 
//a. Compile and run
//b. compile failed
// c. compile but exception
// none of the above