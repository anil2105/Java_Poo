package String;

//+ operator(for String concatenation)

public class Test10 
{
	public static void main(String[] args)
	{
		String age="22";  
        String s="Dinga "+age+" years old.";
        System.out.println(s); //Dinga 22 years old

        String str1="durga"; 
        String str2="ratan"; 
        String str3=str1.concat(str2);
        System.out.println(str3); //durgaratan
        
        int a=22; 
        String s1="he is "+a+" years old.";
        System.out.println(s1); //he is 22 years old
        
        String s2="six "+2+2+2;   
        System.out.println(s2); //six 222
        
        String s4=2+2+2+4+"six "+2+2+2;   
        System.out.println(s4); //10six 222
        
        String s3="six "+(2+2+2);   
        System.out.println(s3); //six 6
        
	}
}
