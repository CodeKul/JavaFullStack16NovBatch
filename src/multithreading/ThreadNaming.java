package multithreading;

public class ThreadNaming extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
       // System.out.println("running");

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
     //   Thread.currentThread().setName("App1");
        ThreadNaming nm = new ThreadNaming();
        nm.start();
        nm.setName("Codekul");
        System.out.println(Thread.currentThread().getName());
    }
}
