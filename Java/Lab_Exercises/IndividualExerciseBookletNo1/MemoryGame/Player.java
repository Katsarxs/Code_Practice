public class Player { // The player class
    private int unsuccessfulTries; // Private integer number for unsuccessful rounds
    private int roundsNumber; // Private integer number for total rounds

    public Player() { // Constructor for player class
        this.unsuccessfulTries = 0; // Set unsuccessful rounds to 0
        this.roundsNumber = 0; // // Set total rounds to 0
    }

    public void unsuccessfulTriesUp() { // Method for unsuccessful rounds number increasement
        this.unsuccessfulTries++; // Increase unsuccessful rounds number
    }

    public void roundsNumberUp() { // Method for total rounds number increasement
        this.roundsNumber++; // Increase total rounds number
    }

    public int getRoundNumber() { // Method to get total round number
        return roundsNumber; // Returns total round number
    }

    public int getUnsuccessfulTries() { // Method to get unsuccessful rounds number
        return unsuccessfulTries; // Returns unsuccessful round number
    }
}