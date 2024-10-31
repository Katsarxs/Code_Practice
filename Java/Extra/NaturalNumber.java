class NaturalNumber { // Define the NaturalNumber class
    private Classification result; // Declare a private variable to store the classification result

    NaturalNumber(int number) { // Constructor that takes a natural number as an argument
        if (number <= 0) { // Check if the number is non-positive
            throw new IllegalArgumentException("You must supply a natural number (positive integer)"); // Throw an exception if not
        }
        int sum = 0; // Initialize sum to 0 for calculating the sum of divisors
        for (int i = number - 1; i > 0; i--) { // Loop from number-1 down to 1
            if (number % i == 0) { // Check if i is a divisor of number
                sum += i; // Add the divisor to the sum
            }
        }
        if (sum == number) { // Check if the sum of divisors equals the number
            result = Classification.PERFECT; // Classify as PERFECT
        } else if (sum > number) { // Check if the sum of divisors is greater than the number
            result = Classification.ABUNDANT; // Classify as ABUNDANT
        } else { // If the sum is less than the number
            result = Classification.DEFICIENT; // Classify as DEFICIENT
        }
    }

    Classification getClassification() { // Method to return the classification result
        return result; // Return the classification
    }

    enum Classification {DEFICIENT, PERFECT, ABUNDANT} // Define an enum for classifications
}
