package com.aaslin.company;
import java.util.*;
class SOuter {
    
    static class Inner {
        
        
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("ENTER A NUMBER ");
        int num = sc.nextInt();
        
        int result = Inner.factorial(num);
        System.out.println("FACTORIAL " + num + " IS " + result);
        
       
    }
}

