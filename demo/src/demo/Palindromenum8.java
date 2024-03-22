package demo;

import java.util.Scanner;

public class Palindromenum8 {

  static String rev ="";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
        String   s1 = sc.nextLine();
     
         
         int   k = s1.length();
    
    
      for( int i = k-1; i>=0; i--)
      {
             rev = rev+s1.charAt(i);
      }
    if(s1.equals(rev))
    {
    	System.out.println("it is a palindrome");
    	
    }

    else {
    	System.out.println("it is not a palindrome");
    }
	}

}
