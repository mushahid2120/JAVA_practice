package OverRidingLoading;

public class Person {
    private String name;
    private int age;
    void setPerson(){name="unknown";age=0;}
    void setPerson(String name){this.name=name;this.age=0;}
    void setPerson(String name,int age){this.name=name;this.age=age;}
    void showPerson(){System.out.println("Name: "+name+"\nAge: "+age);}
}
