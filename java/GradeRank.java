/*************************************************************************
	> File Name: GradeRank.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年09月16日 星期五 10时55分10秒
 ************************************************************************/

import java.util.*;

public class GradeRank {
    public static void main(String[] args) {
        (new Grade()).toGrade();
    }
}

class Grade {
    public void toGrade() {
        int score, m;
        Scanner reader = new Scanner(System.in);
        System.out.print("Please input grade: ");
        score = reader.nextInt();
        if (score<0 || score >100) {
            System.out.println("input error.");
        } else {
            m = score / 10;
            switch(m) {
            case 9:
            case 10: System.out.println("The grade is A."); break;
            case 8: System.out.println("The grade is B."); break;
            case 7: System.out.println("The grade is C."); break;
            case 6: System.out.println("The grade is D."); break;
            default: System.out.println("The grade is E."); break;
            }
        }
    }
}
