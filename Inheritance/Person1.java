package Inheritance;


public class Person1 {
    private String name;
    private int age;

    int df=12;
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        this.age = age;
    }
    public void Check(){ }
}
class Employee extends Person{
    private int salary;
    protected int Epro;
    public void setEmployee(String name,int age,int salary){
        setName(name);
        setAge(age);
        this.salary=salary;
    }
    public void getEmployee(){
        System.out.println("Name: "+getName()+"\nAge: "+getAge()+"\nSalary: "+salary);
    }

}
class Test{
    public static void testing(){
        Employee e=new Employee();
        e.setAge(20);
        e.setEmployee("Mushahid",43,32300);
        e.getEmployee();
    }
}