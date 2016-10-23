/*************************************************************************
	> File Name: DisplayDate.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月29日 星期四 19时35分13秒
 ************************************************************************/

import java.util.Date;
import java.text.SimpleDateFormat;

class toString {
    public toString(long s) {
        Date date = new Date(s);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = format.format(date);
        System.out.println(str);
    } 
}

public class DisplayDate {
    public static void main(String[] args) {
        toString str1 = new toString(10000);
        toString str2 = new toString(100000);
        toString str3 = new toString(1000000);
        toString str4 = new toString(10000000);
        toString str5 = new toString(100000000);
        toString str6 = new toString(1000000000);
        toString str7 = new toString(10000000000L);
        toString str8 = new toString(100000000000L);
    }
}

