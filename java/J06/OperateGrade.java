/*************************************************************************
	> File Name: OperateGrade.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月13日 星期四 19时53分32秒
 ************************************************************************/

import java.util.*;

public class OperateGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = new String[5];
        float[] a = new float[5];
        System.out.println("please input five students' information: ");
        float sum = 0;
        for (int i = 0; i < 5; i++) {
            s[i] = input.next();
            a[i] = input.nextFloat();
            sum += a[i];
        }
        System.out.println("sum = " + sum);
        System.out.println("aver = " + sum/5);
    }
}

