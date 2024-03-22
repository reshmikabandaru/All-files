package com.crud;
import java.util.*;

class crudmap {
    public static void main(String args[]) {

        
        HashMap<String, String> countryCapitalMap = new HashMap<>();

        
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        
        System.out.println("CREATED ELEMENTS IN HASH MAP");

        

        // Update 
        countryCapitalMap.put("France", "Paris");
        System.out.println("\n UPDATE OPERATION SUCCESSFUL");
        System.out.println("UPDATED CAPITAL OF FRANCE : " + countryCapitalMap.get("France"));

        // Delete elements
        countryCapitalMap.remove("Japan");
        System.out.println("\n DELETE OPERATION:");
        System.out.println("After deleting Japan: " + countryCapitalMap);

        // Additional elements 
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("Australia", "Canberra");
        
        System.out.println(" AFTER  ADDING ADDITIONAL ELEMENTS"+ countryCapitalMap);
        
     // Retrieve
        System.out.println("RETRIVING......:");
        System.out.println("Capital of France: " + countryCapitalMap.get("France"));

        // Display 
       // System.out.println("\nAll elements in the map:");
       // for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
       //     System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }//
    }

