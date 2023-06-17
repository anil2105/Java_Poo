package ScannerClass;

import java.util.Scanner;

public class Test
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter your information:");
		
		Scanner sc=new Scanner(System.in);
		//Scanner-->is a class(java.util)
		//System-->is a class(java.lang)
		//in-->static variable
		//System.in -->calling static variable by using class name
		//Object creation-->for calling instance variables
			
		System.out.println("Enter your name:");
		String sName=sc.nextLine();
		
		System.out.println("Enter your subject:");
		String sSubject=sc.nextLine();
		
		System.out.println("Enter your marks:");
		int sMarks=sc.nextInt();
		
		String res=sMarks>=35?"Pass":"Fail";
		
		System.out.println("Hello "+sName+" Your subject "+sSubject+" Marks "+sMarks+" Result ="+res);
	
	}
}