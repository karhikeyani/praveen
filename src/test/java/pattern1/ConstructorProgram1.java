package pattern1;

public class ConstructorProgram1 {
	
	
	int id = 30;
	
	public void  num() {
		
		int id =60;
	}
	
	public ConstructorProgram1()
	{
		System.out.println("My name is Karthik");
		
	
	}
	public ConstructorProgram1(int i )
	
	{
		this(23.f);
		
		System.out.println("gff");
	}
	

public ConstructorProgram1(float i )
	
	{
	
		System.out.println("brother name is ranjith kumar");
		
	}
	
	public static void main(String[] args) {
		 ConstructorProgram1 P= new ConstructorProgram1();
		 ConstructorProgram1 P2= new ConstructorProgram1(10);
		 
		 
	

	}

}
