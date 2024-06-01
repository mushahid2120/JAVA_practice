public class Lambda {
    public static void main(String []args){
        I1 obj=new I1(){                //Anonymous class
            public void show(){
                System.out.println("Hello");
            }
        };
        I1 obj1 = ()->{System.out.println("Welcome");};         //Lambda Expression
        obj.show();
        obj1.show();

    }
}
@FunctionalInterface
interface I1{
    void show();
    String toString();
}