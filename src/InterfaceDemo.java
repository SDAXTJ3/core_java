//interface - 100% abstract class 
// 100 % abstract class is nothing but interface
// each and every method is by default public and abstract
// we can not create interface object 
//  each and every variable in interface is by default public static  final
// Inteface can not be final
// It is highly recommened to access Inteface variables by interface name 
interface ATM{  

 int x = 10;  // public static  final  ATM.x 

  void cashWithdrawal(); //abstract
 
 boolean updatePin();
 
 double getBalance();
 
 String getMiniStatement();
 
 public void getFastrackLoan();



}

//100 classes implements ATM , 1 class- 

//ATM atm = new ATM(); //

abstract class Bank implements ATM{  // Bank is responsible to implement ATM interface

public  void cashWithdrawal(){  //concrete method 
// some java logic	by Bank People
	
}



public double getBalance(){
// some java logic
return 0.0;		
	
}

public String getMiniStatement(){
	
// some java logic
return null;	
}
}