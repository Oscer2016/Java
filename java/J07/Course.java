/*************************************************************************
	> File Name: Course.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月20日 星期四 11时31分58秒
 ************************************************************************/
import java.util.Scanner;

class Info {
    private int numberOfStudents;
    private String courseName;
    java.util.ArrayList stu = new java.util.ArrayList();

    public Info(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        stu.add(student);
        numberOfStudents++;
    }
    public String getStudents() {
        return stu.toString();
    }
    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String getCourseName() {
        return courseName;
    }
}

public class Course{
    public static void main(String[] args) {
        Info info = new Info("computer");
        Scanner input = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            String s = input.nextLine();
            info.addStudent(s);
        }

        System.out.println("Course name: " + info.getCourseName());
        System.out.println("Students: " + info.getNumberOfStudents());
        System.out.println(info.getStudents());
    }
}

