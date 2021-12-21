package Test20Dec;

import java.util.Scanner;

public class AccountImpl {
    public static void main(String[] args) {
        int ch;
        Account  account = new Account();
        account.addAccount();
        do {
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("Enter your choice");
            Scanner scanner = new Scanner(System.in);
            ch = scanner.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter the amount you want to withdraw: ");
                    double amt = scanner.nextDouble();
                    account.withdraw(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit: ");
                    amt = scanner.nextDouble();
                    account.deposit(amt);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    System.exit(0);
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }while (ch<5);
    }
}
