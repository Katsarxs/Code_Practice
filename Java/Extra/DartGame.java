class DartGame { // Define the DartGame class
    int score(double xOfDart, double yOfDart) { // Method to calculate the score based on dart coordinates
        double distance = Math.sqrt(Math.pow(xOfDart, 2) + Math.pow(yOfDart, 2)); // Calculate the distance from the origin
        int scoreUser = 0; // Initialize the user's score to 0
        if (distance > 5) { // Check if the distance is greater than 5
            scoreUser = 1; // Set score to 1 for distance greater than 5
        } else if (distance > 1) { // Check if the distance is greater than 1
            scoreUser = 5; // Set score to 5 for distance greater than 1
        } else if (distance >= 0) { // Check if the distance is non-negative
            scoreUser = 10; // Set score to 10 for distance between 0 and 1
        }
        return scoreUser; // Return the calculated score
    }
}