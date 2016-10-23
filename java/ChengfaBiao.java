/*************************************************************************
	> File Name: ChengfaBiao.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月05日 星期三 18时48分22秒
 ************************************************************************/

import java.util.*;

class MultiTable {
    public void printTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i*j + "\t");
                if (j == i) {
                    System.out.println();
                }
            }
        }
    }
}

public class ChengfaBiao {
    public static void main(String[] args) {
        (new MultiTable()).printTable();
    }
}

