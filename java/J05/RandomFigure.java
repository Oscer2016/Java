/*************************************************************************
	> File Name: RandomFigure.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月29日 星期四 23时26分29秒
 ************************************************************************/

import java.util.*;

public class RandomFigure {
    public static void main(String[] args) {
        Random rd = new Random(1000);
        for (int i=1; i<51; i++) {
            int in = rd.nextInt(101);
            System.out.print(in + " ");
        }
    }
}

