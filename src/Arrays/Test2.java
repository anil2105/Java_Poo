package Arrays;

public class Test2 
{
	public static void main(String[] args) 
	{
		String s[]={"facebook","apple","amazon","microdoft","google","Pooja"};
		
		System.out.println(s.length); //length 6	index 0 to 5

		//for each loop --> recommended in arrays
		
		for(String m : s)
		{
			System.out.println(m);
		}

	}
}
