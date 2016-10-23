/*************************************************************************
	> File Name: AppendStringTest.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 20时47分28秒
 ************************************************************************/

import java.util.*;

public class AppendStringTest {
    public static void main(String[] args) {
        String text = "";
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            text = text + i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间: " + (endTime - beginTime));
        
        StringBuilder builder = new StringBuilder("");
        beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("执行时间: " + (endTime - beginTime));
    }
}

