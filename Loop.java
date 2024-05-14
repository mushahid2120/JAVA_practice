public class Loop {
    public static void main(String []args){
        /* Question 1
                        *
                        **
                        ***
                        ****
                        *****
         */
        /*
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         */

        /* Question 2
                             *
                            **
                           ***
                          ****
                         *****
         */
/*
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
*/

        /* Question 3
                    *****
                    ****
                    ***
                    **
                    *
         */
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=5-i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
         */
        /*   Question 4
                                         *****
                                          ****
                                           ***
                                            **
                                             *

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
         */

        /*
        Question 5
                            1
                            12
                            123
                            1234
                            12345

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
         /*
         Question 6
                            1
                            2 1
                            3 2 1
                            4 3 2 1
                            5 4 3 2 1


        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i-j+1);
            }
            System.out.println();
        }
         */

        /* Question 7
                                ABCDE
                                 ABCD
                                  ABC
                                   AB
                                    A

        for(int i=1;i<=5;i++){
            char c='A';
            for(int j=1;j<=5;j++){
                if(j>i-1)
                    System.out.print(c++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

         */

        /*
        Question 8
                                    1
                                    23
                                    456
                                    78910

        int a=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++ + " ");
            }
            System.out.println();
        }

         */
        /*
        Question 9
                                ABCDE
                                 BCDE
                                  CDE
                                   DE
                                    E

        for(int i=1;i<=5;i++){
            char c='A';
            for(int j=1;j<=5;j++){
                if(j>i-1)
                    System.out.print(c);
                else
                    System.out.print(" ");
                c++;
            }
            System.out.println();
        }

         */
        /*
        Question 10
                        *****
                        *   *
                        *   *
                        *   *
                        *****
         */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
