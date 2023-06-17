package Variables;

public class StaticVariables
{
		//Static Variable
	
		static byte b=100;

		static int a=500;

		static char c='P';

		static double d=75.55;

		static boolean b1=true;

		static String s1="IBM";
		
		
		
	public static void main(String[] args)
	
	{
		System.out.println("----------------Creating Object--------------------");	
		
		StaticVariables s1 = new StaticVariables();
		
		System.out.println(s1.b);
		System.out.println(s1.a);
		System.out.println(s1.c);
		System.out.println(s1.d);
		System.out.println(s1.b1);
		System.out.println(s1.s1);
		
		System.out.println();
		System.out.println("--------------------Directly--------------------------");
		System.out.println(b);
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b1);
		System.out.println(s1);

		
		System.out.println();
		System.out.println("------------------Using ClassName-------------------");
		System.out.println(StaticVariables.b);
		System.out.println(StaticVariables.a);
		System.out.println(StaticVariables.c);
		System.out.println(StaticVariables.d);
		System.out.println(StaticVariables.b1);
		System.out.println(StaticVariables.s1);
		
		
	}	
		
}

