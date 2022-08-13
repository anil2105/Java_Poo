package ControlStatements1;

//The case labels must be constant expression if we are providing 
//variables as a case labels  the compiler will raise compilation error.

public class Test5 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30; 
        
		switch (a)
        {
/*        	case a: System.out.println("10"); 
        		break;  

        	case b: System.out.println("20");  
        		break;
        		
        	case c: System.out.println("30");   
        		break;
*/      		
        	default: System.out.println("default");
        		break;  
         }
	}
}
