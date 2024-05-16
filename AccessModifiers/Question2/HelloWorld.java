package AccessModifiers.Question2;

public class HelloWorld {
    public static void main(String  []args){
        A1 a=new A1();
        a.show();
    }
}

class A1{
    B1 b1=new B1();
    B2 b2=new B2();
    void show(){
        b1.show();
        b2.show();
    }
}

class B1{
       public void show(){
            System.out.println("This is Class B1");
        }
}

class B2{
    public void show(){
        System.out.println("This si Class B2");
    }

}