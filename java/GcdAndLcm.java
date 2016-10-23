/*************************************************************************
	> File Name: GcdAndLcm.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月05日 星期三 10时21分56秒
 ************************************************************************/

import java.util.*;

class GcdLcm {
    public int getGcd(int m, int n) {
        int r;
        r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}

public class GcdAndLcm {
    public static void main(String[] args) {
        int a, b, c;
        Scanner reader = new Scanner(System.in);
        System.out.print("输入2个整数: ");
        a = reader.nextInt();
        b = reader.nextInt();
        GcdLcm o = new GcdLcm();
        c = o.getGcd(a,b);
        System.out.println("gcd(" + a + "," + b + ") = " + c);
        System.out.println("lcm(" + a + "," + b + ") = " + (a*b)/c);
    }
}

