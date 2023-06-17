package Operators;

public class Test3 
{
	public static void main(String[] args) 
	{
		//Logical Operator (&,!,^,|,&&,||)
							//binary numbers
		
		int x=10; //1010
		int y=8;  //1000

	/*	x=1010
		y=1000
		-----------
		& 1000 --> 8
		| 1010 --> 10
		^ 0010 --> 2	*/
		
		System.out.println(x & y); //8
		System.out.println(x | y); //10
		System.out.println(x ^ y); //2
		
	}
}
