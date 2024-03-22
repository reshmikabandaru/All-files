package demo;

import java.util.Scanner;

public class Diffcharacters8 {
	
static char j;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
        String   s1 = sc.nextLine();
      for( j = 'a';j < 'z';j++)
      {
    	  for( int i =0;i< s1.length();i++)
    	  {
    		  if( s1.charAt(i)==j)
    		  {
    			  System.out.println(""+j);
    			  break;
    		  }
    	  }
      }

		
		 
	}

}
