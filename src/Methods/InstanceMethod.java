package Methods;

public class InstanceMethod 
{
//Instance Method With & Without Parameter
	
	//Instance Method Without Parameter
	
	void empInfo() //Instance-->Non parameterized
	{
		System.out.println("Instance Method without Parameter-1");
	}
		
	void display() //Instance-->Non parameterized
	{
		System.out.println("Instance Method without Paramerter-2");
	}
		
	//Instance Method With Parameter
	
	//P with
	
	void empName(String eName, double sal,boolean marSt)// Instance-->parameterized
	{
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(marSt);
		System.out.println("Instance Method with Parameter-1");
	}

	void empID(int empNo,char a) //Instance-->parameterized
	{
		System.out.println(empNo);
		System.out.println(a);
		System.out.println("Instance Method with Parameter-2");
	}

	public static void main(String[] args)
	{
		 InstanceMethod e1=new InstanceMethod();	//Object creation
	         e1.empInfo();
	         e1.display();
	         e1.empName("Ram", 75.555, true);	
	         e1.empID(20, 'f');
			
	}	
	
	
}
