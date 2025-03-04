class SimpleRunnable implements Runnable {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("Start > " + t.getName());
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + t.getName() + " Loop " + i);

            try {
                t.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finished > " + t.getName());
    }
}

public class LAB01EX2 {
    public static void main(String[] args) {
        new Thread(new SimpleRunnable(), "Thread 1").start();
        new Thread(new SimpleRunnable(), "Thread 2").start();
    }
}
