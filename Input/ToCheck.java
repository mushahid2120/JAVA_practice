package Input;
import AccessModifiers.Person;

public class ToCheck {
    public static void main(String []args){
        Person p=new Person();
        p.setAge(20);
        System.out.println("This is Age "+p.getAge());
    }
}
