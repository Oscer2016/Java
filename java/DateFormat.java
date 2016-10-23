/*************************************************************************
	> File Name: DateFormat.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月24日 星期六 19时28分39秒
 ************************************************************************/

import java.util.*;
import java.text.*;

public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        
        DateFormat shortDateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat longDateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);

        System.out.println(shortDateFormat.format(date));
        System.out.println(mediumDateFormat.format(date));
        System.out.println(longDateFormat.format(date));
        System.out.println(fullDateFormat.format(date));
    }
}

