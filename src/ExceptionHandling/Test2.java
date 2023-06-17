package ExceptionHandling;

public class Test2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Hello");
	
			System.out.println("Hi");
	
			System.out.println("Bye");
	
			System.out.println(10/0); 
		}
		catch (ArithmeticException e) 
		{
			System.out.println(10/2);
		}
		
			System.out.println("Bye Bye");
	
			System.out.println("How are you?");
	
			System.out.println("Bye Bye");
		
			System.out.println("How are you?");
	}
}
