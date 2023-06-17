package ExceptionHandling;

//recommended: one try & one catch

public class Test11
{

	public static void main(String[] args) 
	{
			System.out.println("Program starts....");
		
		try
		{
			int a[]= {101,20,80};
			
			System.out.println(a[0]);
			System.out.println(a[3]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We are getting ArrayIndexOutOfBoundsException");
		}
		
		try 
		{
			System.out.println(10/0);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("We are getting ArithmeticException");
		}
		
		try 
		{
			Integer i1=new Integer("two");
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("we are getting NumberFormatException");
		}
		
			System.out.println("Rest of the code-1");
			System.out.println("Rest of the code-2");
			System.out.println("Rest of the code-3");
	}

}
