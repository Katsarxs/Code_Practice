public class PangramChecker { // Class definition for PangramChecker
    public boolean isPangram(String input) { // Method to check if input is a pangram
        char[] englishAlphabet = { // Array holding all letters of the English alphabet
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        input = input.replaceAll(" ", "").toLowerCase(); // Remove spaces and convert input to lowercase
        char[] inputArray = input.toCharArray(); // Convert the cleaned input string to a character array
        int counter = 0; // Counter for matching letters

        for (int i = 0; i < englishAlphabet.length; i++) { // Loop through each letter in the alphabet
            for (int j = 0; j < inputArray.length; j++) { // Loop through each character in the input
                if (inputArray[j] == englishAlphabet[i]) { // Check if the current input character matches the alphabet letter
                    counter++; // Increment the counter if a match is found
                    break; // Exit the inner loop to avoid counting the same letter multiple times
                }
            }
        }
        return counter == 26; // Return true if all 26 letters are found, otherwise false
    }
}