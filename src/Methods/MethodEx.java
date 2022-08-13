package Methods;

public class MethodEx 
{
//Instance Method with & Without Parameter
	//without
	void blue() //Instance-->Non parameterized
	{
		System.out.println("Instance Method without Parameter-1");
	}
	//Without
	void m2() //Instance-->Non parameterized
	{
		System.out.println("Instance Method without Parameter-2");
	}
	//With
	void dance(String empName,int id) //Instance-->parameterized
	{
		System.out.println(empName);
		System.out.println(id);
		System.out.println("Instance Method with Parameter-1");
	}
	//With
	void college(double sal,boolean marSt) //Instance-->parameterized
	{
		System.out.println(sal);
		System.out.println(marSt);
		System.out.println("Instance Method with Parameter-2");
	}

//Static Method with & Without Parameter
	//Without--P
	static void run() //Static-->Non parameterized
	{
		System.out.println("Static Method without Parameter-1");
	}

	//Without
	static void demo() //static-->Non parameterized
	{
		System.out.println("Static Method withou Parameter-2");
	}
	
	//With
	static void bike(int price,String bikeName) //Static-->parameterized
	{
		System.out.println(price);
		System.out.println(bikeName);
		System.out.println("Static Method with Parameter-1");
	}
	
	//With
	static void flowers(String name,int fNo,float fPrice) //static-->parameterized
	{
		System.out.println(name);
		System.out.println(fNo);
		System.out.println(fPrice);
		System.out.println("Static Method with Parameter-2");
	}
		
	public static void main(String[] args) 
	{
//Instance Method with & Without Parameter
	//Without
	MethodEx c1=new MethodEx(); //object creation-->Instance method
	        c1.blue();
	//Without--P
	        c1.m2();
	//With
	        c1.dance("Dinga", 10);
	//With	
	        c1.college(50.55, true);

	        System.out.println(); //SPACE
	        System.out.println(); //SPACE
	        
//Static Method with Without Parameter
	//Without
	        MethodEx.run(); //object creation not required-->Static method , Class name
	//Without
	        MethodEx.demo();
	//With
	        MethodEx.bike(13555, "Royal Enfield");
	//With		
		    MethodEx.flowers("Rose", 50, 200.0f);
	
	}
	
}
