/*************************************************************************
	> File Name: JudgeInteger.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月18日 星期日 07时55分07秒
 ************************************************************************/

import java.util.*;

class MyInteger {
    int value;
    String value1;
    
    MyInteger (int value) {
        this.value = value;
    }

    MyInteger (String value1) {
        this.value1 = value1;
    }

    int getInteger () {
        return value;
    }

    boolean isEven() {
        return value%2 == 0 ? true : false;
    }

    boolean isOdd() {
        return value%2 != 0 ? true : false;
    }

    boolean isPrime() {
        int i;
        for (i=2; i<value; i++) {
            if (value % i == 0) {
                break;
            }
        }
        return value == i ? true : false;
    }

    boolean isEven(int value) {
        this.value = value;
        return value%2 == 0 ? true : false;
    }

    boolean isOdd(int value) {
        this.value = value;
        return value%2 != 0 ? true : false;
    }

    boolean isPrime(int value) {
        int i;
        this.value = value;
        
        for (i=2; i<value; i++) {
            if (value % i == 0) {
                break;
            }
        }

        return value == i ? true : false;
    }

    boolean isEven(MyInteger value) {
        return value.isEven();
    }

    boolean isOdd(MyInteger value) {
        return value.isOdd();
    }

    boolean isPrime(MyInteger value) {
        return value.isPrime();
    }
    
    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger value) {
        return value.equals(this.value);
    }

    public int parseInt(char[] cs) {
        String s = new String(cs);
        return parseInt(s);
    }

    public int parseInt(String s) {
        return Integer.valueOf(s);
    }
}

public class JudgeInteger {
    public static void main(String[] args) {
        MyInteger myinteger = new MyInteger(4);
        if (myinteger.isEven()) {
            System.out.println(myinteger.value + " is even.");
        }
        if (myinteger.isOdd()) {
            System.out.println(myinteger.value + " is odd.");
        }
        if (myinteger.isPrime()) {
            System.out.println(myinteger.value + " is prime.");
        }
        if (myinteger.isEven(11)) {
            System.out.println(myinteger.value + " is even.");
        }
        if (myinteger.isOdd(11)) {
            System.out.println(myinteger.value + " is odd.");
        }
        if (myinteger.isPrime(11)) {
            System.out.println(myinteger.value + " is prime.");
        }
        if (myinteger.equals(12)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
        System.out.println(myinteger.parseInt("1024"));
    }
}

