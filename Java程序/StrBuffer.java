/*************************************************************************
	> File Name: StrBuffer.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月30日 星期五 16时08分01秒
 ************************************************************************/

import java.util.*;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Java");
        StringBuffer s2 = new StringBuffer("HTML");
        s1.append(" is fun");
        System.out.println(s1);
        s1.append(s2);
        System.out.println(s1);
        s1.insert(2," is fun");
        System.out.println(s1);
        s1.insert(1,s2);
        System.out.println(s1);
        s1.deleteCharAt(3);
        System.out.println(s1);
        s1.delete(1,3);
        System.out.println(s1);
        s1.replace(1,3,"Computer");
        System.out.println(s1);
    }
}

