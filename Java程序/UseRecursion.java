/*************************************************************************
	> File Name: UseRecursion.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月07日 星期五 16时52分42秒
 ************************************************************************/

import java.util.*;

public class UseRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("输入两个数: ");
        System.out.print("m = ");
        int m = input.nextInt();

        System.out.print("n = ");
        int n = input.nextInt();

        System.out.println("GCD: " + gcd(m,n));
    }
    private static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m%n);
        }
    }
}


