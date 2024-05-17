package Constructor;

public class Customer {
    private int id;
    private String name;
    private int mobile;
    private String email;

    public Customer(int id ,String name,int mobile,String email){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
        System.out.println("This is constructor with Four Argumens");
    }
    public Customer(int id,String name,int mobile){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        System.out.println("This is constructor with Three Argument");
    }
}
