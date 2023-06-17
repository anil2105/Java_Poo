package Super_keyword;

public class Parent2 
{
	void m1()
	{
		System.out.println("Parent class method");
	}
}

class Child2 extends Parent2
{
	void m1()
	{
		System.out.println("Child class method");
	}

	void display()
	{
		this.m1(); //current class method calling--> this keyword
		System.out.println("Child class method-1");
		super.m1(); //parent class method calling--> super keyword
	}
	
public static void main(String[] args) 
{
	Child2 c1=new Child2();
			c1.display();
	
}
}