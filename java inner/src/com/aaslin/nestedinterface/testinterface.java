package com.aaslin.nestedinterface;



interface outer{
	interface inner{
		void msg();
		
	}
}
public class testinterface implements outer.inner {

	public void msg()
	{
		System.out.println("Nested interface");
	}
	public static void main(String[] args) {
		testinterface inner = new testinterface();
		inner.msg();
	}
}
