package demo;

public class Exceptionpropogation {
	 
		  void m()
		  {  
		    int data=50/0;  
		  }  
		  void n()
		  {  
		    m();  
		  }  
		  void p()
		  {  
		   try{  
		    n();  
		   }
		   catch(Exception e)
		   {
			   System.out.println("exception handled");}  
		  }  
		  public static void main(String args[]){
			  
			  Exceptionpropogation obj=new  Exceptionpropogation();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
		}  
	
	
	
	
	
	




