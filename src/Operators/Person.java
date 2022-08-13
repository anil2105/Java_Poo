package Operators;

//Instanceof operators  [instanceof]
//NOTE: Using instance of keyword, we are going to check the which type of object
//using reference variable Car, Bus, Mango, Student

public class Person //only Person
{

}

class Student extends Person //Student & Person 
{
	
}

class Car //Car No relation b/n Student & Person
{
	
	public static void main(String[] args) 
	{
		Person p1=new Person();
		
		Student s1=new Student();
		
		Car c1=new Car();
		
		System.out.println(p1 instanceof Person); //true
		System.out.println(p1 instanceof Student); //false
	//	System.out.println(p1 instanceof Car); //no relation with Person
		
		 System.out.println();
		
		System.out.println(s1 instanceof Person); //true
		System.out.println(s1 instanceof Student); //true
	//	System.out.println(s1 instanceof Car); //no relation with Student
		
		System.out.println();
		
	//	System.out.println(c1 instanceof Person); //no relation with Car
	//	System.out.println(c1 instanceof Student); //no relation with Car
		System.out.println(c1 instanceof Car); //true
	}
	
}