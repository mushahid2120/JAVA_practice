package AbstractClass;

abstract public class Accoount {
    private int balance;
    private long accountNo;
    static double rateOfInterest;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Accoount.rateOfInterest = rateOfInterest;
    }
    abstract double calculateInterest(int time);
}
class SavingAccount extends Accoount{
    private String name;
    void setName(String name){this.name=name;}
    String getName(){return this.name;}
    double calculateInterest(int time){return getBalance()*time*getRateOfInterest()/100;}
}
class Driver{
    Driver(){
        SavingAccount sv=new SavingAccount();
        sv.setName("Mushahid");
        sv.setBalance(10000);
        sv.setAccountNo(979464665);
        sv.setRateOfInterest(10);
        System.out.println("Name: "+sv.getName()+"\nAccount Number: "+sv.getAccountNo()+"\nBalance: "+sv.getBalance());
        System.out.println("Interest: "+sv.calculateInterest(3));
    }
}