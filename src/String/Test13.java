package String;

//StringBuffer
//mutable
//we can add,modify & remove

public class Test13 
{
	public static void main(String[] args) 
	{
		 StringBuffer sb=new StringBuffer("Poo"); 
         String str=" salary ";
             
         	int a=30000;  
             
         	sb.append(str); 
            sb.append(a); 
            sb.append(" Conrats "); //append-->add in the last
            sb.append(" Bye Bye "); //append-->add in the last 
             
          System.out.println(sb); //Poo salary 30000 Congrats Bye Bye
	}
}
