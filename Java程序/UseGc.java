/*************************************************************************
	> File Name: UseGc.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月07日 星期五 17时08分35秒
 ************************************************************************/

import java.util.*;

public class UseGc {
    public static void main(String[] args) {
        System.out.println("请按Ctrl+C终止程序......");

        GcTest obj1 = new GcTest("object1");
        GcTest obj2 = new GcTest("object2");
        GcTest obj3 = new GcTest("object3");

        //命令名称不参考至对象
        obj1 = null;
        obj2 = null;
        obj3 = null;

        //建议回收对象
        System.gc();

        //不断的执行程序
        while (true) ;
    }
}

class GcTest {
    private String name;

    public GcTest(String name) {
        this.name = name;
        System.out.println(name + "建立");
    }

    //对象回收前执行
    protected void finalize() {
        System.out.println(name + "被回收");
    }
}
