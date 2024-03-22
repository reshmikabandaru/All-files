package com.aaslin.jdbcsql;


	import java.util.ArrayList;
	import java.util.List;
	

	public class reshmikat4{
	    public static void main(String[] args) {
	        List<EmpSalary> employeeList = new ArrayList<>();

	        
	        EmpSalary employee1 = new EmpSalary(1, "RESHMIKA");
	        employee1.addSalary(new Salary(2022, 50000));
	        employee1.addSalary(new Salary(2021, 48000));
	        employee1.addSalary(new Salary(2020, 45000));
	        employeeList.add(employee1);

	       
	        EmpSalary employee2 = new EmpSalary(2, "VIRAT KOHLI");
	        employee2.addSalary(new Salary(2022, 55000));
	        employee2.addSalary(new Salary(2021, 52000));
	        employee2.addSalary(new Salary(2020, 48000));
	        employeeList.add(employee2);

	        
	        for (EmpSalary employee : employeeList) {
	            System.out.println(employee);
	        }
	    }
	}



