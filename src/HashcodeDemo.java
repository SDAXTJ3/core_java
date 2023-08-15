class HashcodeDemo{

public static void main(String[] args){
HashcodeDemo d1 = new HashcodeDemo();

System.out.println(d1.hashCode());

HashcodeDemo d2 = d1;

System.out.println(d2.hashCode());

System.out.println(d1.hashCode() == d1.hashCode());

}



}