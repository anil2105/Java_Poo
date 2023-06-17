package WrapperClasses;

public class Test 
{
	//we can pass the number String
	//we cannot pass the character String

		public static void main(String[] args) 
		{
			Integer i1=new Integer(100);
			System.out.println(i1); //100
			
			Integer i2=new Integer("200"); //we can pass the number String
			System.out.println(i2); //200
			
			Integer i3=new Integer("ten"); //we cannot pass the character String
			System.out.println(i3); //NumberFormatException
		}
}
