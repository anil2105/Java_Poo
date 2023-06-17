package Operators;

public class Test5 
{
	public static void main(String[] args) 
	{
		int i=5;
		int j=8;
		int k=i++ + j++;
			  //5 + 8
		
		System.out.println("I="+i); //6
		System.out.println("J="+j); //9
		System.out.println("K="+k); //13
		
		System.out.println();
		
		int l=9;
		int m=3;
		int n=++l + ++l + ++l + l++ + m++ + ++m;
		    //10 + 11 + 12 + 12 + 3 + 5
		
		System.out.println("L="+l); //13
		System.out.println("M="+m); //5
		System.out.println("N="+n); //53
		
	}
}
