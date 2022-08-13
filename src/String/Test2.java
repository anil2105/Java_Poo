package String;

public class Test2 
{
	public static void main(String[] args) 	
	{
        char[] ch={'a','b','c','d','e'};
       	String str3=new String(ch);  
       	System.out.println(str3); //abcde

       	char[] ch1={'a','p','r','a','s','a','a'}; 
       	String str4=new String(ch1,1,5); 
       	System.out.println(str4); //prasa
       	
    	char[] ch2={'a','p','r','a','s','a','a'}; 
       	String str8=new String(ch1,2,4);  
       	System.out.println(str8); //rasa

       	byte[] b={65,66,67,68,69,70}; 
       	String str5=new String(b);  
       	System.out.println(str5); //ABCDEF --ASCII table
       	
       	byte[] b1={65,66,67,68,69,70};  
       	String str6=new String(b1,1,4);  
       	System.out.println(str6); //BCDE --ASCII table	
    
       	byte[] b2={65,66,67,68,69,70};  
       	String str7=new String(b1,3,4);  
       	System.out.println(str7); //StringIndexOutOfBoundException
	
	}
}
