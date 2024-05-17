package Constructor;

public class Time {
    private int hour,min,seconds;
    Time(){System.out.println("Constructor with No Argument");}
    Time(int s){System.out.println("Constructor with One Argument");}
    Time (int h,int m,int s){System.out.println("Constructor with three Argument");}
}
