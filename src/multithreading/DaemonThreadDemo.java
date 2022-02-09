package multithreading;

public class DaemonThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Current Executing Thread "+Thread.currentThread().getName());
        if (Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread");
        }else {
            System.out.println("User Thread");
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Method");
        DaemonThreadDemo demo1 = new DaemonThreadDemo();

        try {
            demo1.start();
            demo1.setDaemon(true);
        }
        catch (IllegalThreadStateException e){
            System.out.println("IllegalThreadStateException occurs when we set thread as daemon");
        }
        System.out.println("After Exception");
        DaemonThreadDemo demo2 = new DaemonThreadDemo();
        demo2.start();
    }
}
