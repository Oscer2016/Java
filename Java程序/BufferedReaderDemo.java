/*************************************************************************
	> File Name: BufferedReaderDemo.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月24日 星期六 14时52分15秒
 ************************************************************************/

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入一列文字, 可包括空白: ");
        String text = bufferedReader.readLine();
        System.out.println("您输入的文字: " + text);
    }
}

