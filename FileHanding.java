import java.io.*;

public class FileHanding {
    public static void main(String []args){
        try{
            writing();
        }catch(IOException e){System.out.println(e.getMessage());}
        try{
            reading();
        }catch(IOException e){System.out.println(e.getMessage());}
    }
   static void writing() throws IOException{
        FileOutputStream fout=new FileOutputStream("C:\\Users\\saba ahmad\\Desktop\\Programes\\Intellij IDEA\\JAVA SE\\First\\src\\Filehandling_files\\md.txt");
                String s="This is Md Mushahid Ansari";
        for(int i=0;i<s.length();i++)
            fout.write(s.charAt(i));
        fout.close();
    }

    static void reading() throws IOException{
        FileInputStream fin=new FileInputStream("C:\\Users\\saba ahmad\\Desktop\\Programes\\Intellij IDEA\\JAVA SE\\First\\src\\Filehandling_files\\md.txt");
        int i;
        do{
            i=fin.read();
            if(i!=-1)
                System.out.print((char)i);
        }while(i!=-1);
        fin.close();
    }
}
