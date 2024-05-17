package Constructor;

public class Person {
    private String name;
    private int age;

    Person(){System.out.println("Constructor with no argument ");}
    Person(String name){System.out.println("Constructor with name argument");}
    Person(int age){System.out.println("Constructor with Age argument");}
    Person(String name,int age){System.out.println("Constructor with Name and Age Argument");}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
