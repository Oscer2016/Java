/*************************************************************************
	> File Name: TestTriangle.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月20日 星期四 08时53分32秒
 ************************************************************************/

import java.util.*;

class GeometricObject {
    private String color = " white ";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;   
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "color: " + color + "\nfilled: " + filled;                 
    }   
}

class Triangle extends GeometricObject {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side2;
    }

    public double getArea() {
        double area, s;
		s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s- side1) * (s - side2) * (s - side3));
		return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class TestTriangle  {
    public static void main(String[] args) {

		Triangle triangle = new Triangle(1, 1.5, 1);
		triangle.setFilled(true);
		triangle.setColor("yellow");
   
		System.out.println("The Triangle's Area is " + triangle.getArea());
		System.out.println("The Triangle's Perimeter is " + triangle.getPerimeter());
		System.out.println(triangle.toString());
    }
}
