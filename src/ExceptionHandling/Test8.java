package ExceptionHandling;

//one try & multiple catch blocks are possible
//multiple try & one catch block not possible
//independent try block not possible
//independent catch block not possible

public class Test8 
{
	public static void main(String[] args) 
	{
			System.out.println("Program starts....");
		
		try
		{
			int a[]= {101,20,80};
			
			System.out.println(a[0]);
			System.out.println(a[2]);
			
			System.out.println(10/0);
		}
		catch (NumberFormatException e)
		{
			System.out.println("We are getting NumberFormatException");
		}
		catch (ArithmeticException e)
		{
			System.out.println("We are getting ArithmeticException");
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
