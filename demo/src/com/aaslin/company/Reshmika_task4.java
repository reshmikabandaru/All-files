package com.aaslin.company;

import java.util.Scanner;

class NOuter{
	int n;
  
   int msg(int num)
   {
  class inner
	{
   int  show(int num)
    {
	 n= num*num*num ;
	  return n;
			
	}
   
	}
	  inner in = new inner();
	   in.show(num);
	   //System.out.println(n);
	   return n;
	}
  
}
public class Reshmika_task4 {
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();	
		NOuter ou = new NOuter();
		int k= ou.msg(num);
		System.out.println(k);
	}

}
