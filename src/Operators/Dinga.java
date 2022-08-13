package Operators;

//Instanceof operators  [instanceof]
//NOTE: Using instance of keyword, we are going to check the which type of object
//using reference variable Car, Bus, Mango, Student


public class Dinga //only Dinga
{
	
}
class Manga extends Dinga //Manga & Dinga
{
	
}

class Konga extends Manga //Konga Manga Dinga
{
	
}

class Singa extends Dinga //Singa & Dinga
{
	

	public static void main(String[] args) 
	{
		Dinga d1=new Dinga();
		
		Manga m1=new Manga();
		
		Konga k1=new Konga();
		
		Singa s1=new Singa();
		
		
		System.out.println(d1 instanceof Dinga); //true
		
		System.out.println(d1 instanceof Manga); //false
		
		System.out.println(d1 instanceof Konga); //false
		
		System.out.println(d1 instanceof Singa); //false
		
			System.out.println();
		
        System.out.println(m1 instanceof Dinga); //true
		
		System.out.println(m1 instanceof Manga); //true
		
		System.out.println(m1 instanceof Konga); //false
		
	//	System.out.println(m1 instanceof Singa); //no relation with Konga
		
			System.out.println();
		
        System.out.println(k1 instanceof Dinga); //true
		
		System.out.println(k1 instanceof Manga); //true
		
		System.out.println(k1 instanceof Konga); //true
		
	//	System.out.println(k1 instanceof Singa); //no relation with Konga
		
			System.out.println();
		
        System.out.println(s1 instanceof Dinga); //true
		
	//	System.out.println(s1 instanceof Manga); //no relation with Singa
		
	//	System.out.println(s1 instanceof Konga); //no relation with Singa
		
		System.out.println(s1 instanceof Singa); //true
		
	}
}
