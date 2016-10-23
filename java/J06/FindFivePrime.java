/*************************************************************************
	> File Name: FindPrime.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月13日 星期四 21时20分48秒
 ************************************************************************/

import java.math.*;

public class FindFivePrime{
    public static void main(String[] args) {
        BigInteger num = new BigInteger(Long.MAX_VALUE + "");
        num = num.add(BigInteger.ONE);
        int cnt = 0;
        while (cnt < 5) {
            if (num.isProbablePrime(10000)) {
                System.out.println(num);
                cnt++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}

