package multithreading;

public class BusTicket extends Thread{
    int totalAmount = 0;
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            totalAmount = totalAmount + 1000;
        }
        this.notify();
    }
}
class BusTicketThread {
    public static void main(String[] args) throws InterruptedException {
        BusTicket busTicket = new BusTicket();
        busTicket.start();
        synchronized (busTicket){
            busTicket.wait();
            System.out.println(busTicket.totalAmount);
        }
    }
}

