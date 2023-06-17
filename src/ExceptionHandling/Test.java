package ExceptionHandling;

public class Test 
{
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
	
		System.out.println("Hi");
	
		System.out.println("Bye");
	
		System.out.println(10/0); //ArithmeticException
	    
		//once exception comes,remaining codes won't be executed
		
		System.out.println("Bye Bye");
	
		System.out.println("How are you?");
	}
}
