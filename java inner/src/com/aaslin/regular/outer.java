package com.aaslin.regular;

public class outer {
	public class Inner{
		  void Message()
		{
			System.out.println("inner");
		}
		
	}
public static void main(String args[])
		{
	outer out = new outer();
	outer.Inner in = new outer().new Inner();
			new outer().new Inner().Message();
		}
}
