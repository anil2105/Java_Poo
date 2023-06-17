package ControlStatements3;

public class Test2 
{
	public static void main(String[] args) 
	{

		for (int i=0;i<10;i++) 
        {
           if (i==5)    
           { 
             continue;	//-->(skip the current  iteration continue the rest of the iterations normally)
           } 
           		
           System.out.println(i); //0,1,2,3,4,6,7,8,9
        }
	
	}
}
