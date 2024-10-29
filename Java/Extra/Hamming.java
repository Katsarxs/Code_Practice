public class Hamming {
    private int hammingDistance = 0;

    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() == rightStrand.length()) {
            int strandsLength = rightStrand.length();
            int differencesFound = 0;
            char[] leftStrandCharArray = leftStrand.toCharArray();
            char[] rightStrandCharArray = rightStrand.toCharArray();

            for (int i = 0; i < strandsLength; i++) {
                if(leftStrandCharArray[i] != rightStrandCharArray[i]) {
                    differencesFound++;
                }
            }
            hammingDistance = differencesFound;
        } else {
            throw new IllegalArgumentException("strands must be of equal length");
        }
    }

    public int getHammingDistance() {
        return hammingDistance;
    }
}