package com.crud;
import java.util.*;

public class crudset {
    public static void main(String[] args) {
        Set<Integer> studentIds = new HashSet<>(); 
        studentIds.add(1997);
        studentIds.add(2002);
        studentIds.add(2003);

        System.out.println("Initial  " + studentIds);

        Set<String> studentNames = new HashSet<>();
        studentNames.add("MS DHONI");
        studentNames.add("WARNER");
        studentNames.add("VIRAT KOHLI");
        System.out.println("Initial Student Names: " + studentNames);

        // Adding elements
        studentIds.add(1004);
        studentNames.add("MAXWELL");
        System.out.println("After adding  " + studentIds + ", " + studentNames);

        // Updating elements
        studentNames.remove("GILL");
        studentNames.add("SHAMI");
        System.out.println("After updating  " + studentIds + ", " + studentNames);

        // Removing elements
        studentIds.remove(1001);
        studentNames.remove("HARDIK PANDYA");
        System.out.println("After deleting  " + studentIds + ", " + studentNames);

        // Retrieving elements
        String name1 = studentNames.contains("ROHIT SHARMA") ? "ROHIT SHARMA" : "Not found";
        String name2 = studentNames.contains("SHAMI") ? "SHAMI" : "Not found";
        System.out.println("Retrieving: ");
        System.out.println(name1);
        System.out.println(name2);
    }
}
