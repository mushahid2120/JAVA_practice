public class StaticMemeber {
        public static void main(String []args){
            /*
            Question 1
            Account a=new Account();
            a.setAccountName("Mushahid");
            a.setBalance(5000);
            a.setAccountNumber(942993993);
            a.setRateofInterest(30);
            System.out.println(a.getCustomerName()+" "+a.getAccountNumber()+" "+a.getBalance()+" "+a.getsimpleInterest(10));

             Question 2
            SuperCar s=new SuperCar();
            s.setBrand("BMW");
            s.setColor("Black");
            s.setPrice(434232323.11f);
            s.setOwnerName("Mukesh");
            System.out.println(s.getBrand()+" "+s.getColor()+" "+s.getPrice()+" "+SuperCar.getOwnerName());
            Question 3

            Video v=new Video();
            v.setVideo(20,300,200,"How to make Money?");
            v.show();

            Question 4
            Batch b=new Batch();
            b.setBatch(12,"DSA with Python","4 Oct 2024","3pm Every Day","Every day",10);
            b.showBatch();
             */
            Box b=new Box();
            b.setDimension(32,44,11);
            b.showDimension();
        }
}

class Batch{
    int batchCode,studentCount;
    String courseName,startDAte,time,days;
    static int totalNumberofBatches;
    void setBatch(int bCode,String cName,String sDate,String t,String d,int c)
    {
        batchCode=bCode;
        courseName=cName;
        startDAte=sDate;
        time=t;
        days=d;
        studentCount=c;
        totalNumberofBatches++;
    }
    void showBatch(){
        System.out.println(batchCode+" "+courseName+" "+startDAte+" "+time+" "+days);
    }
    int getNumberOfBatches(){return totalNumberofBatches;}
}
class Box{
    int length,breadth,height;
    static int count;
    void setDimension (int l,int b,int h){height=h;breadth=b;length=l;}
    void showDimension () {
        System.out.println(length + " " + breadth + " " + height+" "+ ++count);
    }
}
