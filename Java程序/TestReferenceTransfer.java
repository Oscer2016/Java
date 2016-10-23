/*************************************************************************
	> File Name: TestReferenceTransfer.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 15时14分41秒
 ************************************************************************/

import java.util.*;

class DataWrap {
    public int a;
    public int b;
}

public class TestReferenceTransfer {

    public static void swap(DataWrap dw) {
        int tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap方法里，a属性的值是 " + dw.a + ", b属性的值是 " + dw.b);
    }

    public static void main(String[] args) {
        DataWrap dw = new DataWrap();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换结束后, a属性的值是 " + dw.a + ", b属性的值是 " + dw.b);
    }
}

