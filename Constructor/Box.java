package Constructor;

public class Box {
    private int length,breadth,height;
    Box(){System.out.println("This is with no Argument");}
    Box(int length){this.length=length;System.out.println("This is with only One Argument");}
    Box(int length,int breadth,int height){
        this.length=length;
        this.breadth=breadth;
        this.height=height;
        System.out.println("This is with Three Argument");
    }
}
