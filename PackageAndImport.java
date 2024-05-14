package PackageImport;
import java.time.LocalDate;
import java.time.LocalTime;
import java.text.Format;
import Hello.HelloWorld;
public class PackageAndImport {
    public static void main(String []args){
                LocalDate t=LocalDate.now();
                System.out.println(t);

                LocalTime tm=LocalTime.now();
                System.out.println(tm);




        HelloWorld h=new HelloWorld();
        h.f1();

    }

}
