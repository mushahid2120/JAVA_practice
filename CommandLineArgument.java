public class CommandLineArgument {
    public static void main(String []args){
        /*
        Question 1 and 2

        System.out.println("Command Line Arguments: ");
        int sum=0;
        for(int i=0;i<args.length;i++)
            sum=sum+Integer.parseInt(args[i]);
        System.out.println(sum);

         Question 3

        for(String arg:args)
            System.out.println(arg);

            Question 4 LCM of Two Numbers

        int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
        for(int i=Math.max(a,b) ;i<a*b;i++){
            if(i%a==0 && i%b==0) {
                System.out.println("LCM is : " + i);
                break;
            }
        }

        Question 5

        int i=2;
        for(;i<Integer.parseInt(args[0]);i++){
            if (Integer.parseInt(args[0]) % i == 0)
                break;
        }
        if(i==Integer.parseInt(args[0]))
            System.out.println("It is a prime Number");
        else
            System.out.println("It is not a  prime Number");

        Question 6 Show the prime from the given list

        for(String value:args) {
            int i = 2;
            for (; i < Integer.parseInt(value); i++) {
                if (Integer.parseInt(value) % i == 0)
                    break;
            }
            if (i == Integer.parseInt(value))
                System.out.println(value);
        }

         Question 7 find the factorial of a number

        int fact=1;
        for(int i=Integer.parseInt(args[0]);i>1;i--)
            fact=fact*i;
        System.out.println(fact);

        Question 8

        for(String value:args){
            int n=Integer.parseInt(value),sum=0;
            while(n>0){
                sum=sum+n%10;
                n=n/10;
            }
            System.out.println("Number is :"+Integer.parseInt(value)+" and the sum of it's digits is : "+sum);
        }

         Question 9 find the greatest number

        int max=Integer.parseInt(args[0]);
        for(int i=0;i<args.length;i++){
            max=Math.max(max,Integer.parseInt(args[i]));
        }
        System.out.println("Greatest Number is : "+max);

         */

        int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
        for(int i=Math.min(a,b);i>0;i--){
            if (a % i == 0 && b % i == 0) {
                System.out.println("HCF is of " + a + " and " + b + " is " + i);
                break;
            }
        }
    }
}
