package OverRidingLoading;
import OverRidingLoading.Circle;
import OverRidingLoading.FilledRectangle;
import org.w3c.dom.css.Rect;

public class mainClassOver {
  public static void main(String []args){
        person2();
  }
  static void thickCircle(){
      ThickCircle tc=new ThickCircle();
      tc.setRadius(23);
      tc.setThickness(3);
      System.out.println("Area of Thick Circle: "+tc.getArea());
      Circle c=new ThickCircle();
      c.setRadius(23);

      System.out.println("Area of Circle: "+c.getArea());
  }
  public static void person(){
      Person p=new Person();
      p.setPerson();
      p.setPerson("Mushahid");
      p.setPerson("Mushahid",29);
      p.showPerson();
  }
  public static void rectangle(){
      FilledRectangle fr=new FilledRectangle();
      fr.setFillColor("Black");
      fr.setBorderColor("Pink");
      Rectangle r=new Rectangle();
      r.setBorderColor("Yellow");
      Rectangle rf=new FilledRectangle();
//      rf.setFillColor("Blue");
      rf.setBorderColor("Red");
      fr.printRectangleColor();
      r.printRectangleColor();
      rf.printRectangleColor();

  }
  public static void coordinate(){
      Coordinate c=new Coordinate(20,10);
      System.out.println("Distance from Origin: "+c.getDistance()+"\nDistance from point: "+c.getDistance(5,10));
  }
  public static void person2(){
      Person2 p=new Person2();
      p.setName("Mushahid");
      p.showName();
      p.showName("Mr. ");
  }
}
