/*************************************************************************
	> File Name: DataRange.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月25日 星期日 10时11分48秒
 ************************************************************************/

import java.util.*;

public class DataRange {
    public static void main(String[] args) {
        System.out.printf("short \t数值范围: %d ~ %d\n",Short.MAX_VALUE,Short.MIN_VALUE);
        System.out.printf("int \t数值范围: %d ~ %d\n",Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.printf("long \t数值范围: %d ~ %d\n",Long.MAX_VALUE,Long.MIN_VALUE);
        System.out.printf("byte \t数值范围: %d ~ %d\n",Byte.MAX_VALUE,Byte.MIN_VALUE);
        System.out.printf("float \t数值范围: %e ~ %e\n",Float.MAX_VALUE,Float.MIN_VALUE);
        System.out.printf("double \t数值范围: %e ~ %e\n",Double.MAX_VALUE,Double.MIN_VALUE);
    }
}

