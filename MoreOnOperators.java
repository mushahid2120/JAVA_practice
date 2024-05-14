public class MoreOnOperators {
    public static void main(String []args){
//        Question 1 :Change the character using increment operator
          char c='A';
          c++;
          System.out.println(c);

//          Question 2:Print the Unicode of a Character
        int x='+';
        System.out.println(x);

//        Question 3:make the last digit of a number zero

        int a=2345;
//        a=a/10*10;
        System.out.println(a);

//        Question 4: Sum of digit of Number

        int sum=a%10+a/10%10+a/100%10+a/1000;
        System.out.println(sum);
//        Question 5: Result of an expression
//                System.out.println(5>4>3);  Error Bad oprands
//        Question 6: find the value

//        int p=(int)true; Boolean can't be convertible
//        Question 7: result of an expression

//        int p=!5>-2;  !only take Boolean

//        Question 8: output of an expression
        System.out.println(5.5%1.5);
//        Question 9:reverse a three digits number

            int p=345,reverse=p%10*100+p/10%10*10+p/100;
            System.out.println(reverse);

//            Question 10: print the character of unicode 100
            char c1=100;
            System.out.println(c1);
    }

}
