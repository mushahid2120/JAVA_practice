import java.lang.InterruptedException;
public class Threading {
    public static void main(String []args){
        Chicken chick=new Chicken();
        Producer p=new Producer(chick);
        Consumer c=new Consumer(chick);
        Thread t1=new Thread(p,"Producer Thread");
        Thread t2=new Thread(c,"Consumer Thread");
        t1.start();
        t2.start();
    }
    static void f1(){
        Thread th1=new Thread(new Test());
        Thread th2=new Thread(new Test2());
        Thread th3=new Thread(new Test3());
        th1.start();
        th2.start();
        th3.start();
    }
    static void f2() {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e){
                    }
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        }, "Thread=1");


        Thread th1=new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=0;i<10;i++) {
                    try{Thread.sleep(1000);}catch(Exception e){}
                    System.out.println(i + " " + Thread.currentThread().getName());
                }
            }
        },"Thread=2");
        th.start();
        th1.start();
    }
}

class Test implements Runnable{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println(i);
        System.out.println("Test");
    }
}

class Test2 implements Runnable {
    public void run() {
    for(int i = 0;i<10;i++)
            System.out.println(i);
        System.out.println("Test2");
}
}

class Test3 extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
            System.out.println(i);
        System.out.println("Test3");
    }
}

class Chicken{
    private int eggNo;
    private boolean eggSetFlag=true;


    public synchronized int getEggNo() {
        while(eggSetFlag){
            try{wait();}catch(Exception e){}
        }
        System.out.println("get Egg No. : "+eggNo);
        eggSetFlag=true;
        notify();
        return eggNo;
    }

    public synchronized void setEggNo(int eggNo) {
        while(!eggSetFlag){
            try{wait();}catch(Exception e){}
        }
        eggSetFlag=false;
        this.eggNo = eggNo;
        notify();
        System.out.println("set Egg No: "+this.eggNo);
    }
}

class Producer implements Runnable{
    Chicken chicks;
    public Producer(Chicken chick){this.chicks=chick;}
    public void run(){
        int i=1;
        while(true) {
            chicks.setEggNo(i++);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
}
class Consumer implements Runnable{
    Chicken chicks;
    public Consumer(Chicken chick){this.chicks=chick;}
    public void run(){
        int i;
        while(true) {
            i = chicks.getEggNo();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}