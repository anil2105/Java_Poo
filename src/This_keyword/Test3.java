package This_keyword;

//to convert local variables into the instance/static variables 
//need of this keyword.

public class Test3
{
      static int a; 
      int b;
    
      void values(int a,int b) 
      { 
              this.a=a; 
              this.b=b; 
      }  
      
      void add()  
      { 
      	System.out.println(a+b);
      }
      
      void m1()
      {
      	System.out.println(a*b);  
      } 
 
      public static void main(String[] args)  
      {
          Test3 t=new Test3();   
               t.values(100,200); 
               t.add(); 
               t.m1();  
      }
}
