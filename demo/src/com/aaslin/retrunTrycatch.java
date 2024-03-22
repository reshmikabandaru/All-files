package com.aaslin;

	public class retrunTrycatch {    
	      public static void main(String args[])
	      {   
	         System.out.println(showMethod());  
	      }
	        @SuppressWarnings("finally")
			static int showMethod()
	      {
	      try 
	      {    
	          int a = 25 / 5;
	         return 15;  
	      }   
	      catch (ArithmeticException e)
	      {  
	        System.out.println(e);
	        return 98;
	      }   
	      finally
	       {
	        return 33;   
	       }
	      
	    }   
	}



