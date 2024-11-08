public class EliudsEggs { // Define the class named EliudsEggs
    public int eggCount(int number) { // Define a method called eggCount that takes an integer parameter 'number'
        return Integer.toBinaryString(number).replace("0", "").length(); // Convert 'number' to its binary string representation, remove all '0's, and return the length of the resulting string
    }
}