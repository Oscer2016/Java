/*************************************************************************
	> File Name: FindDivisible.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月13日 星期四 21时00分38秒
 ************************************************************************/

import java.math.*;

public class FindDivisible {
    public static void main(String[] args) {
		int cnt = 0;
		BigInteger num = new BigInteger(Long.MAX_VALUE + "");
        num = num.add(BigInteger.ONE);

		while(cnt < 10) {
            if (num.remainder(BigInteger.valueOf(5)) == BigInteger.valueOf(0) || num.remainder(BigInteger.valueOf(6)) == BigInteger.valueOf(0)) {
		        System.out.println(num);
		        cnt++;
            }
            num = num.add(BigInteger.ONE);
		}
    }
}

