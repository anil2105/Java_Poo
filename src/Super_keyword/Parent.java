package Super_keyword;

//If variable names are different, we don't required any keyword

public class Parent 
{
	int a=100;
	int b=200;
}

class Child extends Parent
{
	int c=300;
	int d=400;
	
	void display(int e, int f)
	{
		System.out.println(a+b);
		System.out.println(c+d);
		System.out.println(e+f);
		System.out.println("Child class Instance method");
	}
	
public static void main(String[] args)
	{
		Child c1=new Child();
			c1.display(500, 600);
	}

}