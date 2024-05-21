package Inheritance;

class Circle{
    private int radius;
    Circle(int r){radius=r;}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){return 3.14*radius*radius;}
}
public class ThickCircle extends Circle {
    private int thickness;
    ThickCircle(int r,int thick){super(r);this.thickness=thick;}
    public double getHollowArea(){return getArea()-(3.14*(getRadius()-thickness)*(getRadius()-thickness));}
    public double getThickArea(){return getArea()-getHollowArea();}

}
