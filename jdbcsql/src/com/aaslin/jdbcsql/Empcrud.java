package com.aaslin.jdbcsql;

import java.util.ArrayList;
import java.util.Arrays;

public class Empcrud {
    private int id;
    private String name;
    private ArrayList<String> dept1;

    public Empcrud(int id, String name, String[] department) {
        this.id = id;
        this.name = name;
        this.dept1 = new ArrayList<String>(Arrays.asList(department));
    }

    public void remove(String department) {
        dept1.remove(department);
        System.out.println(id + " " + name + " " + dept1);
    }

    public void update(String name) {
        this.name = name;
        System.out.println(id + " " + this.name + " " + dept1);
    }

    public void delete() {
        dept1.clear();
        System.out.println(id + " " + name + " " + dept1);
    }

    public static void main(String args[]) {
        Empcrud obj = new Empcrud(1, "VARMA", new String[]{"IT", "FINANCE"});
        System.out.println(obj.id + " " + obj.name + " " + obj.dept1);
        obj.remove("FINANCE");
        obj.update("John");
        obj.delete();
    }
}
