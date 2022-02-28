package multithreading;

public class DeadlockDemo {
    public static void main(String[] args) {
        final String resource1 = "Codekul";
        final String resource2 = "NextTech";

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1:locked Resource 1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1:locked resource 2");
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2:locked Resource 2");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1) {
                        System.out.println("Thread 2:locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
