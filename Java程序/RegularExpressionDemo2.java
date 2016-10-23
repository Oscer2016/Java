/*************************************************************************
	> File Name: RegularExpressionDemo2.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 23时52分36秒
 ************************************************************************/

import java.util.regex.*;

public class RegularExpressionDemo2 {
    public static void main(String[] args) {
        String text = "abcdebcadxbc";
        Pattern pattern = Pattern.compile(".bc");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        System.out.println();
    }
}

