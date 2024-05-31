package Arrays;
import Constructor.Employee;

import java.util.Scanner;
public class MainArray {
    static Scanner s=new Scanner(System.in);
    static int N;
    public static void main(String []args){
        sortEmployee();

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
    static void frequencyCalculate() {
        int []arr = {2, 35, 12, 4, 1, 2, 3, 4, 21, 1};
        arr=sorted(arr);

        for (int i = 0, f = 1; i < arr.length-1; i++,f=1) {
            while(arr[i]==arr[i+1]) {
                f++;
                i++;
            }
            System.out.println("Number is "+arr[i]+"   Frequency: "+f);
            if(i==arr.length-2 && arr[i]!=arr[i+1])
                System.out.println("Number is "+arr[i+1]+"   Frequency: "+f);

        }
    }

    static int[] sorted(int []arr){

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
        }
            for(int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
            System.out.println();
            return arr;
    }

    static void sumEven(){
        int []arr={4,22,1,4455,42,12,2,564,2,32,5,34223};
        int sum=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2==0)
                sum=sum+arr[i];
        System.out.println(sum);

    }
    static class Employee1{
        private int id;
        private String name;
        private double salary;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    static void sortEmployee(){
        Employee1 []e=new Employee1[5];
        for(int i=0;i<5;i++){
            e[i]=new Employee1();
        }
        e[0].setId(4);e[0].setName("Mushahid");e[0].setSalary(40000);
        e[1].setId(5);e[1].setName("Sameer");e[1].setSalary(50000);
        e[2].setId(3);e[2].setName("Arbaz");e[2].setSalary(10000);
        e[3].setId(7);e[3].setName("Rohit");e[3].setSalary(70000);
        e[4].setId(9);e[4].setName("Aman");e[4].setSalary(200000);

        for(int i=0;i<e.length;i++){
            for(int j=0;j<e.length-i-1;j++){
                if(e[j].getSalary()>e[j+1].getSalary())
                {
                    Employee1 temp=e[j];
                    e[j]=e[j+1];
                    e[j+1]=temp;
                }
            }
        }
        for(int i=0;i<e.length;i++)
            System.out.println(e[i].getId()+" "+e[i].getName()+" "+e[i].getSalary());
        System.out.println();

        for(int i=0;i<e.length;i++){
            for(int j=0;j<e.length-i-1;j++){
                if(e[j].getName().compareToIgnoreCase(e[j+1].getName())>0)
                {
                    Employee1 temp=e[j];
                    e[j]=e[j+1];
                    e[j+1]=temp;
                }
            }

        }
        for(int i=0;i<e.length;i++)
            System.out.println(e[i].getId()+" "+e[i].getName()+" "+e[i].getSalary());
    }

    
}

