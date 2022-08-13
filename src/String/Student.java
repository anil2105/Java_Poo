package String;

class Student 
{
	int rollno;
	String name;
	String city;

	Student(int rollno, String name, String city) 
	{
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	public static void main(String args[]) 
	{
		Student s1 = new Student(101, "Raj", "lucknow");

		System.out.println(s1);
	}
}
