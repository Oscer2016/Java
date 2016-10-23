/*************************************************************************
	> File Name: CalculateTime.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月22日 星期四 19时39分46秒
 ************************************************************************/

import java.util.*;

class Test {
    public static int getIndex() {
        Random rd = new Random();
        int index = rd.nextInt(99999);
        return index;
    }
    public static int linearSearch(int[] list, int key) {
        for (int i=0; i<list.length; i++) {
            if (key == list[i]) {
                return i;
            }
        }
        return -1;
    }
}

public class CalculateTime {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] list = new int[100000];
        for (int i=0; i<100000; i++) {
            list[i] = rd.nextInt();
        }
        int index = list[Test.getIndex()];
        
        long startTime1 = System.nanoTime();
        int x1 = Test.linearSearch(list,index);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;
        if (x1 >= 0) {
            System.out.println("use linearSearch find with " + executionTime1 + "ns");
        }
        Arrays.sort(list);
        long startTime2 = System.nanoTime();
        int x2 = Arrays.binarySearch(list,index);
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        if (x2 >= 0) {
            System.out.println("use binarySearch find with " + executionTime2 + "ns");
        }
    }
}

