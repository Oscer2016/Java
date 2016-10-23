/*************************************************************************
	> File Name: RegularExpressionDemo.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 22时48分33秒
 ************************************************************************/

import java.util.*;

public class RegularExpressionDemo {
    public static void main(String[] args) {
        String text = "abcdebcadxbc";
        String[] tokens = text.split(".bc");
        for (String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
        tokens = text.split("..cd");
        for (String token : tokens) {
            System.out.print(token + " ");
        }
        System.out.println();
    }
}

