package Variables;

public class VariableEx 
{
	//Instance Variable
		int a=500;
		double d=99.99;

	//Static Variable
		static boolean b=false;
		static String s="TCS";

		
	public static void main(String[] args)	
	{
		//Local Variable
		char c='R';
		float f=88.55f;

		VariableEx s1=new VariableEx();
		System.out.println(s1.a);
		System.out.println(s1.d);
		
		System.out.println(VariableEx.b);
		System.out.println(VariableEx.s);

		System.out.println(c);
		System.out.println(f);

	}
	
}
