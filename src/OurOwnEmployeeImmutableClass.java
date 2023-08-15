//can we create our own class as Immutable?
final class OurOwnEmployeeImmutableClass{
	
	private String name;
	
	private Integer	empId;
	
	
	OurOwnEmployeeImmutableClass(){
		super();
	}
	
	OurOwnEmployeeImmutableClass(String name,Integer empId){
		super();
		this.name = name;
		this.empId = empId;	
	}
	
	
	
	public OurOwnEmployeeImmutableClass modify(OurOwnEmployeeImmutableClass im){
		if(this.name.equals(im.name) && (this.empId.equals(im.empId)) )
			return this;
		else
			return new OurOwnEmployeeImmutableClass(im.name, im.empId);
	}
	
	
}

class Client{
	
	public static void main(String[] args){
		
		OurOwnEmployeeImmutableClass im = new OurOwnEmployeeImmutableClass("Amit",101);
		
		OurOwnEmployeeImmutableClass im2 = new OurOwnEmployeeImmutableClass("Amol",101);
		
		OurOwnEmployeeImmutableClass im1 = im.modify(im2);
		
		System.out.println(im.hashCode() == im2.hashCode());
	}
	
	
	
}

