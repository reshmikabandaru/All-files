package com.aaslin.staticInnerclass;

public class outer {
	static int x=30;

	static class inner{
		void msg()
		{
			System.out.println("STATIC INNER CLASS");
		}
	}


	public static void main (String[]args)

	{
		outer.inner in = new outer.inner();
	    in.msg();
	}
	}
