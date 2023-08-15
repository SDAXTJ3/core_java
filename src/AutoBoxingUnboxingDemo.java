class AutoBoxingUnboxingDemo{

static Integer i1 = "ten";  //Integer.valueOf(10);
static Integer i2 ; //null
public static void main(String[] args){
	
	add(i1,i2);
	
}
public static int add(int x, int y){
	
	return x+y;
}


}


