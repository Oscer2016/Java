/*************************************************************************
	> File Name: Test.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月14日 星期五 20时52分47秒
 ************************************************************************/

import java.math.*;

public class Test {
    public static void main(String[] args) {
        int cnt = 2;
        do {
            BigInteger num = new BigInteger("2");
            num = num.pow(cnt).subtract(BigInteger.ONE);
            if (num.isProbablePrime(10000)) {
                System.out.println(num);
            }
            cnt++;
        } while (cnt <= 100);
    }
}

