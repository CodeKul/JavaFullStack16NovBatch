package multithreading;

public class InterruptDemo extends Thread {

    public static void main(String[] args) {
        InterruptDemo interruptDemo = new InterruptDemo();
        interruptDemo.start();
        interruptDemo.interrupt();
        System.out.println(interruptDemo.isInterrupted());
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
