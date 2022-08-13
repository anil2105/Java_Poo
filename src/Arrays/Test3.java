package Arrays;

public class Test3 
{
	public static void main(String[] args) 
	{
		double d[]=new double[8];//length 8
			d[0]=21.05;
			d[4]=27.07;
			d[7]=21.27;

		System.out.println(d.length); //length 8	index 0 to 7

		System.out.println(d[0]); //21.05
		System.out.println(d[1]); //0.0
		System.out.println(d[2]); //0.0
		System.out.println(d[3]); //0.0
		System.out.println(d[4]); //27.07
		System.out.println(d[5]); //0.0
		System.out.println(d[6]); //0.0
		System.out.println(d[7]); //21.27

	}
}
