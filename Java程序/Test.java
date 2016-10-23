/*************************************************************************
	> File Name: Test.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月30日 星期五 13时22分09秒
 ************************************************************************/

import java.util.*;

public class Test {
    private String text;
    public Test(String s) {
        text = s;
    }
    public static void main(String[] args) {
        Test test = new Test("ABC");
        System.out.println(test.text.toLowerCase());
    }
}

