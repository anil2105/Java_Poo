package This_keyword;

//this(10)----->to call one argument constructor
//Inside the Constructors this keyword  must be first statement
// in constructors(no compilation error)

public class Test6 
{
	Test6(char c)
	{
		this("TCS",100);
		System.out.println(c);
		System.out.println("Parametrized Constructor-1");
	}
	
	Test6(String s, int a)
	{
		System.out.println(s);
		System.out.println(a);
		System.out.println("Parametrized Constructor-2");
	}
	
	public static void main(String[] args) 
	{
		Test6 t=new Test6('M');
	}
}