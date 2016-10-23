/*************************************************************************
	> File Name: StringDemo.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月25日 星期日 16时40分27秒
 ************************************************************************/

import java.util.*;

public class StringDemo {
    public static void main(String[] args) {
        String text = "Have a nice day!! :)";
        System.out.println("原文: " + text);
        //返回全为大写的字符串内容
        System.out.println("大写: " + text.toUpperCase());
        //返回全为小写的字符串内容
        System.out.println("小写: " + text.toLowerCase());
        //计算字符串长度
        System.out.println("长度: " + text.length());
        //返回取代文字后的字符串
        System.out.println("取代: " + text.replaceAll("nice","good"));
        //返回指定位置后的子字符串
        System.out.println("子字符串: " + text.substring(5));
    }
}

