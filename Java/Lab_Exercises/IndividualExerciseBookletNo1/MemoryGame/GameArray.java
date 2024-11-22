import java.util.Random; // Random class for the random calculations

public class GameArray { // The game array class
    char[][] memoryGameArray; // The base 2d-array for the game
    char[] alphabetUpperCaseArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // The alphabet in array

    public GameArray(int row, int column) { // Constructor for game array class
        this.memoryGameArray = new char[row][column]; // Sets row and column of the memory game array
        makeGameArray(); // Calls method to fill the memoryGameArray with random letters of the alphabet
    }

    private void makeGameArray() { // Method to fill the memoryGameArray with random letters of the alphabet
        for (int i = 0; i < getRowNumber(); i++) { // Loop for rows
            for (int j = 0; j < getColumnNumber(); j++) { // Loop for columns
                if (!isCellOccupied(memoryGameArray[i][j])) { // If current cell in memoryGameArray is empty
                    char randomCharacter = randomChar(); // Generate new random character
                    memoryGameArray[i][j] = randomCharacter; // Place the random character in the cell

                    if (j == getColumnNumber() - 1) { // If it's the last column of the current row
                        memoryGameArray[i+1][0] = randomCharacter; // Place the random character on the next row in the first column
                    } else { // If it's not the last column
                        memoryGameArray[i][j+1] = randomCharacter; // Place the random character on the current row in the next column
                    }
                }
            }
        }
        shuffleArray(); // Calls method to shuffle the array
    }

    private void shuffleArray() { // Method to shuffle the array
        Random rand = new Random(); // Random object to generate random positions
        int rows = getRowNumber(), cols = getColumnNumber(), totalElements = rows * cols; // Set rows, columns and total elements numbers
        for (int i = totalElements - 1; i > 0; i--) { // Loop to shuffle starting from last element
            int j = rand.nextInt(i + 1); // Generate random number for j
            char temp = memoryGameArray[i / cols][i % cols]; // Sets temp character with the character of i-th position
            memoryGameArray[i / cols][i % cols] = memoryGameArray[j / cols][j % cols]; // Swaps characters in i and j positions
            memoryGameArray[j / cols][j % cols] = temp; // Finish the swap
        }
    }

    private char randomChar() { // Method which returns a random character
        Random random = new Random(); // Random object to generate random positions
        char randomChar; // Initialize character variable to store random character
        do {
            randomChar = alphabetUpperCaseArray[random.nextInt(alphabetUpperCaseArray.length)]; // Get random character of the alphabet array
        } while (checkChar(randomChar)); // If random character already exists in array, repeat until it doesn't
        return randomChar; // Returns random character
    }

    private boolean checkChar(char charToCheck) { // Method which checks if character exists in memoryGameArray
        for (char[] chars : memoryGameArray) { // Loop for rows
            for (int j = 0; j < getColumnNumber(); j++) { // Loop for columns
                if (charToCheck == chars[j]) { // If character is found
                    return true; // Returns true
                }
            }
        }
        return false; // Returns false if character not found
    }

    public void printArray(char[][] array) { // Method to print 2d arrays
        System.out.print("\n"); // Prints newline
        for (char[] chars : array) { // Loop for rows
            System.out.print("| "); // Prints left border of the cell
            for (int j = 0; j < array[0].length; j++) { // Loop for columns
                System.out.print(chars[j] + " | "); // Prints right border of the cell
            }
            System.out.print("\n"); // Prints newline between rows
        }
        System.out.print("\n"); // Prints final newline when printing is done
    }

    public boolean isCellOccupied(char cell) { // Method to check if cell is empty
        return cell != '\u0000'; // Returns true if cell is not empty or else false
    }

    public char getLetter(int row, int column) { // Method getter to get character by its row and column
        return memoryGameArray[row][column]; // Returns the specific character
    }

    public int getRowNumber() { // Method getter to get the row number of the memory game array
        return memoryGameArray.length; // Returns the row number
    }

    public int getColumnNumber() { // Method getter to get the column number of the memory game array
        return memoryGameArray[0].length; // Returns the column number
    }
}