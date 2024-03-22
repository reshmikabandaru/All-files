package com.aaslin.company;
import java.util.*;

interface simplemath
{
    void msg();
}


public class reshmika_task3  
{
	
	 public static void main(String[] args) 
	 {
		 simplemath sm = new simplemath()
			{
			public void msg()
			{
			int a,b;
			Scanner sc = new Scanner(System.in);
	        System.out.println("enter the numbers");
	        a = sc.nextInt();
	        b = sc.nextInt();
	        int sum = a+b;
	        System.out.println(sum);
	        int mul =a*b;
	        System.out.println(mul);
	        int div = a/b;
	        System.out.println(div);
	        int sub = a-b;
	        System.out.println(sub);
			}
	 };
	 sm.msg();
			
	       
	};
}
		  
		
			 

