/*************************************************************************
	> File Name: PointDistance.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月18日 星期日 08时34分09秒
 ************************************************************************/

import java.util.*;

class MyPoint {
    double x1, y1, x2, y2;
    
    public MyPoint() {
        x1 = 0;
        y1 = 0;
    }

    public double getX1() {
        return x1;
    }
    public double getY1() {
        return y1;
    }

    public MyPoint(double x2, double y2) {
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }
    public double getY2() {
        return y2;
    }

    public double distance(double x1,double y1,double x2,double y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
    public double distance(MyPoint point) {
        return point.distance(this.x1,this.y1,this.x2,this.y2);
    }
}

public class PointDistance {
    public static void main(String[] args) {
        double distance1, distance2;
        MyPoint mypoint1 = new MyPoint();
        MyPoint mypoint2 = new MyPoint(10,30.5);
        distance1 = mypoint1.distance(mypoint1.getX1(),mypoint1.getY1(),mypoint2.getX2(),mypoint2.getY2());
        distance2 = mypoint2.distance(mypoint2);
        System.out.println("distance1: " + distance1);
        System.out.println("distance2: " + distance2);
    }
}

