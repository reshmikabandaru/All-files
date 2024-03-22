package com.aaslin.company;
public class Reshmika_task2 {
    
    public class InnerClass {
        public void Method() {
            System.out.println("PUBLIC METHOD");
        }
    }
    
    private class privateInnerClass {
        public void Msg() {
            System.out.println("PRIVATE METHOD");
        }
    }
    
    protected class protectedInnerClass {
        public void Show() {
            System.out.println("PROTECTED METHOD");
        }
    }
    
    class DefaultInnerClass {
        public void publicMethod() {
            System.out.println("DEFAULT METHOD");
        }
    }
}



//the public type outer must be defined in its own file
//Error: PrivateInnerClass has private access in OuterClass
// Error: ProtectedInnerClass has protected access in OuterClass
//Error: DefaultInnerClass is not public in OuterClass; cannot be accessed from outside