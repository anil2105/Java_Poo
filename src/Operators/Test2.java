package Operators;

public class Test2 
{
	//Relational operators  [== != < > <= >=] 
	//NOTE:result will be always boolean value i.e., true / false
	
	public static void main(String[] args) 
	{
		
		int a=10;
		
		int b=2;
		
		String s1="Java";
		String s2="Python";
		String s3="Java";
		String s4="java";
		
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a<b); //false
		System.out.println(a<=b); //false
		System.out.println(a>b); // true
		System.out.println(a>=b); //true
		System.out.println(s1==s2); //false
		System.out.println(s1!=s2); //true
		System.out.println(s1==s3); //true
		System.out.println(s1!=s3); //false
		System.out.println(s3==s4); //false
		System.out.println(s3!=s4); //true
	}
}
