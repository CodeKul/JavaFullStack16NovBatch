package multithreading;

public class ThreadForLoop extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" i="+i);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
        for (int j=1;j<=10;j++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+"j "+j);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadForLoop th1 = new ThreadForLoop();
        th1.start();
        th1.setName("TH1");
        ThreadForLoop th2 = new ThreadForLoop();
        th2.start();
        th2.setName("TH2");
    }
}
