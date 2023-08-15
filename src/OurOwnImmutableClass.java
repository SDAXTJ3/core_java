//can we create our own class as Immutable?
final class OurOwnImmutableClass{
	
	private OurOwnImmutableClass im ;
	
	OurOwnImmutableClass(){
		super();
	}
	
	OurOwnImmutableClass(OurOwnImmutableClass im){
		this.im = im;
	}
	
	
}
