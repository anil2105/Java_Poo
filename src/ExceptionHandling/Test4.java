package ExceptionHandling;

public class Test4 
{
	public static void main(String[] args) 
	{
			System.out.println("Program starts....");
		
		try
		{
			int a[]= {101,20,80};
			
			System.out.println(a[0]);
			System.out.println(a[2]);
			
			System.out.println(10/2);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We are getting ArrayIndexOutOfBoundsException");
		}
		
			System.out.println("Rest of the code-1");
			System.out.println("Rest of the code-2");
			System.out.println("Rest of the code-3");
	}
}
