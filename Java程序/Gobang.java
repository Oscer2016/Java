/*************************************************************************
	> File Name: Gobang.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月05日 星期三 10时50分08秒
 ************************************************************************/

import java.util.*;

public class Gobang {
    //定义一个二维数组来充当棋盘
    private String[][] board;
    //定义棋盘的大小
    private static int BOARD_SIZE = 15;
    public void initBoard() {
        //初始化棋盘数组
        board = new String[BOARD_SIZE][BOARD_SIZE];
        //把每个元素赋为"+"，用于在控制台画出棋盘
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "+";
            }
        }
    }

    //在控制台输出棋盘的方法
    public void printBoard() {
        //打印每个数组元素
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[][] = "+";
            }
        }
    }
    public static void main(String[] args) {

    }
}

