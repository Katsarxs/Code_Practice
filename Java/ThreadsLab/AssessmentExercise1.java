// We will use the Sieve Of Eratosthenes algorithm.
// First part without thread and the second part
// with 4 threads.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Class Thread with the Sieve Of Eratosthenes
class SieveOfEratosthenesThread extends Thread {
    private int start, end, limit;
    private boolean[] prime;

    // Constructor for thread creation
    public SieveOfEratosthenesThread(int start, int end, boolean[] prime, int limit) {
        this.start = start;
        this.end = end;
        this.prime = prime;
        this.limit = limit;
    }

    @Override
    public void run() {
        // The Sieve of Eratosthenes in action for one thread
        for (int p = 2; p * p <= limit; p++) {
            if (prime[p]) {
                int startMultiple = Math.max(p * p, (start + p - 1) / p * p);
                for (int i = startMultiple; i <= end; i += p){
                    prime[i] = false;
                }
            }
        }
    }
}

public class AssessmentExercise1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        // Taking the Limit
        int limit = scanner.nextInt();
        // Starting sequential execution prompt
        System.out.println("Starting sequential execution...");

        // ==================== CODE FOR SEQUENTIAL EXECUTION ====================

        // Start timestamp for sequential execution
        long tStart = System.currentTimeMillis();

        List<Integer> primes = new ArrayList<>();
        int numberOfPairs = 0;
        boolean prime[] = new boolean[limit + 1];
        Arrays.fill(prime, true);

        // Sieve of Eratosthenes for sequential execution from the start (2) to the limit
        for (int p = 2; p * p <= limit; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    prime[i] = false;
                }
            }
        }
        for (int i = 2; i <= limit; i++) {
            if (prime[i]) {
                primes.add(i);
            }
        }

        // Counter for the prime pairs in sequential execution
        for (int i = 0; i < primes.size() - 1; i++) {
            if (primes.get(i + 1) - primes.get(i) == 2) {
                numberOfPairs += 1;
            }
        }

        // End timestamp for sequential execution
        long tEnd = System.currentTimeMillis();

        // Print results sequential
        System.out.println("Sequential execution for limit " + limit + ":");
        System.out.println("- Time: " + (tEnd - tStart) + " ms"); // Time needed
        System.out.println("- Number of twin primes pairs: " + numberOfPairs); // Number of Pairs

        // Starting parallel execution prompt
        System.out.println("Starting parallel execution...");

        // ==================== CODE FOR PARALLEL EXECUTION ====================

        // Start timestamp for parallel execution
        tStart = System.currentTimeMillis();

        // Resetting the number of pairs
        numberOfPairs = 0;

        SieveOfEratosthenesThread[] threads = new SieveOfEratosthenesThread[4];
        int rangeSize = limit / 4;

        // Splitting in 4 threads
        for (int i = 0; i < 4; i++) {
            final int start = i * rangeSize + 2;
            final int end = (i == 3) ? limit : (start + rangeSize - 1);
            threads[i] = new SieveOfEratosthenesThread(start, end, prime, limit);

            // Starting each thread
            threads[i].start();
        }

        // Waiting each thread to finish
        for (SieveOfEratosthenesThread t : threads) {
            t.join();
        }

        // Counter for the prime pairs in parallel execution
        for (int i = 2; i <= limit - 2; i++) {
            if (prime[i] && prime[i + 2]) {
                numberOfPairs++;
            }
        }

        // End timestamp for parallel execution
        tEnd = System.currentTimeMillis();

        // Print results parallel
        System.out.println("Parallel execution for limit " + limit + ":");
        System.out.println("- Time: " + (tEnd - tStart) + " ms"); // Time needed
        System.out.println("- Number of twin primes pairs: " + numberOfPairs); // Number of Pairs
        scanner.close();
    }
}