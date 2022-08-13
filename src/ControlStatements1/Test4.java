package ControlStatements1;

//Duplicate case labels are not 
//allowed in switch statement

public class Test4 
{
	public static void main(String[] args) 
	{
		int a=10; 
       
		switch (a)
        {
   /*     	case 10:System.out.println("10"); //CE
              break; 
        	
        	case 10:System.out.println("20");  //CE
              break; 
 	*/
        	case 30:System.out.println("30");  
              break;
        	
        	default :System.out.println("default");
              break;  
        }
	}
}
