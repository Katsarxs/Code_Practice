// We want to calculate the sum of square of numbers 1 to 500.000.000 with the help of 5 Threads
// So basically we will split the sum in 5 subsums, and we will sum the 5 subsums (Perfect English right there)
class SqrtSumThread extends Thread {
    double subSum = 0;
    private int startNum;
    private int endNum;

    public SqrtSumThread(int startNum, int endNum) {
        this.startNum = startNum;
        this.endNum = endNum;
    }

    @Override
    public void run() {
        for (int i = startNum; i < endNum; i++) {
            subSum += Math.sqrt(i);
         }
    }
}

public class LAB01EX4 {
    public static void main(String[] args) {
        SqrtSumThread subSum1 = new SqrtSumThread(1, 100000000);
        SqrtSumThread subSum2 = new SqrtSumThread(100000000, 200000000);
        SqrtSumThread subSum3 = new SqrtSumThread(200000000, 300000000);
        SqrtSumThread subSum4 = new SqrtSumThread(300000000, 400000000);
        SqrtSumThread subSum5 = new SqrtSumThread(400000000, 500000001);

        subSum1.start();
        subSum2.start();
        subSum3.start();
        subSum4.start();
        subSum5.start();

        try {
            subSum1.join();
            subSum2.join();
            subSum3.join();
            subSum4.join();
            subSum5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(subSum1.subSum + subSum2.subSum + subSum3.subSum + subSum4.subSum + subSum5.subSum);
    }
}