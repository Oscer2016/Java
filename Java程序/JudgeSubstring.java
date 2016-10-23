/*************************************************************************
	> File Name: JudgeSubstring.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月28日 星期三 22时55分49秒
 ************************************************************************/

import javax.swing.JOptionPane;

public class JudgeSubstring {
    public static void main(String[] args) {
        String first = JOptionPane.showInputDialog(null,"请输入第一个字符串:","SubstrJudge",JOptionPane.QUESTION_MESSAGE);
        String second = JOptionPane.showInputDialog(null,"请输入第二个字符串:","SubstrJudge",JOptionPane.QUESTION_MESSAGE);
        if (isSubstring(first,second)) {
            System.out.println(first + " is a substring of" + second);
        } else {
            System.out.println("first" + "is substring of" + second);
        }
    }
    public static boolean isSubstring(String first, String second) {
        int remainingLength = second.length();
        int startingIndex = 0;
        towhile: while (first.length() <= remainingLength) {
            for (int i=0; i<first.length(); i++) {
                if (first.charAt(i) != second.charAt(startingIndex + i)) {
                    startingIndex++;
                    remainingLength--;
                    continue towhile;
                }
            }
            return true;
        }
        return false;
    }
}

