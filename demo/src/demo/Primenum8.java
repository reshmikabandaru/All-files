package demo;
import java.util.*;
public class Primenum8 {

	public static void main(String[] args) {
		int count =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		if(num == 2)
		{
			System.out.println("prime number");
			
		}
		for(int i = 1;i< num;i++)
		{
			if(num%i==0)
			{
				count++;
				
			}
		}
		if (count == 2)
		{
			System.out.println(num + "it is a prime number");
			
		}
		else
		{
			System.out.println(num+" it is not a prime number");
		}
	}

}
