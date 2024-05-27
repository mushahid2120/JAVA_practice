package Arrays;
import java.util.Scanner;
public class MainArray {
    static Scanner s=new Scanner(System.in);
    static int N;
    public static void main(String []args){
      averageCalculate();
    }
    static void nInteger(){
        System.out.println("Enter the size of the Array");
        int N=s.nextInt();
        int []arr=new int[N];
        System.out.println("Enter "+N+" numbers");
        for(int i=0;i<N;i++)
            arr[i]=s.nextInt();
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");

    }
    static void greatestNumber(){
        System.out.println("\nEnter the size of Array");
        N=s.nextInt();
        int []arr=new int[N];
        System.out.println("Enter "+N+" numbers");
        for(int i=0;i<N;i++)
            arr[i]=s.nextInt();
        int max=arr[0];
        for(int i=0;i<N;i++)
            max=Math.max(max,arr[i]);
        System.out.println("Greatest Number is :"+max);
    }
    static void smallestNumber (){
        System.out.println("\nEnter the size of Array");
        N=s.nextInt();
        int []arr=new int[N];
        System.out.println("Enter "+N+" numbers");
        for(int i=0;i<N;i++)
            arr[i]=s.nextInt();
        int min=arr[0];
        for(int i=0;i<N;i++)
            min=Math.min(min,arr[i]);
        System.out.println("Greatest Number is :"+min);
    }

    static void calculateSum(){
        System.out.println("Enter the size of an Array");
        N=s.nextInt();
        int sum=0;
        int []arr=new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum: "+sum);
    }
    static void averageCalculate(){
        System.out.println("Enter the size of an Array");
        N=s.nextInt();
        int sum=0;
        int []arr=new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum: "+(double)sum/N);
    }
    static void frequencyCalculate(){
        System.out.println("Enter size of an Array:");
        N=s.nextInt();
        int []arr=new int[N];
        for(int i=0,f=1;i<N;i++){

        }

    }
    }

