import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/*
Nikolaos Katsaros
AM: 3212023075
*/

public class RecipeParser {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream inStream;

        if (inputFile != null) {
            inStream = new FileInputStream(inputFile);
        } else {
            inStream = System.in;
        }
        CharStream input = CharStreams.fromStream(inStream);
        CookerLexer lexer = new CookerLexer(input); // Grammar title "Cooker" before "Lexer"
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CookerParser parser = new CookerParser(tokens); // Grammar title "Cooker" before "Parser"
        ParseTree tree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        Print printListener = new Print();

        walker.walk(printListener, tree);
        printListener.checkIngredientsInInstructions();
        printListener.calculateTotalTime();
    }

    public static class Print extends CookerBaseListener {
        private List<String> ingredientNames = new ArrayList<>();
        private List<String> instructionTexts = new ArrayList<>();
        private double preparationTimeInMinutes = 0.0;
        private double cookingTimeInMinutes = 0.0;
        private double totalTimeInMinutes = 0.0;
        private double preparationTimeNumber = 0.0;
        private double cookingTimeNumber = 0.0;
        private String preparationTimeUnit = "";
        private String cookingTimeUnit = "";
        private String unit = "";

        @Override
        public void enterTitle(CookerParser.TitleContext ctx) {
            String title = ctx.titleName().getText();
            String fTitle = title.replaceAll("([a-z])([A-Z])", "$1 $2"); // Splitting words
            System.out.println("\nTitle: " + fTitle);
        }

        @Override
        public void enterIngredients(CookerParser.IngredientsContext ctx) {
            System.out.println("\nIngredients: ");
        }

        @Override
        public void enterIngredient(CookerParser.IngredientContext ctx) {
            if (ctx.ingredientUnit() == null) { // If ingredientUnit is empty
                unit = " "; // Fill with space
            } else { // Or else
                unit = " " + ctx.ingredientUnit().getText() + " "; // Set unit with ingredient unit string
            }
            System.out.println(ctx.quantity().getText() + unit + ctx.ingredientName().getText());
        }

        @Override
        public void enterIngredientName(CookerParser.IngredientNameContext ctx) {
            String ingredientName = ctx.getText().trim();
            ingredientNames.add(ingredientName);
        }

        @Override
        public void enterInstructionText(CookerParser.InstructionTextContext ctx) {
            String instructionText = ctx.getText();
            instructionTexts.add(instructionText);
        }

        @Override
        public void enterPreparationTimeNumber(CookerParser.PreparationTimeNumberContext ctx) {
            preparationTimeNumber = parseNumber(ctx.getText());
        }

        @Override
        public void enterCookingTimeNumber(CookerParser.CookingTimeNumberContext ctx) {
            cookingTimeNumber = parseNumber(ctx.getText());
        }

        @Override
        public void enterPreparationTimeUnit(CookerParser.PreparationTimeUnitContext ctx) {
            preparationTimeUnit = ctx.getText();
            calculatePreparationTime();
        }

        @Override
        public void enterCookingTimeUnit(CookerParser.CookingTimeUnitContext ctx) {
            cookingTimeUnit = ctx.getText();
            calculateCookingTime();
        }

        public void checkIngredientsInInstructions() {
            List<String> notInvolvedIngredients = new ArrayList<>();

            for (String ingredient : ingredientNames) {
                boolean found = false; // Flag for founding the involved ingredient

                for (String instruction : instructionTexts) {
                    if (instruction.toLowerCase().contains(ingredient.toLowerCase())) { // If the instruction contains ingredient (in lowercase)
                        found = true; // Set flag to true
                        break;
                    }
                }
                if (!found) { // If not found
                    notInvolvedIngredients.add(ingredient); // Add it to the list
                }
            }
            if (!notInvolvedIngredients.isEmpty()) { // If the notInvolvedIngredients list isn't empty, prints it
                System.out.print("\n!WARNING: Ingredients ");

                if (notInvolvedIngredients.size() == 1) {
                    System.out.println("\"" + notInvolvedIngredients.getLast() + "\" not found in the instructions!");
                } else {
                    for (int i = 0; i < notInvolvedIngredients.size() - 1; i++) {
                        System.out.print("\"" + notInvolvedIngredients.get(i) + "\", ");
                    }
                    System.out.println("\"" + notInvolvedIngredients.getLast() + "\" not found in the instructions!");
                }
            }
        }

        private double parseNumber(String value) { // Taking number and format it to double
            if (value.contains(" ")) { // If it has space like: "3 1/2"
                String[] parts = value.split(" "); // Split it
                int whole = Integer.parseInt(parts[0]); // Take first part "3"
                String[] fraction = parts[1].split("/"); // Split the fraction
                int numerator = Integer.parseInt(fraction[0]); // Take first part of fraction "1"
                int denominator = Integer.parseInt(fraction[1]); // Take second part of fraction "2"
                return whole + (double) numerator / denominator; // Format it to double "3.5"
            } else if (value.contains("/")) { // If it is fraction like: "1/2"
                String[] fraction = value.split("/"); // Split it
                int numerator = Integer.parseInt(fraction[0]); // Take first part "1"
                int denominator = Integer.parseInt(fraction[1]); // Take second part "2"
                return (double) numerator / denominator; // Format it to double "0.5"
            } else { // If it is integer or double "1"
                return Double.parseDouble(value); // Format it to double "1.0"
            }
        }

        private void calculatePreparationTime() { // Formating preparation time in minutes
            if (preparationTimeUnit.equals("hr")) { // If the unit of preparation time is hr
                preparationTimeInMinutes = preparationTimeNumber * 60; // Format it in minutes
            } else { // Else
                preparationTimeInMinutes = preparationTimeNumber; // Leave it as it is
            }
        }

        private void calculateCookingTime() { // Formating cooking time in minutes
            if (cookingTimeUnit.equals("hr")) { // If the unit of cooking time is hr
                cookingTimeInMinutes = cookingTimeNumber * 60; // Format it in minutes
            } else { // Else
                cookingTimeInMinutes = cookingTimeNumber; // Leave it as it is
            }
        }

        public void calculateTotalTime() { // Calculating total time
            totalTimeInMinutes = preparationTimeInMinutes + cookingTimeInMinutes;
            System.out.println("\nTotal Time: " + totalTimeInMinutes + " min");
        }
    }
}