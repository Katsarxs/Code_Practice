class RnaTranscription { // Define the RnaTranscription class
    String transcribe(String dnaStrand) { // Method to transcribe DNA to RNA
        StringBuilder rnaStrand = new StringBuilder(); // Create a StringBuilder for the RNA strand
        if (!dnaStrand.isEmpty()) { // Check if the DNA strand is not empty
            int dnaStrandCharLength = dnaStrand.length(); // Get the length of the DNA strand
            char[] dnaStrandCharArray = dnaStrand.toCharArray(); // Convert the DNA strand to a character array

            for (int i = 0; i < dnaStrandCharLength; i++) { // Loop through each character in the DNA strand
                char addedChar = switch (dnaStrandCharArray[i]) { // Use a switch expression to determine RNA equivalent
                    case 'G' -> 'C'; // Transcribe G to C
                    case 'C' -> 'G'; // Transcribe C to G
                    case 'T' -> 'A'; // Transcribe T to A
                    case 'A' -> 'U'; // Transcribe A to U
                    default -> 0; // Handle invalid characters (optional)
                };
                rnaStrand.append(addedChar); // Append the transcribed character to the RNA strand
            }
        }
        return rnaStrand.toString(); // Return the RNA strand as a string
    }
}
