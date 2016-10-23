/*************************************************************************
	> File Name: TestRationalClass.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月15日 星期六 18时03分03秒
 ************************************************************************/

import java.lang.Number;
import java.lang.Comparable;

public class TestRationalClass {
    public static void main(String[] args) {
        Rational r1 = new Rational(4,2);
        Rational r2 = new Rational(2,3);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}

