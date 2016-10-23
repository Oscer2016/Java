/*************************************************************************
	> File Name: StackTest.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月25日 星期日 20时05分03秒
 ************************************************************************/

import java.util.*;

class Stack {
    private Integer[] data;
    private int top;
    private int size = 50;

    public Stack() {
        this.data = new Integer[this.size];
        top = 0;
    }

    public boolean empty() {
        return top>0?false:true;
    }

    public boolean push(Integer e) {
        if (this.top > this.size) {
            return false;
        }
        this.data[top++] = e;
        return true;
    }

    public Integer pop() {
        if (top == 0) {
            return null;
        } 
        return this.data[--top];
    }

    public Integer getTop() {
        if (top == 0) {
            return null;
        }
        return this.data[top-1];
    }
}

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(3);
        s.push(5);
        int t = s.getTop();
        System.out.println("getTop: " + t);
        System.out.println("POP: ");
        while (!s.empty()) {
            System.out.println(s.pop());
        }
    }
}

