package AccessModifiers;
import AccessModifiers.Box;
public class mainClass {
    public static void main(String []args){

        AccessModifiers.Circle c=new AccessModifiers.Circle();
        c.setRadius(30);
        System.out.println("Circumference= "+c.getCircumference()+"\nArea= "+c.getArea());

        AccessModifiers.Employee e=new AccessModifiers.Employee();
        e.setEmpid(20);
        e.setName("Md Mushahid Ansari");
        e.setSalary(2431.32);

        System.out.println("Employee ID: "+e.getEmpid()+"\nName: "+e.getName()+"\nSalary: "+e.getSalary());

        Box b=new Box();
        b.setBreadth(30);
        b.setLength(20);
        b.setHeight(40);

        System.out.println("Surface Area: "+b.getSurfaceArea()+"\nVolume: "+b.getVolume());
    }
}
