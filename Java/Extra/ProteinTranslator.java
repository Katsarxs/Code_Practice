import java.util.ArrayList; // Import ArrayList for dynamic array functionality
import java.util.List; // Import List interface

class ProteinTranslator {
    List<String> translate(String rnaSequence) { // Method to translate RNA sequence into proteins
        List<String> rnaSequenceList = new ArrayList<>(); // List to hold codons (not currently used)
        List<String> result = new ArrayList<>(); // List to hold resulting proteins

        for (int i = 0; i <= rnaSequence.length() - 3; i += 3) { // Loop through RNA sequence in increments of 3
            String currentRnaSequence = rnaSequence.substring(i, i + 3); // Extract current codon (3 nucleotides)
            switch (currentRnaSequence) { // Determine which protein corresponds to the codon
                case "AUG": // Start codon for Methionine
                    result.add("Methionine"); // Add Methionine to the result
                    break; // Exit the switch statement
                case "UUU", "UUC": // Codons for Phenylalanine
                    result.add("Phenylalanine"); // Add Phenylalanine to the result
                    break; // Exit the switch statement
                case "UUA", "UUG": // Codons for Leucine
                    result.add("Leucine"); // Add Leucine to the result
                    break; // Exit the switch statement
                case "UCU", "UCC", "UCA", "UCG": // Codons for Serine
                    result.add("Serine"); // Add Serine to the result
                    break; // Exit the switch statement
                case "UAU", "UAC": // Codons for Tyrosine
                    result.add("Tyrosine"); // Add Tyrosine to the result
                    break; // Exit the switch statement
                case "UGU", "UGC": // Codons for Cysteine
                    result.add("Cysteine"); // Add Cysteine to the result
                    break; // Exit the switch statement
                case "UGG": // Codon for Tryptophan
                    result.add("Tryptophan"); // Add Tryptophan to the result
                    break; // Exit the switch statement
                case "UAA", "UAG", "UGA": // Stop codons
                    return result; // Return the current protein list if a stop codon is encountered
                default: // Handle any invalid codons
                    throw new IllegalArgumentException("Invalid codon"); // Throw an exception for invalid codon
            }
        }
        if (rnaSequence.length() % 3 != 0) { // Check for incomplete codons
            throw new IllegalArgumentException("Invalid codon"); // Throw an exception for incomplete codons
        }
        return result; // Return the final list of proteins
    }
}