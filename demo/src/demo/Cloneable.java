package demo;
class Clonable implements Cloneable {
    String name;
    int age;
    float salary;
    String mname;
    String dept;

    
    Clonable() {
        System.out.println("default");
    }

    Clonable(String name) {
        this.name = name;
        System.out.println(name);
    }

    Clonable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Clonable(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    Clonable(String name, float salary, String mname, String dept) {
        this.name = name;
        this.salary = salary;
        this.mname = mname;
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Clonable original = new Clonable();
            Clonable clone1 = (Clonable) original.clone();
            System.out.println("Clone created using clone method: " + clone1);

            
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}