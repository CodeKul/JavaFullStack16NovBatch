package multithreading;
//wait(),notify()
public class BusTicket extends Thread{
    int totalAmount = 0;
    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName());

            for (int i = 0; i < 10; i++) {
                totalAmount = totalAmount + 1000;
            }
            this.notify();
        }
    }
}
class BusTicketThread {
    public static void main(String[] args) {
        BusTicket busTicket = new BusTicket();
        busTicket.start();
        System.out.println(Thread.currentThread().getName());

        try {
            synchronized (busTicket) {
                busTicket.wait();
                System.out.println(busTicket.totalAmount);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

