package ExceptionHandling;

public class Test3 
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
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("We are getting Excpetion");
		}
		
			System.out.println("Bye Bye");
	
			System.out.println("How are you?");
	
			System.out.println("Bye Bye");
		
			System.out.println("How are you?");
	}

}
