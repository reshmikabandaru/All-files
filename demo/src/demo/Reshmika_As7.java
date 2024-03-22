package demo;


import java.util.*;

public class Reshmika_As7 {
	
	void  Longpower(int a,int b) throws Exception
	{
		if(a>0 && b>0) {
			
			int res = (int) Math.pow(a,b);
			
			System.out.println(res);
			
			}
			
			else if(a==0 || b==0)
			{
				throw new Exception("a and b should not be zero.");
			}
			
			else
			{
				throw new Exception("a or b should not be negative.");
			}
			
		
		
	}

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		Reshmika_As7 mc = new Reshmika_As7();
		
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		 mc.Longpower(a,b);
		
		

	}

}

