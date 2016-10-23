/*************************************************************************
	> File Name: UsePatternMatcher.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 23时43分47秒
 ************************************************************************/

import java.util.regex.*;

public class UsePatternMatcher {
    public static void main(String[] args) {
        String phones1 = "Justin 的手机号码: 0939-100391\n" + "momor 的手机号码: 0939-666888\n";
        Pattern pattern = Pattern.compile(".*0939-\\d{6}");
        Matcher matcher = pattern.matcher(phones1);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String phones2 = "caterpillar 的手机号码: 0952-600391\n" + "bush 的手机号码: 0939-550391";

        matcher = pattern.matcher(phones2);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

