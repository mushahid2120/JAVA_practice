package AccessModifiers;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    double getCircumference(){
        return 3.14*2*radius;
    }

    double getArea(){
        return 3.14*radius*radius;
    }
}
