public class WrapperClass {
    public static void main(String []args){

       /*
       Question 1
        Circle c=new Circle();
        c.setRadius(30);
        System.out.println("Radius= "+c.getRadius()+"\nCircumference= "+ c.getCircumferece());
        */
        MarkSheet m=new MarkSheet();
        m.setMarks(40,30,10,50,90);
        m.show();
        System.out.println(m.getMaxMark());
        System.out.println(m.getaverage());
        System.out.println(m.passOrFail(300));
    }
}
/*
Question 1
class Circle{
    Integer radius;
    void setRadius(int r){radius=Integer.valueOf(r);}
    int getRadius(){return radius.intValue();}
    float getCircumferece(){return 3.14f*2*radius.intValue();}
}
*/
class MarkSheet{
    Integer physics,mathematics,chemistry,English,Hindi;
    void setMarks(int p,int m,int c,int e,int h){
        physics=Integer.valueOf(p);
        mathematics=Integer.valueOf(m);
        chemistry=Integer.valueOf(c);
        English=Integer.valueOf(e);
        Hindi=Integer.valueOf(h);
    }
    void show(){
        System.out.println(physics.intValue()+" "+mathematics.intValue()+" "+chemistry.intValue()+" "+English.intValue()+" "+Hindi.intValue());
    }
    int getMaxMark(){
        return Math.max(Math.max((Math.max((Math.max(English.intValue(),Hindi.intValue())),physics.intValue())),chemistry.intValue()),mathematics.intValue());
    }
    float getaverage(){
        return (physics.floatValue()+chemistry.floatValue()+mathematics.floatValue()+English.floatValue()+Hindi.floatValue())/5;
    }
    String passOrFail(int margin){
        if(this.getaverage()*5>margin)
            return "Pass";
        return "Fail";
    }
}

