/*************************************************************************
	> File Name: OutputChar.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月05日 星期三 10时32分02秒
 ************************************************************************/

import java.io.*;

class CharIO {
    public void acceptChar() throws IOException {
        char ch;
        System.out.print("请输入字符(按Enter结束): ");
        do {
            ch = (char)System.in.read();    //接收键盘输入
            System.out.print(ch + " ");
        } while (ch != '\n');
    }
}

public class OutputChar {
    public static void main(String[] args) throws IOException {
        (new CharIO()).acceptChar();
    }
}

