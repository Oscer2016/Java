/*************************************************************************
	> File Name: PrintUpperNumber.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月29日 星期四 23时40分29秒
 ************************************************************************/

import java.util.*;

public class PrintUpperNumber {
    public static void main(String[] args) {
		System.out.print("Please input a string: ");
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		int n = 0;
		for(int i = 0; i < a.length(); i++){
			char c = a.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				n++;
			}
		}
        System.out.println("大写字母有 " + n + " 个.");
    }
}

