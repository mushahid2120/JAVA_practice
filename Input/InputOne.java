package Input;
import java.util.Scanner;

public class InputOne {
    public static void main(String []args){
        int N;
        Scanner sc=new Scanner(System.in);
        N= sc.nextInt();
        for(int i=0;i<N;i++)
            System.out.print(i+" ");
        Scanner sc1=new Scanner(System.in);
        N=sc1.nextInt();
        for(int i=0;i<=2*N+1;i++)
            System.out.print(i+" ");
    }
}
