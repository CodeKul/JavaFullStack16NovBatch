package multithreading;

public class RunnableDemo  implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() +" "+Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        RunnableDemo demo = new RunnableDemo();
        Thread th1 = new Thread(demo);
        Thread th2 = new Thread(demo);
        th1.start();
        th2.start();

    }
}
