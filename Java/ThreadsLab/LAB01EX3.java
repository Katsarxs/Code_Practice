class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Started > " + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " Loop " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread Finished > " + Thread.currentThread().getName());
    }
}

public class LAB01EX3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");

        t1.start();
        //t2.start();
        //t3.start();

        try {
            t1.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        t2.start();

        try {
            t2.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        t3.start();
    }
}
