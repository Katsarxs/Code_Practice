public class Calc {
    public static void main(String[] args) {
        int operand1, operand2; // Declare variables to hold the operands
        char operator; // Declare a variable to hold the operator

        if(args.length != 3){ // Check if the number of arguments is not equal to 3
            System.out.println("Missing arguments"); // Print an error message if arguments are missing
            return; // Exit the program
        }
        operand1 = Integer.parseInt(args[0]); // Convert the 1st argument to an integer and assign it to operand1
        operand2 = Integer.parseInt(args[1]); // Convert the 2nd argument to an integer and assign it to operand2
        operator = args[2].charAt(0); // Get the operator from the 3rd argument as a character

        switch(operator){ // Start a switch statement to determine the operator
            case '-': // Case for subtraction
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2)); // Print the result of subtraction
                break; // Exit the switch case
            case '+': // Case for addition
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2)); // Print the result of addition
                break; // Exit the switch case
            case '*': // Case for multiplication
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2)); // Print the result of multiplication
                break; // Exit the switch case
            case '/': // Case for division
                if (operand2 == 0) { // Check if the second operand is zero
                    System.out.println("Division by zero"); // Print an error message for division by zero
                }
                else {
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2)); // Print the result of division
                }
                break; // Exit the switch case
            default: // Default case for invalid operators
                System.out.println("Invalid operator"); // Print an error message for invalid operators
        }
    }
}