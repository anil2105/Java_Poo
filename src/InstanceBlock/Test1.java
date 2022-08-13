package InstanceBlock;

public class Test1
{
//Instance block

	{
		System.out.println("Instance block-1");
	}

	{
		System.out.println("Instance block-2");
	}
	
	{
		String s="Mamtha";		//local variable
		System.out.println(s);
		System.out.println("Instance block-3");
	}

public static void main(String [] args)
	{
		//3 objects, 3 times - all instance blocks are executed
		//While creating an object, automatically all Instance blocks are executed in top-down order
	
		Test1 t1=new Test1();

		System.out.println();
		Test1 t2=new Test1();

		System.out.println();
		Test1 t3=new Test1();

	}

}

