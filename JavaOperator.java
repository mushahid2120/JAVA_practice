public class JavaOperator {
    public static void main(String []args){
//        First Question
        int x=345;
        System.out.println("Unit digit is "+x%10);
//        Second Question
        System.out.println("Number without the Last Digit "+x/10);
//        Third Question
        int a=10,b=50,temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"\nb="+b);
//        Question 7
        System.out.println(35&83);
//        Question 8
        System.out.println(47|29);
//        Question 9
        System.out.println(76^108);
//        Question 10  Rotate a  number toward right
        System.out.println(x%100*10+x/100);
    }

}

