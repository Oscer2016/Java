/*************************************************************************
	> File Name: BinToInt.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 10时57分32秒
 ************************************************************************/

import java.util.*;

class BinToDec {
    public int getDec(long n) {
        int ten = 0, t = 1, r;
        while (n != 0) {
            r = (int)(n % 10);
            ten = ten + r * t;
            t *= 2;
            n /= 10;
        }
        return ten;
    }
}

public class BinToInt {
    public static void main(String[] args) {
        BinToDec o = new BinToDec();
        System.out.println(11010 + " Binary to Dec: " + o.getDec(11010));
    }
}

