package multithreading;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority1 priority1 = new ThreadPriority1();
        priority1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(priority1.getPriority());

        ThreadPriority2  priority2 = new ThreadPriority2();
        priority2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(priority2.getPriority());

        priority1.start();
        priority2.start();
        System.out.println("Current "+Thread.currentThread().getPriority());
    }
}

class ThreadPriority1 extends Thread{
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Hi");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadPriority2 extends Thread{
    public void run() {
        for (int i = 1; i <= 3; i++) {

            try {
                Thread.sleep(1000);
                System.out.println("Hello");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}