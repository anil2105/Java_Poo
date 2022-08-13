package MultiThreading;

//Multi Threading
//Thread.sleep() --> method

public class Test 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Hello students");
		
		Thread.sleep(4000); //4000 milliSecond=4 seconds
		
		System.out.println("How are you?");
		
		Thread.sleep(10000); //10 seconds
		
		System.out.println("Bye");
		
		Thread.sleep(2000); //2 seconds
		
		System.out.println("Bye Bye");
	}
	
}
