package Super_keyword;

public class Parent3 
{
Parent3(int a,boolean b)
{
	System.out.println(a);
	System.out.println(b);
	System.out.println("Parent class constructor");
}
}

class Child3 extends Parent3
{
	Child3(String s)
	{
		super(10, false); //parent class constructor calling-->super keyword
		System.out.println(s);
		System.out.println("Child calss constructor");
	}

	public static void main(String[] args) 
	{
		Child3 c1=new Child3("Microsoft");
	}
	
}

