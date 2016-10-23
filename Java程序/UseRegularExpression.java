/*************************************************************************
	> File Name: UseRegularExpression.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月06日 星期四 23时16分49秒
 ************************************************************************/

import java.util.*;
import java.io.*;

public class UseRegularExpression {
    public static void main(String[] args) throws IOException {
        
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("abcdefgabcabc".replaceAll(".bc","###"));
        String phoneEL = "[0-9]{4}-[0-9]{6}";
        String urlEL = "<a.+href*=*['\"]?.*?['\"]?.*?>";
        String emailEL = "^[_a-z0-9-]+(.[_a-z0-9-]+)*" + "@[a-z0-9-]+([.][a-z0-9-]+)*$";

        System.out.print("请输入手机号: ");
        String input = reader.readLine();

        if (input.matches(phoneEL)) {
            System.out.println("格式正确");
        } else {
            System.out.println("格式错误");
        }

        System.out.print("输入href标签: ");
        input = reader.readLine();

        //验证href标签
        if (input.matches(urlEL)) {
            System.out.println("格式正确");
        } else {
            System.out.println("格式错误");
        }

        System.out.print("输入电子邮件: ");
        input = reader.readLine();

        //验证电子邮件格式
        if (input.matches(emailEL)) {
            System.out.println("格式正确");
        } else {
            System.out.println("格式错误");
        }
    }
}

