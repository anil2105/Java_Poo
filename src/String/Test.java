package String;

public class Test 
{
	public static void main(String[] args) 
	{
		String s1="Poo"; //immutable 
		
		String s2=new String("Poo");
		System.out.println(s2);
		
		String s3=new String(s1);
		System.out.println(s3);
	}
}
