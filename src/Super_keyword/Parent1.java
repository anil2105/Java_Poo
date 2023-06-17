package Super_keyword;

public class Parent1
{
	int a=100;
	int b=200;
}

class Child1 extends Parent1
{
	int a=300;
	int b=400;
	
	void display(int a, int b)
	{
		System.out.println(super.a+super.b); //parent class instance variable calling-->super keyword
		System.out.println(this.a+this.b); //current class instance variable calling-->this keyword
		System.out.println(a+b); //local variable
		System.out.println("Child class Instance method");
	}
	
public static void main(String[] args)
	{
		Child1 c1=new Child1();
			c1.display(500, 600);
	}

}