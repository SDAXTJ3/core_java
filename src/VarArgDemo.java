class VarArgDemo{


public static int add(int... x){ //new int[]{1,2,3}. int

int total = 0;

for(int i = 0 ;i<x.length ;i++){

total = total+x[i];
}
return total;

}



public static void main(String[] args){
	
	
	int x = add();
	System.out.println(x);
}


}