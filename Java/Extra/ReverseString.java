class ReverseString { // Define a class named ReverseString
    String reverse(String inputWord) { // Method to reverse a given string
        int lengthOfInputWord = inputWord.length(); // Get the length of the input string
        char[] arrayInputWord = inputWord.toCharArray(); // Convert the input string to a character array
        StringBuilder reversedInputWord = new StringBuilder(); // Create a StringBuilder to hold the reversed string

        for (int i = 0; i < lengthOfInputWord; i++) { // Loop through each character in the input string
            reversedInputWord.append(arrayInputWord[lengthOfInputWord - i - 1]); // Append characters in reverse order
        }
        return reversedInputWord.toString(); // Convert StringBuilder to string and return it
    }
}