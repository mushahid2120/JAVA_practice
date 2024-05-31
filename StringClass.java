import java.util.Scanner;

public class StringClass {
    static String s;
    static Scanner sc=new Scanner(System.in);

public static void main(String []args){
        countWord();
    }
    static void countVowel(){
        s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='o' || c=='u' || c=='i'){
                count++;
            }
        }
        System.out.println(count++);
    }

    static void reverseString (){
    s=sc.nextLine();
    for(int i=s.length()-1;i>=0;i--){
        System.out.print(s.charAt(i));
    }
    }

    static void checkpallandrom(){
    String s=sc.next();
    int i;
    for(i=0;i<s.length();i++){
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
            break;
    }
    if(i==s.length())
        System.out.println("This is pallendrome");
    else
        System.out.println("This is not pallendrome");

    }

    static void countWord(){
        String s=sc.nextLine();
        s=s.trim();
        int count=0;
               s= s.replace(" ","");
        for(int i=0;i<s.length();i++)
            System.out.println(s.charAt(i)+" "+count++);
        System.out.println("Number of word are : "+(count+2));
    }

/*
    static void occurrencePattern(String pattern) {
        s = sc.nextLine();
        int countWord = 0;
        int countPattern=0;
        for (int i = 0,j=0; i < s.length(); i++,j=0) {
                while (s.charAt(i)==pattern.charAt(j)) {
                    countWord++;
                    if(i<(s.length()-1) && j<(pattern.length()-1)) {
                        j++;
                        i++;
                    }
                }
                if(countWord==pattern.length()) {
                    countPattern++;
                    countWord=0;
                    i--;
                }
                else i--;

        }
        System.out.println(countPattern++);
    }

 */

}
