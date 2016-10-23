/*************************************************************************
	> File Name: StringSort.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月29日 星期四 22时52分05秒
 ************************************************************************/

import java.util.*;

class StrSort {
    public static String sort(String s) {
        char[] str = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str[i] < str[j]) {
                    char t = str[i];
                    str[i] = str[j];
                    str[j] = t;
                }
            }
        }
        return String.valueOf(str);
    }
}

public class StringSort {
    public static void main(String[] args) {
		System.out.print("Please input a string: ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
        System.out.println("排序后的字符串: " + StrSort.sort(a));
    }
}

