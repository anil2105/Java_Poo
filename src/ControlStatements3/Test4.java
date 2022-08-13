package ControlStatements3;

//--> methods with  return type.
//--> other than void method, anything comes all are return types.

public class Test4 
{
	boolean display()
	{
		System.out.println("Return type Instance method");
		return false;
		
	}
	
	public static void main(String[] args) 
	{
		Test3 t1=new Test3();
			t1.display();	//Return type Instance method
	}

}
