package Test20Dec;

public class Account {
    private long accountNo;
    private String username;
    private String accountType;
    private double balance;
    private static String bankName;

    void addAccount(){
        accountNo = 22132;
        username = "Madhuri";
        accountType = "Saving";
        balance = 15000;
        bankName = "SBI";
    }

    void withdraw(double amt){
        if (balance>=amt) {
            balance = balance - amt;
            System.out.println("Balance after withdrawal: " + balance);
        }else {
            System.out.println("Insufficient Amount");
        }
    }

    void deposit(double amt){
        balance = balance + amt;
        System.out.println("in deposit "+balance);
    }

    void display(){
        System.out.println("*****************Details**********************");
        System.out.println("Account No:"+accountNo);
        System.out.println("Bank Name:"+bankName);
    }


}
