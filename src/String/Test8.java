package String;

//StringBuffer
//Address comparison

public class Test8 
{
	public static void main(String[] args) 
	{
		//String compares the content 
		
		String str1="emma"; 
        str1.concat("soft"); 
        System.out.println(str1);//emma 
       
        String str2="emma"; 
        System.out.println(str1.equals(str2));//true //String class .equals()
        
        System.out.println();
        
        //StringBuffer compares the reference (address)
        
        StringBuffer sb=new StringBuffer("emma");   
        sb.append("Hello"); //append--adding in last
        System.out.println(sb);//emmaHello
      
        StringBuffer sb1=new StringBuffer("emma"); //address ex:111
        StringBuffer sb2=new StringBuffer("emma"); //address ex:222
        StringBuffer sb3=sb2;					   //address 222 --> sb3=sb2
        
        System.out.println(sb1.equals(sb2));//false //Object class .equals()
        System.out.println(sb3.equals(sb2));//true //Object class .equals() 
                  
	}
}
