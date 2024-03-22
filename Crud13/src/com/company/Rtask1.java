package com.company;

	import java.util.ArrayList;
	public class Rtask1 {
	    public static void main(String [] args) {
	        ArrayList<String> color = new ArrayList<String>();
	        color.add("PINK");
	        color.add("YELLOW");
	        color.add("BLUE");
	        color.add("RED");
	        System.out.print(color);
	        
	        
	        color.add(0,"BLACKUUUU");
	        System.out.print("\n"+color);
	        
	        
	        color.remove(4);
	        
	        System.out.println("\n"+color);
	        
	       // color.get(2);
	      //  System.out.println(color);
	        
	    }
	}

