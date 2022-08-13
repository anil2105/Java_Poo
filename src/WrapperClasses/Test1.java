package WrapperClasses;

public class Test1 
{
	public static void main(String[] args) 
	{
		Float f1=new Float(11.11);
		System.out.println(f1); //11.11
		
		Float f2=new Float(99.99); 
		System.out.println(f2); //99.99
		
		Float f3=new Float("11"); 
		System.out.println(f3); //11.0
		
		Float f4=new Float("One"); 
		System.out.println(f4); //NumberFormatException

	}
}
