/*************************************************************************
	> File Name: PrintDate.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月29日 星期四 20时36分49秒
 ************************************************************************/

import java.util.*;

public class PrintDate {
    public static void main(String[] args) {
        GregorianCalendar date = new GregorianCalendar();
        int year1 = date.get(GregorianCalendar.YEAR);
        int month1 = date.get(GregorianCalendar.MONTH);
        int day1 = date.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("当前日期: " + year1 + "年" + month1 + "月" + day1 + "日");
        date.setTimeInMillis(1234567898765L);
        int year2 = date.get(GregorianCalendar.YEAR);
        int month2 = date.get(GregorianCalendar.MONTH);
        int day2 = date.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("特定日期: " + year2 + "年" + month2 + "月" + day2 + "日");
    }
}

