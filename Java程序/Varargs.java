/*************************************************************************
	> File Name: Varargs.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 15时30分47秒
 ************************************************************************/

import java.util.*;

public class Varargs {

    public static void test(int a, String...books) {
        //books被当做数组处理
        for (String tmp: books) {
            System.out.println(tmp);
        }
        System.out.println(a);
    }

    public static void main(String[] args) {
        test(5, "struct2权威指南", "基于J2EE的Ajax宝典");
    }
}

