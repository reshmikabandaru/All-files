package demo;
import java.util.*;
import java.util.ArrayList;


public class Reshmika_As5 {

	static Iterator func(ArrayList mylist)
	   {
	      Iterator it=mylist.iterator();
	      while(it.hasNext())
	      {
	         Object element = it.next();
	         if(element instanceof String)
	            break;
	      }
	      return it;
	      
	   }

	   public static void main(String []argh)
	   {
	      ArrayList mylist = new ArrayList();
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter Number of Integers before ###");
	      int n=sc.nextInt();
	      System.out.println("Enter Number of Strings after ###");
	      int m=sc.nextInt();
	      System.out.println("Enter an Integer ");
	      for(int i=0;i<n;i++)
	      {
	         mylist.add(sc.nextInt());
	      }
	      mylist.add("###");
	      System.out.println("Enter Strings");
	      for(int i=0;i<m;i++)
	      {
	         mylist.add(sc.next());
	      }
	      
	      
	      Iterator it=func(mylist);
	      
	      while(it.hasNext())
	      {
	         Object element = it.next();
	         System.out.println((String)element);
	      }
	      
	   }

}
