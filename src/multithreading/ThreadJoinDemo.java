package multithreading;

public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 demo1 = new ThreadDemo1();
        demo1.start();
        demo1.join();
        ThreadDemo2 demo2 = new ThreadDemo2();
        Thread thread = new Thread(demo2);
        thread.start();
        thread.join();
        System.out.println("Bye");
    }
}

class ThreadDemo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadDemo2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}