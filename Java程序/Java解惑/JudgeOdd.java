/*************************************************************************
	> File Name: JudgeOdd.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月23日 星期日 16时39分08秒
 ************************************************************************/

import java.util.*;

class IsOdd {
    public static boolean isOdd(int i) {
        //return i % 2 != 0;          //correct
        //return i % 2 == 1;        //error,负奇数会失败
        return (i & 1) != 0;      //correct,性能高
    }
}

public class JudgeOdd {
    public static void main(String[] args) {
        System.out.println(IsOdd.isOdd(5));
    }
}

