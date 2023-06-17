package WrapperClasses;

public class Method2_XXXvalue 
{
//xxxValue()
//By using XXXValue() method we are converting wrapper object into the corresponding primitive values.
//	                        XXXValue()          
//wrapper object -------------------------------> primitive data types  

		public static void main(String[] args)
		{
			
			Integer i1=new Integer(21); //wrapper object
			
		//corresponding primitive data types

			System.out.println(i1.byteValue());//21

			System.out.println(i1.doubleValue());//21.0

			System.out.println(i1.shortValue());//21

			System.out.println(i1.floatValue());//21.0
			

			Character c1=new Character('M'); //only char
			
		//corresponding primitive data type
			
			System.out.println(c1.charValue());; //M
			

			Boolean b1=new Boolean(true);
			
		//corresponding primitive data type
			
			System.out.println(b1.booleanValue());//true

		}
}
