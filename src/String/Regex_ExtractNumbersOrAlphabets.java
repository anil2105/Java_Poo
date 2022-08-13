package String;

public class Regex_ExtractNumbersOrAlphabets 
{
	public static void main(String[] args) 
	{
		//Input - 1ProKabaddi2022
		//Output - ProKabaddi
		//Output - 12022
		
		String input = "1ProKabaddi2022";
		
		System.out.println("------------Input---------");
		System.out.println(input);
		
		System.out.println("------------Output---------");
		
		System.out.println("----Extracting only alphabets from a String-----");
		System.out.println(input.replaceAll("[0-9]", ""));
		
		System.out.println("----Extracting only numbers from a String-----");
		System.out.println(input.replaceAll("[^0-9]", ""));

		System.out.println(input.replaceAll("[0-9]", "Anil"));
	
		System.out.println(input.replaceAll("[^0-9]", "Anil"));
		
	}
}
