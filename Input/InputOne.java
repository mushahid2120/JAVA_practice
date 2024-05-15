package Input;
import java.util.Scanner;

public class InputOne {
    public static void main(String []args){
        int N;
        System.out.println("Enter number want to print Natural numbers");
        Scanner sc=new Scanner(System.in);
        N= sc.nextInt();
        for(int i=0;i<N;i++)
            System.out.print(i+" ");

        System.out.println("\nEnter number want or print natural numbers in reverse order");
        Scanner rn=new Scanner(System.in);
        N=rn.nextInt();
        for(int i=N;i>0;i--)
            System.out.print(i+" ");

        System.out.println("\nEnter number want to print odd numbers ");
        Scanner sc1=new Scanner(System.in);
        N=sc1.nextInt();
        for(int i=0;i<=N;i++)
            System.out.print(i*2+1+" ");

        System.out.println("\nEnter number want to print odd number in revers order ");
        Scanner ro=new Scanner(System.in);
        N=ro.nextInt();
        for (int i=N;i>=0;i--)
            System.out.print(2*i+1 + " ");

        System.out.println("\nEnter number want to print even number ");
        Scanner e=new Scanner(System.in);
        N=e.nextInt();
        for(int i=1;i<N;i++)
            System.out.print(i*2+" ");

        System.out.println("\nEnter number want to print even number in rever order");
        Scanner re=new Scanner(System.in);
        N=re.nextInt();
        for(int i=N;i>0;i--)
            System.out.print(2*i+" ");

        System.out.println("\nEnter numbers want to print number Square");
        Scanner sq=new Scanner(System.in);
        N=sq.nextInt();
        for(int i=1;i<=N;i++)
            System.out.print(i*i+" ");

        System.out.println("\nEnter number want to print there cubes ");
        Scanner cb=new Scanner(System.in);
        N=cb.nextInt();
        for(int i=1;i<=N;i++)
            System.out.print(i*i*i+" ");

        System.out.println("\nEnter number you want to print their Tables");
        Scanner table=new Scanner(System.in);
        N=table.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(N+" * "+i+" = "+N*i);
    }
}
