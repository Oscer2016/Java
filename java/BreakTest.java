/*************************************************************************
	> File Name: BreakTest.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 10时16分39秒
 ************************************************************************/

import java.util.*;

class BreakClass {
    public void breakMethod() {
        boolean t = true;
        //定义块first,second,third
        first: {
            second: {
                third: {
                    System.out.println("在break之前.");
                    if (t) {
                        break second;
                    }
                    System.out.println("本语句将不被执行.");
                }
                System.out.println("本语句将不被执行.");
            }
            System.out.println("在second块后的语句.");
        }
    }
}

public class BreakTest {
    public static void main(String[] args) {
        (new BreakClass()).breakMethod();
    }
}

