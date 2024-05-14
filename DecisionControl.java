public class DecisionControl{
        public static void main(String []args){
//            Question 1 : divisible by 5 or not
        int x=43;
        if(x%5==0)
            System.out.println(x+"Divisible by 5");
        else
            System.out.println(x+"Not Divisible by 5");

//        Question 2: Check a number is even or odd
        if(x%2==0)
            System.out.println("Even number ");
        else
            System.out.println("Odd Numbers");
//        Question 3: check a given number is even odd without using modulo operator
//        int y=1;
      /*  if((x & y)==y)
            System.out.println("odd numbers");
        else
            System.out.println("Even numbers");
*/
//            Question 4:check a number is positive or non positive
            if (x>0)
                System.out.println("positive ");
            else
                System.out.println("negative ");
//            Question 5 : print greater between two numbers
            int m=5,n=6;
            if(m>n)
                System.out.println(m);
            else
                System.out.println(n);
//            Question 6: check a given number is positive ,negative and zero
            if(x==0)
                System.out.println("zero");
            else if(x>0)
                System.out.println("positive");
            else
                System.out.println("negative");

//            Question 7: print greatest among the three numbers
        int i=4,j=6,k=9;
        if(i>=j) {
            if (i >= k)
                System.out.println(i);
            else
                System.out.println(k);
        }
        else{
            if(j>=k)
                System.out.println(j);
            else
                System.out.println(k);
        }

//        Question  8: check a  given character is digit , alphabet and other symbol
        char s='A';
        if((s>='a' && s<='z') || (s>='A'&& s<='Z'))
            System.out.println("Alphabet ");
        else if(s>='0' && s<='9')
            System.out.println("Number ");
        else
            System.out.println("Other symbol");

//        Question 9: Check a given number is three digit number or not
            int p=342;
            if(p/100>0 && p/100<9)
                System.out.println("Three digit number Numbers");
            else
                System.out.println("Not a three digit numbers");
//        Question 10: Check a number is divisible by 5 and 7
        if(p%5==0 && p%7==0)
            System.out.println("Given Number is divisible by both 5 and 7");
        else
            System.out.println("Given number is not divisible by 5 and 7");


        }
}
