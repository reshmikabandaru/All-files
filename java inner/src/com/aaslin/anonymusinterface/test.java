package com.aaslin.anonymusinterface;
interface outer{
	
interface inner
{
	void msg();
	
}

}
public class test  {

	 public static void main(String[] args) {
			
			outer.inner in = new outer.inner() {

				@Override
				public void msg() {
					// TODO Auto-generated method stub
					 System.out.println("RESHMIKA");
					
				}
		 };
			 
			 in.msg();
			 }
			 	 
		
	 
	
}

