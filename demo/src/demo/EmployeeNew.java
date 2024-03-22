package demo;

public class EmployeeNew {
	EmployeeNew(String name,int age)
	{
		System.out.println(name+" "+age);
		
	}
	EmployeeNew(int salary,String name)
	{
		System.out.println(name+""+salary);

	}
	EmployeeNew(String mname,int age,int salary,String name,String dept)
	{
		System.out.println(mname+""+age+""+salary+""+name+""+dept);
	}
	

		
		 public static void main(String args[])
		{ 
			 EmployeeNew e1 = new EmployeeNew("reshmika",18);
			 EmployeeNew e2 = new EmployeeNew(10000,"reshmika");
			 EmployeeNew e3 = new EmployeeNew("xyz",18,10000,"reshmika","HR");
	
	 }
		
}

