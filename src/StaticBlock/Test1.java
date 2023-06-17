package StaticBlock;

public class Test1
{
//Static block

	static
	{
		System.out.println("Static block-1"); //Static block
	}
	
	{
		System.out.println("Instance block-1"); //Instance block //depends on object
	}
	static
	{
		String s="Mamtha"; //local variable
		System.out.println(s);
		System.out.println("Static block-2"); //Static block
	}



public static void main (String[]args)
	{

	
	}

}