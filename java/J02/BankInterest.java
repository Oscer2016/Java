import java.util.*;

class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreate;

    public Date getDateCreate() {
        return dateCreate;
    }

    public Account(){
    }

    public Account(int id, double balance){
        Date date = new Date();
        this.dateCreate = Date.from(date.toInstant());
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public void withDraw(double balance){
        this.balance -= balance;
    }

    public void deposit(double balance){
        this.balance += balance;
    }
}

public class BankInterest {
    public static void main(String[] args){
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(0.045);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("Balance :" + account.getBalance());
        System.out.printf("MonthlyInterest: %.2f\n",account.getMonthlyInterestRate() * account.getBalance());
        System.out.println("Date : " + account.getDateCreate());
    }
}


