package WrapperClasses;

public class Method1_valueOf 
{
	//valueOf()
	//By using valueOf() we are creating wrapper object and it is a alternative to the constructor.  
	//			            		valueOf() 
	//String/ primitive  -----------------------------> Wrapper object

		public static void main(String[] args) 
		{
			
			Integer i1=new Integer(2105); 
			System.out.println(i1); //2105

			Integer i2=Integer.valueOf(2105); //alternative to the constructor
			System.out.println(i2); //2105

			Character c1=new Character('M'); 
			System.out.println(c1); //M

			Character c2=Character.valueOf('M'); //alternative to the constructor
			System.out.println(c2); //M

			Double d1=Double.valueOf(2121);
			System.out.println(d1);//2121.0
		}
}
