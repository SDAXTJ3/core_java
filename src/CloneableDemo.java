class BankAccount implements Cloneable{
	
	Customer cust ;
	String bankName;
	
	BankAccount(Customer cust,String bankName){
		this.cust = cust;
		this.bankName = bankName;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return new BankAccount(new Customer(cust.custId,cust.acctNo,cust.branchName),bankName);
	}
		
}
class Customer{
	
	int custId;
	int acctNo;
	String branchName;
	
	Customer(int custId,int acctNo,String branchName){
		this.custId = custId;
		this.acctNo = acctNo;
		this.branchName = branchName;
	}
	
	
	public String toString(){
		return "Cust Id "+custId+", account number "+acctNo+" ,branch name "+branchName;
	}
	
}
class CloneableDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		Customer cust = new Customer(10,123456789,"Karad");
		BankAccount  acct = new BankAccount(cust,"HDFC");
		
		System.out.println("Bank Name "+acct.bankName+" ,Customer information -> "+acct.cust);
		
	BankAccount acct2 =	(BankAccount)acct.clone();
	BankAccount acct3 =	(BankAccount)acct.clone();
	acct3.cust.custId = 20;
	
	System.out.println("Bank Name "+acct2.bankName+"Customer information "+acct2.cust);
	System.out.println("Bank Name "+acct3.bankName+"Customer information "+acct3.cust);
	
	
	
	System.out.println("Original Object hashcode "+acct.hashCode()+" ,Clonned Object hashcode "+acct2.hashCode());
	
	System.out.println("Bank Name "+acct.bankName+" ,Customer information -> "+acct.cust);
		
	}
	
	
}