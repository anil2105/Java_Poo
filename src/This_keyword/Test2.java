package This_keyword;

//Conversion of local variables into the instance/static variables 

public class Test2 
{
	static int i;
	int j; 
		
  void values(int a,int b) 
  {
  	i=a;  
      j=b; 
  } 
  void add()
  {
  	System.out.println(i+j);
  }
  void m1() 
  {
  	System.out.println(i*j);  
  }
	
  public static void main(String[] args)  
  {
		Test2 t=new Test2(); 
			t.values(100,200);
			t.add(); 
			t.m1(); 
  }
}
