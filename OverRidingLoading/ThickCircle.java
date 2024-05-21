package OverRidingLoading;

class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;}

}
public class ThickCircle extends Circle{
    private int thickness;

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
    public double getArea(){
        return super.getArea()-(3.14*(getRadius()-thickness)*(getRadius()-thickness));}
}