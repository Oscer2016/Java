/*************************************************************************
	> File Name: M14_13.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月14日 星期五 19时26分50秒
 ************************************************************************/

import java.math.*;

public class M14_13 {
    public static void main(String[] args) {
        long num = (long)Math.sqrt(Long.MAX_VALUE);
        for (int i = 0; i < 10; i++) {
            System.out.println(new BigInteger(num++ + "").pow(2));
        }
    }
}

