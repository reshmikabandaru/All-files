package demo;
import java.lang.*;
public class Fibnocci {
	int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}

	   	 
    public static void main(String args[])
    {    
      int n=5;
      Fibnocci ob=new Fibnocci();
      for(int i=0;i<n;i++)
      System.out.println(ob.fib(i));
     }

}		 
 