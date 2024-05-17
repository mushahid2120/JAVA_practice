package PackageImport;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.lang.StrictMath;

import Hello.HelloWorld;
public class PackageAndImport {
    public static void main(String []args){
                LocalDate t=LocalDate.now();
                System.out.println(t);

                LocalTime tm=LocalTime.now();
                System.out.println(tm);


                Random r=new Random();
                for(int i=0;i<5;i++)
                    System.out.println(r.nextInt(100,200));


        HelloWorld h=new HelloWorld();
        h.f1();

    }

}
