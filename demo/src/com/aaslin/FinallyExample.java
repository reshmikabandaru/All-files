package com.aaslin;

public class FinallyExample {    
    public static void main(String args[]){   
        int a = 35;
     
     try {    
       System.out.println("Inside try block");  
      int q = a / 5;    
      System.out.println(q);    
     }   
     catch (ArithmeticException e){  
       System.out.println("Exception handled");  
     }   
     System.out.println(a*a); 
     }    
   }
