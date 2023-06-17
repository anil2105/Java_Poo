package This_keyword;

//We can call current class methods. 

public class Test4
{
	void m1()
	{
		this.m2();
		System.out.println("Instance method-1");
	}
	
	void m2()
	{
		System.out.println("Instance method-2");
	}
	
	void m3(String s)
	{
		this.m1();
		System.out.println(s);
		System.out.println("Instance method-3");
	}
	
	public static void main(String[] args) 
	{
		Test4 t=new Test4();
			  t.m3("Anil");  
		
	}
}
