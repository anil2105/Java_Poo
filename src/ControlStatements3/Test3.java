package ControlStatements3;

//--> methods with  return type.
//--> other than void method, anything comes all are return types.

public class Test3 
{

	int display()
	{
		System.out.println("Return type Instance method");
		return 0;
	}
	
	public static void main(String[] args) 
	{
		Test3 t1=new Test3();
			t1.display();	//Return type Instance method
	}
}
