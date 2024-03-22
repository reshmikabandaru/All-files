package com.crud;
import java.util.*;
public class crudlist {
	
	public static void main(String[] args) {
		
    List<Integer> Empno= new ArrayList<Integer>(); 
		 
		   Empno.add(1);
		   Empno.add(2);
		   Empno.add(3);
		   
		   
		System.out.println(Empno);
		
	List<String> EmpName = new ArrayList<String>();
		
		EmpName.add("RESHMIKA");//0
		EmpName.add("LAVANYA");//1
		EmpName.add("PRIYA");//2
		System.out.println("intial"+EmpName);
		
		EmpName.add(1,"VISHNU");   // add elements
		EmpName.add(2,"VIJAY");    // add elements
		System.out.println("adding :"+EmpName);
		
		EmpName.set(1,"Ajay");// update elements
		EmpName.set(3,"shiku");// update elements
		
	   System.out.println("after updating"+EmpName);
	    EmpName.remove(0);//delete
	    EmpName.remove(3);
	    System.out.println("after deleting"+EmpName);
	    
	    String f1 = EmpName.get(2);//retrieve
	    String f2 = EmpName.get(1);
	    System.out.println("retriving");
	    System.out.println(f1);
	    System.out.println(f2);
    //    System.out.println(EmpName);
		
		
	    
	    
	    List<Integer> Empage= new ArrayList<Integer>(); 
		 
		   Empage.add(16);
		   Empage.add(22);
		   Empage.add(32);
		   System.out.println("Intial:"+Empage); //intial
		   Empage.add(1,17);
		   System.out.println("added"+Empage);//add
		  
		   Empage.set(1,16);//updating
		   System.out.println("after updating"+Empage);
		   Empage.remove(0);//deleting
		   System.out.println("after deleting"+Empage);
	}

}