package TypeCasting;

public class Animal 
{
	void eat()
	{
		System.out.println("Eating..");
	}
	void sleep()
	{
		System.out.println("Sleeping..");
	}
}

class Dog extends Animal //4 methods
{
	void bark()
	{
		System.out.println("Barking..");
	}
	void wegtail()
	{
		System.out.println("Dog have wegtail..");
	}
}

class Cat extends Animal //4 methods
{
	
	void sound()
	{
		System.out.println("Meow meow..");
	}
	void milk()
	{
		System.out.println("Closed eyes..");
	}
	
public static void main(String[] args)
{
//Up-casting
//Whenever we are going for up-casting own class object methods won't work
	
	System.out.println("----------------UP-CASTING----------");
	
	System.out.println("----Dog class object Up-casting------");
	
	Animal a1=new Dog(); //Animal methods will work
			a1.eat();
			a1.sleep();
	
	System.out.println();
	System.out.println("----Cat class object Up-casting------");
	
	Animal a2=new Cat(); //Animal methods will work
			a2.eat();
			a2.sleep();
			
//Down-casting
//Whenever we are going for down-casting, without up-casting reference variable not possible
//If you try without up-casting reference variable, we will get ClassCastException
//All methods will work
			
			//Dog d1=new Animal(); //we will get CE
	
	System.out.println();
	
	System.out.println("----------------DOWN-CASTING------------");
	
		/*	Dog d1=(Dog)new Animal(); //we will get ClassCastException
				d1.eat();
				d1.sleep();
				d1.bark();
				d1.wegtail();  */
				
			Dog d1=(Dog)a1;	//it will work
				d1.eat();
				d1.sleep();
				d1.bark();
				d1.wegtail();
				
	System.out.println();
				
			//Cat c1=new Animal(); ////we will get CE
			

		/*   Cat c1=(Cat)new Animal(); //we will get ClassCastException
				c1.eat();
				c1.sleep();
				c1.sound();
				c1.milk();    */
				
			Cat c1=(Cat)a2;	//it will work
				c1.eat();
				c1.sleep();
				c1.sound();
				c1.milk();
}
}