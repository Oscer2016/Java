/*************************************************************************
	> File Name: QueueTest.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月25日 星期日 21时12分57秒
 ************************************************************************/

import java.util.*;

class Queue {
    private int maxSize = 100;
    private Integer[] data;
    private int front;
    private int rear;
    public Queue() {
        data = new Integer[maxSize];
        front = rear = 0;
    }
    public Queue(int maxSize) {
        if (maxSize < this.maxSize) {
            maxSize = this.maxSize;
        }
        data = new Integer[maxSize];
        front = rear = 0;
    }
    //判定队空
    public boolean empty() {
        return front == rear ? true : false;
    }
    //求队长
    public int length() {
        return (rear-front+maxSize)%maxSize;
    }
    //入队，添加元素
    public boolean add(Integer e) {
        if ((rear+1)%maxSize == front) {
            return false;
        }
        data[rear] = e;     //在队尾入队
        rear = (rear+1)%maxSize;
        return true;
    }
    //出队，移除元素
    public Integer remove() {
        if (rear == front) {
            return null;
        } 
        Integer e = data[front];    //在队头移除
        front = (front+1)%maxSize;
        return e;
    }
}

public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(3);
        queue.add(5);
        System.out.println("length = "+queue.length());
        //队列非空时，出队
        while (!queue.empty()) {
            System.out.println(queue.remove());
        }
    }
}

