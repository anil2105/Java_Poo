package InstanceBlock;

public class Test
{
//Instance block

	{
		System.out.println("Instance block-1");
	}

	{
		System.out.println("Instance block-2");
	}

	{
		String s;
		s="Mamtha"; 		//local variable
		System.out.println(s);
		System.out.println("Instance block-3");
	}

public static void main(String [] args)
	{
		//1 object, 1 time - all instance blocks are executed
		
		Test t1=new Test(); //While creating an object, automatically all Instance blocks are executed in top-down order
		
	}

}
