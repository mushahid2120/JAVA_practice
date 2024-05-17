package Constructor;
import java.util.Scanner;
public class Employee {
    private int empid;
    private String name;
    private float salary;
    static int count;

    private static int generateEmpId(){
        return ++count;
    }
    Employee(){
        System.out.println("Enter your name: ");
        Scanner m=new Scanner(System.in);
        name=m.nextLine();
        System.out.println("Enter your Salary: ");
        salary=m.nextFloat();
        empid=generateEmpId();
    }
    Employee(String name,float salary){
        this.name=name;
        this.salary=salary;
        empid=generateEmpId();
    }
    void show(){
        System.out.println("Emp ID: "+empid+"\nName: "+name+"\nSalary: "+salary);
    }
}
