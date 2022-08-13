package This_keyword;

//this();------->to call zero argument constructor

public class Test5 
{
	Test5()
	{
		System.out.println("0-args Constructor");
	}
	
	Test5(String s, int a)
	{
		this();
		System.out.println(s);
		System.out.println(a);
		System.out.println("Parametrized Constructor-1");
	}
	
	public static void main(String[] args) 
	{
		Test5 t=new Test5("IBM",500);
	}
}