package OverRidingLoading;

public class Coordinate {
    private int x,y;
    Coordinate(int a,int b){x=a;y=b;}
    double getDistance(){
        return Math.sqrt(x*x+y*y);
    }
    double getDistance(int a,int b){
        return Math.sqrt((x*x-a*a)+(y*y-b*b));
    }
}
