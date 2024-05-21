package Inheritance;

public class DriverPerson {
    public static void driver(){
        Learner l=new Learner();
    }
}

abstract class Person{
    private String name;
    private int age;
    protected String getName() {
        return name;
    }

    protected  void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }
    protected void setAge(int age) {
        this.age = age;
    }
}
class Learner extends Person{
    private String courseName;
    private int batchNo;
    private int fees;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(int batchNo) {
        this.batchNo = batchNo;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }
}
class Admin extends Person{
    private String subject;
    private int salary;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}