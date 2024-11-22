import java.util.Arrays; // Arrays class for arrays
import java.util.Scanner; // Scanner class for reading input

public class GameProcess { // The game process class
    final private GameArray gameArray; // GameArray object
    final private Player player; // Player object for player stats
    final private Scanner scanner; // Scanner object to take input

    public GameProcess() { // Constructor for GameProcess class
        this.gameArray = new GameArray(4, 5); // Make GameArray object with 4 rows and 5 columns
        this.player = new Player(); // Make Player object
        this.scanner = new Scanner(System.in); //  Make Scanner object
    }

    public void gameBegin() { // Method to start the game process
        char[][] tempGameArray = new char[gameArray.getRowNumber()][gameArray.getColumnNumber()]; // Make temporary game array
        for (char[] tempGameArrayElement : tempGameArray) Arrays.fill(tempGameArrayElement, '*'); // Fill the array with *
        // gameArray.printArray(gameArray.memoryGameArray); // for test

        while (player.getUnsuccessfulTries() < 4 && checkIfAvailable(tempGameArray)) { // If player mistakes are less than 4 and temp game array has empty cell
            gameArray.printArray(tempGameArray); // Prints the temporary game array
            int rowFirst = inputUser("Enter row of first character: ", 'r'); // Prints prompt for first row
            int columnFirst = inputUser("Enter column of first character: ", 'c'); // Prints prompt for first column

            if (tempGameArray[rowFirst][columnFirst] != '*') { // If the character is revealed
                System.out.println("Invalid option, try again"); // Prints error prompt
                continue; // Restarts
            }
            tempGameArray[rowFirst][columnFirst] = gameArray.getLetter(rowFirst, columnFirst); // Reveal the first character
            gameArray.printArray(tempGameArray); // Prints the temporary game array

            int rowSecond = inputUser("Enter row of second character: ", 'r'); // Prints prompt for second row
            int columnSecond = inputUser("Enter column of second character: ", 'c'); // Prints prompt for second column

            if (tempGameArray[rowSecond][columnSecond] != '*') { // If the character is revealed
                tempGameArray[rowFirst][columnFirst] = '*'; // Resets first cell
                System.out.println("Invalid option, try again"); // Prints error prompt
                continue; // Restarts
            }
            tempGameArray[rowSecond][columnSecond] = gameArray.getLetter(rowSecond, columnSecond); // Reveal the second character
            gameArray.printArray(tempGameArray); // Prints the temporary game array

            if (gameArray.getLetter(rowFirst, columnFirst) != gameArray.getLetter(rowSecond, columnSecond)) { // If the characters are not the same
                tempGameArray[rowFirst][columnFirst] = '*';tempGameArray[rowSecond][columnSecond] = '*'; // Restarts the two cells
                player.unsuccessfulTriesUp(); // Increases the unsuccessful tries
            }
            player.roundsNumberUp(); // Increases the round number
        }
        gameArray.printArray(gameArray.memoryGameArray); // Prints the correct array
        System.out.println("Total Rounds: " + player.getRoundNumber()); // Prints the total rounds played
    }

    private int inputUser(String messagePrompt, char RowOrColumn) { // Method for printing prompts and checking input
        int inputNumber; // Integer to store input
        do { // Do loop
            System.out.print(messagePrompt); // Prints prompt
            inputNumber = scanner.nextInt() - 1; // Gets the input
            if ((inputNumber < 0 || inputNumber >= gameArray.getRowNumber()) && RowOrColumn == 'r') System.out.println("Invalid row. Please try again."); // If input is for row and is invalid, restarts
            else if ((inputNumber >= gameArray.getColumnNumber()) && RowOrColumn == 'c') System.out.println("Invalid column. Please try again."); // Else if input is for columns and is invalid, restarts
            else break; // If all are valid, exits the loop
        } while (true); // Repeats until input is valid
        return inputNumber; // Returns the number
    }

    private boolean checkIfAvailable(char[][] tempArray) { // Method to check if temp array is full
        for (char[] chars : tempArray) { // Loop for rows
            for (int j = 0; j < tempArray[0].length; j++) { // Loop for columns
                if (chars[j] == '*') return true; // If cell is available, return true
            }
        }
        return false; // Returns false if there's no available cell
    }
}