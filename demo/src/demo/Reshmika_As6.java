package demo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Reshmika_As6 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
	try 
	{
	 try 
    {	
	 int m = sc.nextInt();
	 int n = sc.nextInt();
			   
	 System.out.println(m/n);	
			   
     }
		   
    catch(InputMismatchException e)
		     {
			 
			  e.printStackTrace();
			  
		     }
	}
			
		
	 
	catch(Exception e)
	
	{
		    e.printStackTrace();
		
			
	}
		

	}

}

