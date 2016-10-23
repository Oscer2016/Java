/*************************************************************************
	> File Name: DataTypeTransfer.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月14日 星期五 20时20分32秒
 ************************************************************************/

import java.util.*;

public class DataTypeTransfer {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("11",2));
        System.out.println(Integer.parseInt("12",8));
        System.out.println(Integer.parseInt("13"));
        System.out.println(Integer.parseInt("1A",16));
        
        System.out.println(Byte.parseByte("11",2));
        System.out.println(Byte.parseByte("11"));
        
        System.out.println(Short.parseShort("11",2));
        System.out.println(Short.parseShort("11"));
        
        System.out.println(Long.parseLong("11",2));
        System.out.println(Long.parseLong("11"));
        
        //System.out.println(Float.parseFloat("11",2));         //error
        System.out.println(Float.parseFloat("11"));
        
        //System.out.println(Double.parseDouble("11",8));       //error
        System.out.println(Double.parseDouble("11"));
        
        System.out.println(Integer.parseInt("12",2));           //raise a runtime exception
    }
}

