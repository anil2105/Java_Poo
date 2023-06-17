package This_keyword;

//Current class variables:
//Local & instance variables name are same
//this keyword required

public class Test1 
{
  int a=100; 
  int b=200; 

  void add(int a,int b) 
  {
  	System.out.println(this.a+this.b);
  	System.out.println(a+b);  
  	System.out.println("Instance method");
  }
  
  public static void main(String[] args)
  {
  	Test1 t1=new Test1(); 
  		t1.add(300,400);  
  }
}