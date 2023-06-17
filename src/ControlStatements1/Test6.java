package ControlStatements1;

//For the case label it is possible to provide constant expressions

public class Test6 
{
	public static void main(String[] args) 
	{
		int a=100;  
        
		switch (a) 
        {
        	case 10+20+70:System.out.println("10");
                  break; 

        	case 100+200:System.out.println("20");
                       break;
        	
        	default :System.out.println("default");    
                       break;  
        }
	}
}
