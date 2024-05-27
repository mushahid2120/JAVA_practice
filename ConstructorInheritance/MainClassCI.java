package ConstructorInheritance;

public class MainClassCI {
    public static void main(String []args){
        person1();
    }
    static void person(){
        Person p=new Person("Mushahid",24);
    }
    static void circle(){
        Circle c=new Circle();
        c.setRadius(13);
        System.out.println("Area of a Circle having radius:"+c.getRadius()+"is: "+c.getArea());
    }
    static void person1(){
        Employee e=new Employee();
        e.check();
    }
}
