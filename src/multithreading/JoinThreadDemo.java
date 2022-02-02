package multithreading;

public class JoinThreadDemo extends Thread {
    int counter = 1;

    JoinThreadDemo() {
        System.out.println("Thread is Created");
    }

    JoinThreadDemo(int counter) {
        this.counter = counter;
    }


    @Override
    public void run() {

        while (counter <= 5) {
            try {
                if (counter == 3)
                    Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " i " + counter);
                counter++;
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinThreadDemo th1 = new JoinThreadDemo();
        th1.start();
        th1.setName("TH1");
        JoinThreadDemo th2 = new JoinThreadDemo();
        th2.start();
        th2.setName("TH2");
        th2.join();
    }

}
