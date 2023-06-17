package Arrays;

public class Test4 
{
	public static void main(String[] args) 
	{
		boolean b[]=new boolean[100];
			
		System.out.println(b.length); //length 100	index 0 to 99

		System.out.println(b[99]); //false
		

		char c[]=new char[100];
			
		System.out.println(c.length); //length 100	index 0 to 99

		System.out.println(c[45]); // single space


		float f[]=new float[100];
			
		System.out.println(f.length); //length 100	index 0 to 99

		System.out.println(f[85]); //0.0

		
		double d[]=new double[100];
			
		System.out.println(d.length); //length 100	index 0 to 99

		System.out.println(d[100]); // ArrayIndexOutOfBoundException
	}
}
