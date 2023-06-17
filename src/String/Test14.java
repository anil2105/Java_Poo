package String;

//clonable-->duplicate/back up codes

public class Test14 implements Cloneable 
{
	int a = 100;
	int b = 200;

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Test14 t1 = new Test14(); //// original

		System.out.println(t1.a + "-----" + t1.b);

		Test14 t2 = (Test14) t1.clone(); // cloned/duplicate/backup codes

		System.out.println(t2.a + "......" + t2.b);

	}
}
