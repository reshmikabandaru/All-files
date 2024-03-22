package com.aaslin;


class child {
    void method() 
    		
   throws Exception{ 
    	
    throw new Exception("EXCEPTION THROWN FROM CHILD CLASS METHOD");
    
    }
}



class Parent extends child {
    void methodInDerived() 
   throws Exception {
       
        super.method();
    }
}

public class task5 {
    public static void main(String[] args) {
         Parent p = new Parent();
        try {
            
            p.methodInDerived();
        } catch (Exception e) {
           
            System.out.println("EXCEPTION OCCURED: " + e.getMessage());
        }
    }
}