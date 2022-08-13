package Operators;

public class Test4 
{
	public static void main(String[] args) 
	{
		//Conditional operators [? :]
		
		int x=10;
		int y=x>12?100:200;
		System.out.println(y); //200
		
		char ch=12.34==12.3?'A':'B';
		System.out.println(ch); //B
		
		int marks=55;
		
		String res=marks>50?"Pass":"False";
		System.out.println(res); //Pass
		
		//which is the largest number
		
		int a=10;
		int b=20;
		System.out.println(a>=b?10:20);
		
		
	}
}
