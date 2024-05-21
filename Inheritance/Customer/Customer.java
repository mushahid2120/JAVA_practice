package Inheritance.Customer;
import Inheritance.Account.Account;
public class Customer extends Account {
    private String customerName;
    private String accountName;
    public Customer(int ac,String name,String aName){super.setAccNumber(ac);this.customerName=name;this.accountName=aName;super.setBalance(2000);}
    public void deposit(int a){setBalance(a);}
    public void withDraw(int w){setBalance(-1*w);}
    public void checkBalance(){System.out.println("Your Current Balance is : "+setBalance(0));}
    public void check(){
//        System.out.println(super.pub+" "+super.d+" "+super.pro);
    }

}
