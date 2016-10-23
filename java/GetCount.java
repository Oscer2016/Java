/*************************************************************************
	> File Name: GetCount.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月05日 星期三 10时08分21秒
 ************************************************************************/

import java.util.*;

class FoldCount {
    public int getCount(double h) {
        int n = 0;
        while (h < 8844.43) {
            h = 2 * h;
            n++;
        }
        return n;
    }
}

public class GetCount {
    public static void main(String[] args) {
        FoldCount obj;
        obj = new FoldCount();
        System.out.println("count = " + obj.getCount(0.01e-3));
    }
}

