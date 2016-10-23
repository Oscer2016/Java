/*************************************************************************
	> File Name: CircleLocation.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月18日 星期日 15时17分06秒
 ************************************************************************/

import java.util.*;

class Circle2D{
    double x1, y1, x2, y2;
    double radius1, radius2;

    public double getX1() {
        return x1;
    }
    public double getY1() {
        return y1;
    }
    public double getRadius1() {
        return radius1;
    }

    public Circle2D() {
        x1 = 0;
        y1 = 0;
        radius1 = 1;
    }
    public Circle2D(double x2, double y2, double radius2) {
        this.x2 = x2;
        this.y2 = y2;
        this.radius2 = radius2;
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double getPerimeter(double radius) {
        return Math.PI * radius * 2;
    }
    
    public boolean contains(double x, double y) {
        double d;
        d = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        if (d < radius1) {
            return true;
        }
        return false;
    }
    public boolean contains(Circle2D circle) {
        double d;
        d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if (d <= Math.abs(radius2 - radius1)) {
            return true;
        }
        return false;
    }
    public boolean overlaps(Circle2D circle) {
        double d;
        d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if (d > Math.abs(radius2 - radius1) && d < radius1 + radius2) {
            return true;
        }
        return false;
    }
}

public class CircleLocation {
    public static void main(String[] args) {
        Circle2D circle1 = new Circle2D();
        Circle2D circle2 = new Circle2D(2,2,5.5);
        System.out.println("circle2's Area: " + circle2.getArea(5.5));
        System.out.println("circle2's Perimeter: " + circle2.getPerimeter(5.5));
        if (circle1.contains(3,3)) {
            System.out.println("Point is inside the circle.");
        }
        if (circle1.contains(new Circle2D(4,5,10.5))) {
            System.out.println("The specified circle is inside this circle.");
        }
        if (circle1.contains(new Circle2D(3,5,2.3))) {
            System.out.println("The specified circle is overlaps this circle.");
        }
    }
}

