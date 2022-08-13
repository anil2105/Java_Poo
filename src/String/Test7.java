package String;

//whenever we are over-riding
//will get current class output
//will not get parent class methods 

public class Test7 
{
	
public String toString()
{
	return "Emma, How are you?";
	
}
	public static void main(String[] args) 
	{
		Test7 t1=new Test7();
		
		System.out.println(t1.toString()); //Emma, How are you?  
	}
}
