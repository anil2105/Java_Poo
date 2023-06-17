package String;

//Creating a string object by using new operator
//Once object created,then concatenation is not possible--String is immutable

public class Test3 
{
	public static void main(String[] args) 
	{
		 String str1=new String("Micro");
	        str1.concat("hello"); //Concatenation not possible-->string is immutable 
	        
	     String str2=str1.concat("Soft");  
	        str2.concat("bye");  //Concatenation not possible-->string is immutable 
	        
	        System.out.println(str1);//Micro
	        
	        System.out.println(str2);//MicroSoft
	}
}

