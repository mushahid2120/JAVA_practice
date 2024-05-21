package Constructor;

import Constructor.Employee;
//import Inheritance.Person;
public class mainClass {
    public static void main(String []args){

    }
//    static void person(){
//        Person p=new Person();
//        Person p1=new Person("Mushahid");
//        Person p2=new Person(49);
//        Person p3=new Person("Mushahid",48);
//    }
    static void employee(){
        Employee e =new Employee();
        Employee e1=new Employee("Mushahid",40000);
        e.show();
        e1.show();
    }
    static void box(){
        Box b=new Box();
        Box b1=new Box(39);
        Box b2=new Box(30,23,43);
    }
    static void time(){
        Time t=new Time();
        Time t1=new Time(23);
        Time t2=new Time(4,32,2);

    }

    static void customer(){
        Customer c=new Customer(2,"Mushahid",234322334,"abc@gmail.com");
        Customer c1=new Customer(3,"hello",434);
    }
}
