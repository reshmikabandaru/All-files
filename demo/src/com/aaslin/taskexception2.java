package com.aaslin;

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}

class Voter {
    private int age;
    private static final int vote = 18; 
    public Voter(int age) {
        this.age = age;
    }

    public void checkEligibility() throws MyException {
        if (age < vote) 
       {
            throw new MyException("YOU ARE NOT ELIGIBLE TO VOTE");
        }
        System.out.println("YOU ARE ELIGIBLE TO VOTE");
    }
}

public class taskexception2 {
    public static void main(String[] args) {
        Voter voter1 = new Voter(21);
        Voter voter2 = new Voter(16);

        try {
            voter1.checkEligibility();
            voter2.checkEligibility(); 
        } catch (MyException e) {
        	
            System.out.println("Voting eligibility check failed: " + e.getMessage());
        }
    }
}