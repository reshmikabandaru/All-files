package com.aaslin;
import java. util.*;
public class task1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = Integer.parseInt(sc.nextLine());

            if (n < 0) {
                System.out.println("NUMBER IS ACCEPTED");
            } else if (n == 0) {
                System.out.println("ENTER A NUM WHICH IS NOT ZERO");
            } else {
                System.out.println("ENTER A POSIITVE INTEGER");
            }

            System.out.println("ACCEPTED " + n);
        } catch (Exception e) {
            System.out.println("Please enter a valid number.");
            e.printStackTrace();
        }
    }
}