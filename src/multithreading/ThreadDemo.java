package multithreading;

public class ThreadDemo extends Thread {
    public void run(){
        System.out.println("Thread " + Thread.currentThread().getName() +" "+Thread.currentThread().getId());
    }
    public static void main(String[] args) {
       ThreadDemo t1 = new ThreadDemo();
       ThreadDemo t2 = new ThreadDemo();
       ThreadDemo t3 = new ThreadDemo();
       ThreadDemo t4 = new ThreadDemo();
       t1.start();
       t2.start();
       t3.start();
       t4.start();
    }
}
