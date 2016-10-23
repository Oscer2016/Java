/*************************************************************************
	> File Name: TestInterface.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月23日 星期日 12时57分11秒
 ************************************************************************/

import java.util.*;

interface Shout {
    void shoutSound();
}

//接口的实现
class Dog implements Shout {
    //接口中抽象方法的具体实现，必须指定public
    public void shoutSound() {
        System.out.println("狗的叫声是: 汪汪.");
    }
}

class Cat implements Shout {
    public void shoutSound() {
        System.out.println("猫的叫声是: 喵喵.");
    }
}

class Sheep implements Shout {
    public void shoutSound() {
        System.out.println("羊的叫声是: 咩咩.");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        new Dog().shoutSound();
        new Cat().shoutSound();
        new Sheep().shoutSound();
    }
}

