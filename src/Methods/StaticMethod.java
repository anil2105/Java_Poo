package Methods;

public class StaticMethod 
{
//Static Method With & Without Parameter
	
	//Static Method Without Parameter
	
	static void empInfo() //Static-->Non parameterized
	{
		System.out.println("Static Method without Parameter-1");
	}
		
	static void display()//Static-->Non parameterized
	{
		System.out.println("Static Method without Paramerter-2");
	}
	
	//Static Method With Parameter
	//P With
	static void empName(String eName, double sal,boolean marSt) //Static-->parameterized
	{
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(marSt);
		System.out.println("Static Method with Parameter-1");
	}
	
	static void empID(int empNo,char a) //Static-->parameterized
	{
		System.out.println(empNo);
		System.out.println(a);
		System.out.println("Static Method with Parameter-2");
	}

	public static void main(String[] args)
	{
	System.out.println("---------------Creating Object-----------------");	
	StaticMethod e1=new StaticMethod();	
	         e1.empInfo();
	         e1.display();
	         e1.empName("Ram", 75.555, true);	
	         e1.empID(20, 'f');
		
	System.out.println();
	System.out.println("--------------Directly----------------------");
	empInfo();
	display();
	empName("Dinga", 45.555, false);
	empID(30, 'G');


	System.out.println();
	System.out.println("------------------Using ClassName-----------------");
	StaticMethod.empInfo();
	StaticMethod.display();

	StaticMethod.empName("Konga", 55.555, true);
	StaticMethod.empID(50, 'P');

	}	
	
}
