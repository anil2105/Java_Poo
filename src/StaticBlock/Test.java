package StaticBlock;

public class Test
{
//Static block

	static
	{
		System.out.println("Static block-1");
	}
	static
	{
		System.out.println("Static block-2");
	}
	static
	{
		String s;
		s="Mamtha"; //local variable
		System.out.println(s);
		System.out.println("Static block-3");
	}

public static void main (String[]args)
	{
	
	 	//While loading main method automatically all static blocks are executed in top-down order only once

	}

}
