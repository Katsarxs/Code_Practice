class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }

    @Override
    public void run() {
        System.out.println("Starting > " + getName());
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + getName() + " Loop " + i);

            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finished > " + getName());
    }
}

public class LAB01EX1 {
    public static void main(String[] args) {
        new SimpleThread("Thread 1").start();
        new SimpleThread("Thread 2").start();
        System.out.println("Example Text");
    }
}