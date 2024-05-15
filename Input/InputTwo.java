package Input;
import java.util.Scanner;

public class InputTwo {
    public static void main(String []args) {

//        Question 1
        int N;
        System.out.println("Enter a number to Check odd or Even");
        Scanner e = new Scanner(System.in);
        N = e.nextInt();
        if (N % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

//        Question 2
        int a, b, c;
        System.out.println("Enter three number to find the greatest of them");
        Scanner n = new Scanner(System.in);
        a = n.nextInt();
        b = n.nextInt();
        c = n.nextInt();

        System.out.println("Largest Number is : "+ Math.max(Math.max(a, b), c));


//        Question 3
        System.out.println("Enter a number to count the digits ");
        Scanner x=new Scanner(System.in);
        N=x.nextInt();
        int count=0;
        while(N!=0) {
           count++:
            N/=10;
        }
        System.out.println("Total Number of Digits "+count);

//        Question 4

        System.out.println("Enter a number to reverse their digits");
        Scanner rd=new Scanner(System.in);
        N=rd.nextInt();
        while(N!=0){
            System.out.print(N%10);
            N=N/10;
        }

//        Question 5
        System.out.println("\nEnter number to find the sum of n natural numbers");
                Scanner nat=new Scanner(System.in);
        N=nat.nextInt();
        int s=0;
        for(int i=1;i<=N;i++)
            s=s+i;
        System.out.println(s);

//        Question 6

        System.out.println("Enter a number print first N odd natural numbers");
        Scanner on=new Scanner(System.in);
        N=on.nextInt();
        s=0;
        for(int i=0;i<=N;i++)
            s=s+i*2+1;
        System.out.println("Sum of "+N+" first odd natural numbers is "+s);

//        Question 7

        System.out.println("Enter a number print first N even natural numbers");
        Scanner en=new Scanner(System.in);
        N=en.nextInt();
        s=0;
        for(int i=0;i<=N;i++)
            s=s+i*N;
        System.out.println("Sum of "+N+" even Natural numbers is "+s);

//        Question 8
        System.out.println("Enter a number print Square of first N natural number ");
        Scanner SQ=new Scanner(System.in);
        N=SQ.nextInt();
        for(int i=1;i<=N;i++)
            System.out.print(i*i+" ");

//        Question 9
        System.out.println("\nEnter a number to sum of digit of a given number");
        Scanner sn=new Scanner(System.in);
        N=sn.nextInt();
        s=0;
        while(N!=0){
            s=s+N%10;
            N=N/10;
        }
        System.out.println("Sum of digit of a number "+ "is "+s);

//        Question 10
        System.out.println("Enter number a for find the factorial ");
        Scanner ft=new Scanner(System.in);
        N=ft.nextInt();
        int fact=1;
        for(int i=1;i<=N;i++)
            fact=fact*i;
        System.out.println("Factorial of "+N+" is "+fact);
    }

}
