/*************************************************************************
	> File Name: SplitStringDemo.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 22时26分23秒
 ************************************************************************/

import java.util.*;

public class SplitStringDemo {
    public static void main(String[] args) {
        String[] fakeFileData = {"justin\t64/5/26\t0939002302\t5433343","momor\t68/7/23\t0939100391\t5432343"};
        for (String data : fakeFileData) {
            String[] tokens = data.split("\t");
            for (String token : tokens) {
                System.out.print(token + "\t| ");
            }
            System.out.println();
        }
    }
}

