package com.aaslin.company;
public class reshmika_task7 {
    
    private int outerVariable;

    public reshmika_task7(int outerVariable) {
        this.outerVariable = outerVariable;
    }

    public InnerClass createInnerObject() {
        return new InnerClass();
    }

    public void outerMethod() {
        System.out.println("Outer method");
    }

    public class InnerClass {
        
        public void innerMethod() {
            
            System.out.println("OUTER VARIABLE " + outerVariable);
            outerMethod(); 
        }
    }

    public static void main(String[] args) {
        reshmika_task7 outobj = new reshmika_task7(10);
        InnerClass innObj = outobj.createInnerObject();

        innObj.innerMethod();
    }
}