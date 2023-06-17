package Arrays;

//Two dimensional array

public class Demo 
{
	public static void main(String[] args) 
	{
		
		int a[][]={{10,20,30},{50,60,80}};
				 	  //0    ,	   1	--> index of an array
					  //1    ,	   2	-->	length of an array

		System.out.println(a.length); //2 

		System.out.println(a[0][0]);//10
		System.out.println(a[0][1]);//20
		System.out.println(a[0][2]);//30
		System.out.println(a[1][0]);//50
		System.out.println(a[1][1]);//60
		System.out.println(a[1][2]);//80
		System.out.println(a[1][3]);//ArrayIndexOutOfBoundException

	}
}
