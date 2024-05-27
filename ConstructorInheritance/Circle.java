package ConstructorInheritance;

public class Circle {
    private int radius;
    {radius=5;}
    public final static double PI;
    static{PI=3.14;}

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
}
