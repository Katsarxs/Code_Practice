// We create a list with 500 integers (number is ascending +1 from the desired start number)
// and we find the square of every number in the list with 500 threads
class MyThread extends Thread {
    private int[] list;
    private int index;
    public MyThread(int[] list, int index) {
        this.list = list;
        this.index = index;
    }
    @Override
    public void run() {
        list[index] = list[index] * list[index];
    }
}

public class LAB01EX5 {
    final static int NUMBER = 500;
    static int[] listMaker(int startNum) {
        int[] list = new int[NUMBER];
        for (int i = 0; i < NUMBER; i++) {
            list[i] = startNum;
            startNum += 1;
        }
        return list;
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread threads[] = new MyThread[NUMBER];
        int[] list =  listMaker(5); // We set the start number here (example: 5)
        for (int i = 0; i < NUMBER; i++) {
            threads[i] = new MyThread(list, i);
            threads[i].start();
        }
        for (int i = 0; i < NUMBER; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
