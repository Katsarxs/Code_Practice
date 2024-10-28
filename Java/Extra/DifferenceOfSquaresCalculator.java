class DifferenceOfSquaresCalculator { // Define the DifferenceOfSquaresCalculator class

    int computeSquareOfSumTo(int input) { // Method to compute the square of the sum up to the input
        int resultOfSquareOfSum = 0; // Initialize the result of the square of sum to 0
        for (int i = 0; i <= input; i++) { // Loop from 0 to the input value
            resultOfSquareOfSum += i; // Add each number to the result
        }
        resultOfSquareOfSum = (int) Math.pow(resultOfSquareOfSum, 2); // Square the result
        return resultOfSquareOfSum; // Return the squared sum
    }

    int computeSumOfSquaresTo(int input) { // Method to compute the sum of squares up to the input
        int resultOfSumOfSquares = 0; // Initialize the result of the sum of squares to 0
        for (int i = 0; i <= input; i++) { // Loop from 0 to the input value
            resultOfSumOfSquares += (int) Math.pow(i, 2); // Add the square of each number to the result
        }
        return resultOfSumOfSquares; // Return the sum of squares
    }

    int computeDifferenceOfSquares(int input) { // Method to compute the difference between the square of the sum and the sum of squares
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input); // Return the difference
    }
}
