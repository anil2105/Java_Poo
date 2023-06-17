package ExceptionHandling;

//finally block always run

public class FinallyBlock1
{
	public static void main(String[] args) 
	{
			System.out.println("Program starts....");
		
		try
		{
			int a[]= {101,20,80};
			
			System.out.println(a[0]);
			System.out.println(a[20]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We are getting ArrayIndexOutOfBoundsException");
		}
		
		finally 
		{
			System.out.println("Clean up the code/close the database");//always run
		}
		
			System.out.println("Rest of the code-1");
			System.out.println("Rest of the code-2");
			System.out.println("Rest of the code-3");
	}
}
