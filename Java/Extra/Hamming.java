public class Hamming { // Define the Hamming class
    private int hammingDistance = 0; // Initialize hammingDistance to 0

    public Hamming(String leftStrand, String rightStrand) { // Constructor taking two string parameters
        if (leftStrand.length() == rightStrand.length()) { // Check if the lengths of the strands are equal
            int strandsLength = rightStrand.length(); // Get the length of the right strand
            int differencesFound = 0; // Initialize a counter for differences
            char[] leftStrandCharArray = leftStrand.toCharArray(); // Convert left strand to a char array
            char[] rightStrandCharArray = rightStrand.toCharArray(); // Convert right strand to a char array

            for (int i = 0; i < strandsLength; i++) { // Loop through each character in the strands
                if(leftStrandCharArray[i] != rightStrandCharArray[i]) { // Check if characters are different
                    differencesFound++; // Increment the differences counter
                }
            }
            hammingDistance = differencesFound; // Set hammingDistance to the number of differences found
        } else { // If the strands are of unequal length
            throw new IllegalArgumentException("strands must be of equal length"); // Throw an exception
        }
    }

    public int getHammingDistance() { // Getter method for hammingDistance
        return hammingDistance; // Return the hamming distance
    }
}