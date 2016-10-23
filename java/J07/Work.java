/*************************************************************************
	> File Name: Work.java
	> Author: hp
	> Mail: hepan@xiyoulinux.org
	> Created Time: 2016年10月21日 星期五 07时45分58秒
 ************************************************************************/

import java.util.*;

public class Work {
    public static void main(String agrs[]){
        Staff staff = new Staff();
        System.out.println(staff.toString());
    }
}

class Person{
    protected String name;
    private double height;
    private double weight;
    private String sex;

    public Person(){
        name = "Alex";
        height = 175;
        weight = 60;
        sex = "male";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSex(){
        return sex;
    }

    public void setSex(String sex){
        this.sex = sex;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String toString(){
        return "Name: " + name + "\nSex: " + sex + "\nHeight: " + height + "\nWeight: " + weight;
    }
}

class Student extends Person{
    private int grade;

    public Student(){
        super();
        grade = 3;
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public String toString(){
        return super.toString() + "\nGrade: " + grade;
    }
}

class Employee extends Person{
    private String address;
    private String tel;
    private String email;

    public Employee(){
        super();
        address = "New York";
        tel = "15924252627";
        email = "tenda@gmail.com";
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getTel(){
        return tel;
    }

    public void setTel(String tel){
        this.tel = tel;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String toString(){
        return super.toString() + "\nAddress: " + address + "\nTel: " + tel + "\nEmail: " + email;
    }
}

class Faculty extends Employee{
    private double salary;
    private String office;
    private String startTime;

    public Faculty(){
        super();
        salary = 90;
        office = "google";
        startTime = "2016.9.6";
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getTime(){
        return startTime;
    }

    public void setTime(String startTime){
        this.startTime = startTime;
    }


    public String toString(){
        return super.toString() + "\nSalary: " + salary + "\nOffice: " + office + "\nTime: " + startTime;
    }

}

class Staff extends Employee{
    private double salary;
    private String office;
    private String startTime;
    private String duty;

    public Staff(){
        super();
        salary = 70;
        office = "microsoft";
        startTime = "2016.10.1";
        duty = "worker";
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public String getOffice(){
        return office;
    }

    public void setOffice(String office){
        this.office = office;
    }

    public String getTime(){
        return startTime;
    }

    public void setTime(String startTime){
        this.startTime = startTime;
    }

    public String getDuty(){
        return duty;
    }

    public void setDuty(String duty){
        this.duty = duty;
    }

    public String toString(){
        return super.toString() + "\nSalary: " + salary + "\nOffice: " + office + "\nTime: " + startTime + "\nDuty: " + duty;
    }
}
