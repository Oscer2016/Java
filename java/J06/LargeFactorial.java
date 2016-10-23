/*************************************************************************
	> File Name: LargeFactorial.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月13日 星期四 22时16分33秒
 ************************************************************************/

import java.math.*;

public class LargeFactorial {
    public static void main(String[] args) {
        for (int i = 100; i <= 1000; i+=100) {
            System.out.println("1 + 1/1! + 1/2! + ... + 1/" + i + "! = " + factSum(i));
        }
    }
    public static BigDecimal factSum(int n) {
        BigDecimal t = BigDecimal.ONE;
        BigDecimal sum = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            t = t.multiply(new BigDecimal(i + ""));
            sum = sum.add(BigDecimal.valueOf(1).divide(t,25,4));
        }
        return sum;
    }
}

