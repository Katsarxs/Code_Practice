class ArmstrongNumbers {
    boolean isArmstrongNumber(int numberToCheck) { // Method to check if a number is an Armstrong number
        String numberToString = Integer.toString(numberToCheck); // Convert the number to a string
        int lengthOfNumber = numberToString.length(); // Get the length of the number string
        int resultNumber = 0; // Initialize result number to accumulate the Armstrong sum
        char[] arrayNumberString = numberToString.toCharArray(); // Convert the string to a character array

        // Loop through each character in the character array
        for (int i = 0; i < lengthOfNumber; i++) {
            String unitNumberString = String.valueOf(arrayNumberString[i]); // Get the current character as a string
            int unitNumberInteger = Integer.parseInt(unitNumberString); // Convert the character string to an integer
            resultNumber += (int) Math.pow(unitNumberInteger, lengthOfNumber); // Raise the unit number to the power of the length and add to the result
        }
        return numberToCheck == resultNumber; // Return true if it is an Armstrong number, false otherwise
    }
}