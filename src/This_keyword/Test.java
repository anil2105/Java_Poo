package This_keyword;

//Current class variables:
//Local & instance variables name are different 
//No need of this keyword 

public class Test 
{
  int a=10;  
  int b=20;  
  
  void add(int i,int j) 
  {
  	System.out.println(a+b); 
  	System.out.println(i+j);
  } 

  public static void main(String[] args) 
  {
  	Test t=new Test();   
  		t.add(100,200);  
  } 
}

