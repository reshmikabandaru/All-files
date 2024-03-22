package demo;

import java.util.Scanner;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

public class Reshmika_As3 extends Sports{
	
	 String getName(){
	        return "Soccer Class";
	    }
	 
	 void getNumberOfTeamMembers(){
		 int n ;
		 Scanner sc = new Scanner(System.in);
		 n=sc.nextInt();
	     System.out.print("Each team has "+ n +" players in " + getName());
	    }

	public static void main(String[] args) {
	
		
		 Sports s = new Sports();
		
		 Reshmika_As3 s1= new  Reshmika_As3();
		 
		 System.out.println(s.getName());
		 s.getNumberOfTeamMembers();
		 
		 System.out.println(s1.getName());
		 s1.getNumberOfTeamMembers();
		 
		 
		

	}

}

