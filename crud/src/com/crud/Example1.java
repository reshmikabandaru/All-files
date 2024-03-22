package com.crud;
import java.util.*;
	   
	 public  class Example1{
	 public static void main(String args[])
     {
	   
		 ArrayList <String> Example1 = new ArrayList<String>(){
				 
			 
		@Override
		public boolean add( String val) {
			return super.add(val+"reshmika");
		}
				 };
				 Example1.add("modi");
				 System.out.println(Example1);
}
	 }
	 
	 
	 
	