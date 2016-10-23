/*************************************************************************
	> File Name: CommonPrefix.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月13日 星期四 20时22分01秒
 ************************************************************************/

import java.util.*;

class StrPrefix {
    public static String prefix(String s1, String s2) {
        String str = "";
		char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        for (int i = 0; i < s1.length(); i++) {
            if (str1[i] == str2[i]) {
                str += str1[i];
            } else {
                break;
            }
        }
        return str;
    }
}

public class CommonPrefix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input two strings: ");
        String s1 = input.next();
        String s2 = input.next();
        System.out.println(StrPrefix.prefix(s1,s2));
    }
}

