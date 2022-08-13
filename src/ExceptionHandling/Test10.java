package ExceptionHandling;

//default exception
//catch (Exception e)
//always default exception must be last statement in catch block

public class Test10 
{
	public static void main(String[] args) 
	{
			System.out.println("Program starts....");
		
		try
		{
			int a[]= {101,20,80};
			
			System.out.println(a[0]);
			System.out.println(a[2]);
			
			System.out.println(10/5);
			
			Integer i1=new Integer("two"); //NumberFormatException
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("We are getting ArithmeticException");
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("We are getting ArrayIndexOutOfBoundsException");
		}
		
		catch (Exception e) 
		{
			System.out.println("We are getting Exception");
		}
		
			System.out.println("Rest of the code-1");
			System.out.println("Rest of the code-2");
			System.out.println("Rest of the code-3");
	}
}
