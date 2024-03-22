package com.aaslin.jdbcsql;

public class Salary {
	
	    private int year;
	    private double amount;

	    public Salary(int year, double amount) {
	        this.year = year;
	        this.amount = amount;
	    }

	    @Override
	    public String toString() {
	       
	    	return "Salary{" +"year=" + year +", amount=" + amount + '}';
	    }
	}




