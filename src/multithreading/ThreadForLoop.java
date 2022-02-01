package multithreading;

public class ThreadForLoop extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" i="+i);
        }
        for (int j=1;j<=10;j++){
            System.out.println(Thread.currentThread().getName()+"j "+j);
        }
    }

    public static void main(String[] args) {
        ThreadForLoop th1 = new ThreadForLoop();
        th1.start();
    }
}
