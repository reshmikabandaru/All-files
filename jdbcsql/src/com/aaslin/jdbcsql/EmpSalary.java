package com.aaslin.jdbcsql;
import java.util.List;
import java.util.ArrayList;

public class EmpSalary {

	    private int id;
	    private String name;
	
	    private List<Salary> salaries;

	    public EmpSalary(int id, String name) {
	        this.id = id;
	        this.name = name;
	        this.salaries = new ArrayList<>();
	    }

	    public void addSalary(Salary salary) {
	        salaries.add(salary);
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +"id=" + id +", name='" + name + '\'' +", salaries=" + salaries + '}';
	    }
	}

