package Inheritance.Account;

public class Account {
    private int accNumber,balance;
    protected int pro=10;
    int d=5;
    public int pub=20;


    protected void setAccNumber(int ac){this.accNumber=ac;}
    protected int setBalance(int b){
        balance=b+balance;
        return balance ;
    }
}