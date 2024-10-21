public class Main { // Define the Main class
    public static void main(String[] args) { // Main method, entry point of the program
        final byte maxValue = 50; // Define the maximum value (inclusive) for random numbers
        final byte minValue = 20; // Define the minimum value (inclusive) for random numbers
        int maxNumber = 0; // Variable to store the maximum number found
        int[] randomValues = new int[10]; // Array to hold 10 random values

        // Loop to generate 10 random values
        for (int i = 0; i < 10; i++) {
            if (i == 0) { // Check if it's the first iteration
                System.out.print("Numbers: "); // Print the header for the random numbers
            }

            // Generate a random integer between minValue and maxValue (inclusive)
            int randomValue = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;

            // Check if the generated random value is greater than the current maxNumber
            if (randomValue > maxNumber) {
                maxNumber = randomValue; // Update maxNumber to the new maximum value
            }

            randomValues[i] = randomValue; // Store the random value in the array

            System.out.print(randomValues[i] + " "); // Print the current random value
        }

        // Print the maximum number found among the generated random values
        System.out.println("\nMaximum Number: " + maxNumber);
    }
}