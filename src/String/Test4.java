
package String;

//String is immutable in nature
//Once object created,then concatenation is not possible--String is immutable

public class Test4 
{
	public static void main(String[] args) 
	{  
        String  str1="Poo"; //Poo
        str1.concat("soft"); 
        
        String  str2=str1.concat("Soft"); //PooSoft

        String str3=str2; //PooSoft
        
        String str4="Poo".concat("ShivaGod"); //PooShivaGod
        
        String str5=str4; //PooShivaGod
        
        System.out.println(str2==str3); //true
        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //false
        System.out.println(str2==str4); //false
        System.out.println(str5==str4); //true
     }
}
