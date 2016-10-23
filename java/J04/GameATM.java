import java.util.*;

class Account{
    private int id;
    private double balance;

    public Account(int id, double balance){
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

    public void withDraw(double balance){
        this.balance -= balance;
    }

    public void deposit(double balance){
        this.balance += balance;
    }
}

public class GameATM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Account[] account = new Account[100];

        for (int i=0; i<10; i++) {
            account[i] = new Account(i,100);
        }

        while (true) {
            int i, c;
            System.out.print("Enter an id: ");
            int id = input.nextInt();
            for (i=0; i<account.length; i++) {
                if (id == account[i].getId()) {
                    System.out.println("Main menu");
                    System.out.println("1: check balance");
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");
                    System.out.print("Enter a choice: ");
                    break;
                }
            }
            c = input.nextInt();
            switch (c) {
            case 1:
                System.out.println("the balance is " + account[i].getBalance());
                break;
            case 2:
                System.out.print("Enter an amount to withdraw: ");
                int withdraw = input.nextInt();
                account[i].withDraw(withdraw);
                break;
            case 3:
                System.out.print("Enter an amount to deposit: ");
                int deposit = input.nextInt();
                account[i].deposit(deposit);
                break;
            case 4:
                continue;
            default:
                break;
            }
        }
    }
}


