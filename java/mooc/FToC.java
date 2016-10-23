/*************************************************************************
	> File Name: FToC.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月11日 星期日 08时35分30秒
 ************************************************************************/
import java.util.*;

public class FToC {
    public static void main(String[] args) {
        int f;
        double x;
        Scanner input = new Scanner(System.in);
        f = input.nextInt();
        x = (f-32)*(5.0/9);
        System.out.println((int)x);
    }
}

