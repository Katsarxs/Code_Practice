import javax.swing.*; // Import the Swing library for GUI components

public class DialogMaxInteger { // Define the main class
    public static void main(String[] args) { // Main method where program execution begins
        // Show an input dialog to get the first number from the user
        String integerOne = JOptionPane.showInputDialog("Enter first number: ");
        // Show an input dialog to get the second number from the user
        String integerTwo = JOptionPane.showInputDialog("Enter second number: ");
        // Show an input dialog to get the third number from the user
        String integerThree = JOptionPane.showInputDialog("Enter third number: ");

        // Parse the first input string to an integer
        int integerFirst = Integer.parseInt(integerOne);
        // Parse the second input string to an integer
        int integerSecond = Integer.parseInt(integerTwo);
        // Parse the third input string to an integer
        int integerThird = Integer.parseInt(integerThree);

        // Find the maximum of the three integers
        int integerMax = Math.max(integerFirst, Math.max(integerSecond, integerThird));

        // Show a message dialog displaying the maximum number found
        JOptionPane.showMessageDialog(null, "Maximum number is: " + integerMax + ".");
    }
}