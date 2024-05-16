package AccessModifiers;

public class Box {
    private int length,breadth,height;
    protected double volume,SurfaceArea;

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getVolume() {
        return length*breadth*(double)height;
    }


    public double getSurfaceArea() {
        return 6.0*(length*breadth);
    }


}
