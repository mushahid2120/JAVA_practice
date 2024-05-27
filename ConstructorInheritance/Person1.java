package ConstructorInheritance;

public class Person1 {
    private String name;
    private int age;
    Person1(){name="AnamousPerson";age=-1;System.out.println("Name: "+name+"\nAge: "+age);}
    Person1(String name,int age){this.name=name;this.age=age;System.out.println("Name: "+this.name+"\nAge: "+this.age);}
    void show(){System.out.println("Hello this is Person class");}
}

class Employee extends Person1{
    private int salary;
    Employee(){this(6999);salary=0;System.out.println("Salary: "+salary);}
    Employee(int salary){super("Mushahid",14);;this.salary=salary;System.out.println("Salary: "+this.salary);}
    void show(){System.out.println("Salary: "+this.salary);}
    void check(){
        this.show();
        System.out.println("Checking");
        super.show();
    }
}