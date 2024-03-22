package demo;

import java.lang.reflect.Constructor;

public class ENewIn {

	String  name;
	int age;
	float salary;
	String mname;
	String dept;
	
	ENewIn()
	{
		System.out.println("default");
	}
	
	 ENewIn(String name)
	 {
		 this.name =name;
		 System.out.println(name);
	 }
	ENewIn(String name,int age)
	{
		this.name =name;
		this.age =age;
	}
	ENewIn(String name,float salary)
	{
		this.mname =name;
		this.salary =salary;
	}
	ENewIn(String name,float salary,String mname,String dept)
	{
		this.name=name;
		this.salary=salary;
		this.mname=mname;
		this.dept=dept;
		
	}
	public static void main(String[] args) {
		try {
		
		Constructor<ENewIn> c = ENewIn.class.getDeclaredConstructor();   
		ENewIn r = c.newInstance(); 
		r= new ENewIn("reshmika");
		r= new ENewIn("reshmika",12);
		r= new ENewIn("lavanya",10000);
		r= new ENewIn("reshmika",10000,"lavanya","HR");

	}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
