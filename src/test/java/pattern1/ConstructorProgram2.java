package pattern1;

public class ConstructorProgram2 extends ConstructorProgram1

{
	
	void numb()
	
	{
		System.out.println(super.id);
	}

	public static void main(String[] args) {
	
	
	 ConstructorProgram1 P= new ConstructorProgram1();
	 
	 ConstructorProgram2 P2= new ConstructorProgram2();
	 
 P2.numb();
 

	 

	}

}
