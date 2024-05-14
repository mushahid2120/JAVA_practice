public class ClassAndObjects {

    public static void main(String[] args) {
        /*
        Question 1
        ComplexNumber n=new ComplexNumber();
        n.set(5,4);
        n.show();

         Question 2
        Time t=new Time();
        t.set(4,30,20);
        t.show();

            Question 3
        Cuboid c=new Cuboid();
        c.set(4);
        System.out.println(c.get()+" "+c.Volume()+" "+c.SurfaceArea());

         Question 4
        Employee E=new Employee();
        E.set(2,"Rahul",4.6f);
        E.show();
         Question 5
        contact c=new contact();
        c.get(2,45432332,"Mushahid","Ansari","md.mushahid@gmail.com");
        c.show();
       Question 6
        Question q=new Question();
        q.set(1,"What is your name?","Rahul","Amit","Kuldip","Rakesh");
        q.show();

         Question 7
        Course c=new Course();
        c.set(3,45,43,"Python");
        c.show();

         Question 8
        Distance d1=new Distance(),d2=new Distance();
        d1.set(34,234,50);
        d2.set(40,30,10);
        d1.add(d2).show();
     Question 9
        Circle c=new Circle();
        c.set(45);
        c.show();
         */
        Book b=new Book();
        b.set(3,"Rahul","new Book",3.2f);
        b.show();

    }
}
/*
Question 1
class ComplexNumber{
    int real,imaginary;
    void set(int a,int b){real=a;imaginary=b;}
    void show (){System.out.println(real+ "+ i" + imaginary);}
}
Question 2
class Time{
    int hr,min,sec;
    void set(int a,int b,int c){hr=a;min=b;sec=c;}
    void show(){System.out.println(hr+"hr "+min+"min "+sec+"sec");}
}


 Question 3


class Cuboid {
    int length;
    void set(int a){length=a;}
    int get(){return length;}
    int Volume(){return length*length*length;}
    int SurfaceArea(){return 6*length*length;}
}

 Question 4
class Employee{
    int empid;
    String name;
    float salary;
    void set(int id,String n,float s){empid=id;name=n;salary=s;}
    void show() {
        System.out.println("Employee Id= " + empid + "\nName= "+name+"\nSalary="+salary);
    }
}
 Question 5
class contact{
                int id,mobileNo;
                String firstName,lastName,email;
                void get(int i,int n,String fname,String lname,String m){
                    id=i;
                    mobileNo=n;
                    firstName=fname;
                    lastName=lname;
                    email=m;
                }
                void show(){
                    System.out.println(id);
                    System.out.println(firstName+" "+lastName);
                    System.out.println(email);
                    System.out.println(mobileNo);
                }

        }

 Question 6
class Question{
    int quesNo;
    String Que,optionA,optionB,optionC,optionD;
    void set(int qn,String qu,String opA,String opB,String opC,String opD)
    {
        quesNo=qn;
        Que=qu;
        optionA=opA;
        optionB=opB;
        optionC=opC;
        optionD=opD;
    }
    void show(){
        System.out.println(quesNo+"."+Que+"\nA."+optionA+"\nB."+optionB+"\nC."+optionC+"\nD."+optionD);
    }
}

Question 7
class Course{
    int courseid,duration,fee;
    String courseName;
    void set(int id,int d,int f,String cn){
        courseid=id;
        duration=d;
        fee=f;
        courseName=cn;
    }
    void show(){
        System.out.println(courseid);
        System.out.println(courseName);
        System.out.println(duration);
        System.out.println(fee);

    }
}

Question 8
class Distance{
    int km,m,cm;
    void set(int k,int M,int c){
        km=k;m=M;cm=m;
    }
    void show(){System.out.println(km+" "+m+" "+cm);}
    Distance add(Distance d){
        Distance d1=new Distance();
        d1.km=d.km+km;
        d1.m=d.m+m;
        d1.cm=d.cm+cm;
        return d1;
    }
}
 Question 9
class Circle{
    int radius;
    void set(int r){radius=r;}
    void show(){System.out.println("Radius "+radius+"\nArea "+2*3.14*radius*radius+"\nCircumference "+2*3.14*radius);}
}
 */

class Book{
    int bookid;
    String Author,title;
    float price;
    void set(int id,String author,String t,float p){
        bookid=id;
        Author=author;
        title=t;
        price=p;
    }
    void show(){
        System.out.println(bookid);
        System.out.println(title);
        System.out.println(Author);
        System.out.println(price);

    }
}