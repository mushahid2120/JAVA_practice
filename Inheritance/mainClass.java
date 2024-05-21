package Inheritance;
import Inheritance.Customer.Customer;
import Inheritance.Employee;
public class mainClass {
    public static void main(String []args){
        contact();
    }
    static void personEmployee(){
        Employee emp=new Employee();
    }
    static void customer(){
        Customer c=new Customer(34949394,"Mushahid","Saving");
        c.checkBalance();

    }
    static void circle(){
        ThickCircle t=new ThickCircle(30,12);
        System.out.println("Area of a Circle: "+t.getArea()+"\nArea of Hollow Circle: "+t.getHollowArea()+"\nArea of ThickArea: "+t.getThickArea());
    }
    static void contact(){
        DetailContact dc=new DetailContact();
        dc.setName("Mushahid");
        dc.setMobile(3695555);
        dc.setDob(1022120);
        dc.setEmail("abc@gmail.com");
        System.out.println("Name: "+dc.getName()+"\nMobile Number: "+ dc.getMobile()+"\nEmail Id: "+dc.getEmail()+"\nDate of Birth: "+dc.getDob());
    }
}

