package OverRidingLoading;

public class Rectangle {
    private int length,breadth;
    private String borderColor;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    void printRectangleColor(){
        System.out.println("Color of border of Rectangle: "+borderColor);
    }
}
class FilledRectangle extends Rectangle{
    private String fillColor;

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }
    void printRectangleColor(){System.out.println("Filled color is : "+fillColor);}
}
