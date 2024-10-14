public class Calc {
    public static void main(String[] args) {
        int operand1, operand2;
        char operator;
        if(args.length != 3){
            System.out.println("Missing arguments");
            return;
        }
        operand1 = Integer.parseInt(args[0]); // Convert the 1st argument to an integer
        operand2 = Integer.parseInt(args[1]); // Convert the 2st argument to an integer
        operator = args[2].charAt(0); // Convert operator to a character
        switch(operator){
            case '-': // Show result by applying operator -
                System.out.println(operand1 + " - " + operand2 + " = " + (operand1 - operand2));
                break;
            case '+': // Show result by applying operator +
                System.out.println(operand1 + " + " + operand2 + " = " + (operand1 + operand2));
                break;
            case '*': // Show result by applying operator *
                System.out.println(operand1 + " * " + operand2 + " = " + (operand1 * operand2));
                break;
            case '/': // Show result by applying operator /
                if (operand2 == 0) {
                    System.out.println("Division by zero");
                }
                else {
                    System.out.println(operand1 + " / " + operand2 + " = " + (operand1 / operand2));
                }
            default:
                System.out.println("Invalid operator");
        }
    }
}