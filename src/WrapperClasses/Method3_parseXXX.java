package WrapperClasses;

public class Method3_parseXXX 
{
//parseXXX():
//By using parseXXX() method we are converting String into the corresponding primitive          
//	                          parseXXX() 
//String value -------------------------------------> corresponding primitive 

		public static void main(String[] args)
		{
			String s1="100";
			
			String s2="400";
			
			String s3="200";
			
		System.out.println(s1+s2+s3); //100400200 -- Concatenation

			int i1=Integer.parseInt(s1);//100
		  //Integer i1 = Integer.parseInt("100");

		  //float f1=Float.parseFloat("400");
	        Float f1=Float.parseFloat(s2); //400
	        
	      //double d1=Double.parseDouble("200");
	        double d1=Double.parseDouble(s3); //200
	       

		System.out.println(i1+f1+d1); //700.0 -- addition

		}
}
