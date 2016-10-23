/*************************************************************************
	> File Name: FileFilter.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 20时35分26秒
 ************************************************************************/

import java.util.*;

public class FileFilter {
    public static void main(String[] args) {
        String[] filenames = {"caterpillar.jpg","cater.gif","bush.jpg"};
        System.out.print("过滤出jpg文件: ");
        for (int i = 0; i < filenames.length; i++) {
            if (filenames[i].endsWith("jpg")) {
                System.out.print(filenames[i] + " ");
            }
        }
        System.out.println();
    }
}

