public class CloningDemo{
	//By defaullt Object class clone method supports Shallow //cloning which is not recommended
	public static void main(String[] args) throws Exception{
		
		Customer cust = new Customer(123456789,"Shreya","Karad");
		BankAccount bk = new BankAccount("IDFC" , cust);
		
		System.out.println(bk);
	BankAccount bk2 = 	(BankAccount)bk.clone();
	System.out.println(bk2);
	
	bk2.cust.acctNo = 548734634;
	
	System.out.println(bk);
	System.out.println(bk2);
	}
	
	
//unreported 	
	
}

class BankAccount implements Cloneable{  
	
	String bankName;
	
	Customer cust; // HAS_A relationship , Composition
	
	
	BankAccount(String bankName, Customer cust){
		this.bankName = bankName;
		this.cust = cust;
	}
	
	public String toString(){
		
		return "Hashcode of BankAccount "+this.hashCode()+"Bank Name "+bankName+"Hashcode of customer "+cust.hashCode()+", Customer Information "+cust;
	}
	
	public Object clone() throws CloneNotSupportedException{
		
		//Deep Cloning
		return new BankAccount(this.bankName, new Customer(this.cust.acctNo,this.cust.custName,this.cust.branch));
	}
}

class Customer{
	
	int acctNo;
	String custName;
	String branch;
	
	Customer(int acctNo,String custName,String branch ){
		this.acctNo = acctNo;
		this.custName = custName;
		this.branch = branch;
	}
	
	public String toString(){
		return ", Cust Acct Number "+acctNo+", Customer name "+custName+", Branch "+branch;
	}
	
}

