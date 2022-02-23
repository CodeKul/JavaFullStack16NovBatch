package multithreading;

//public class WithdrawMoneyApi {
//    double amount = 1000;
//    synchronized void withdrawMoney(double withdraw){
//        if (amount>= withdraw){
//            System.out.println("withdrawal money "+withdraw);
//            amount = amount - withdraw;
//            System.out.println("Amount after withdrawal "+amount);
//        }else {
//            System.out.println("Insufficient Balance,you have " + amount + " in account");
//        }
//    }
//}


public class WithdrawMoneyApi {
    double amount = 1000;
    void withdrawMoney(double withdraw){
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        synchronized (this) {
            if (amount >= withdraw) {
                System.out.println("withdrawal money " + withdraw);
                amount = amount - withdraw;
                System.out.println("Amount after withdrawal " + amount);
            } else {
                System.out.println("Insufficient Balance,you have " + amount + " in account");
            }
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getName());

    }
}


class BankApi extends Thread{
    static private final WithdrawMoneyApi withdrawMoneyApi = new WithdrawMoneyApi();
    double withdraw;

    @Override
    public void run() {
      //  System.out.println(Thread.currentThread().getName());
        withdrawMoneyApi.withdrawMoney(withdraw);
    }

    public static void main(String[] args) throws InterruptedException{
        BankApi aditya = new BankApi();
        aditya.start();
        //aditya.setName("Aditya");
        aditya.withdraw = 700;

        BankApi mahavir = new BankApi();
        mahavir.start();
     //   mahavir.setName("mahavir");
        mahavir.withdraw = 500;

        BankApi vaibhav = new BankApi();
        vaibhav.start();
      //  vaibhav.setName("vaibhav");
        vaibhav.withdraw = 100;
    }
}