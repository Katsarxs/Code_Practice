// Generated from Cooker.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CookerParser}.
 */
public interface CookerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CookerParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(CookerParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(CookerParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(CookerParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(CookerParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#titleName}.
	 * @param ctx the parse tree
	 */
	void enterTitleName(CookerParser.TitleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#titleName}.
	 * @param ctx the parse tree
	 */
	void exitTitleName(CookerParser.TitleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#preparationTime}.
	 * @param ctx the parse tree
	 */
	void enterPreparationTime(CookerParser.PreparationTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#preparationTime}.
	 * @param ctx the parse tree
	 */
	void exitPreparationTime(CookerParser.PreparationTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#preparationTimeNumber}.
	 * @param ctx the parse tree
	 */
	void enterPreparationTimeNumber(CookerParser.PreparationTimeNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#preparationTimeNumber}.
	 * @param ctx the parse tree
	 */
	void exitPreparationTimeNumber(CookerParser.PreparationTimeNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#preparationTimeUnit}.
	 * @param ctx the parse tree
	 */
	void enterPreparationTimeUnit(CookerParser.PreparationTimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#preparationTimeUnit}.
	 * @param ctx the parse tree
	 */
	void exitPreparationTimeUnit(CookerParser.PreparationTimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#cookingTime}.
	 * @param ctx the parse tree
	 */
	void enterCookingTime(CookerParser.CookingTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#cookingTime}.
	 * @param ctx the parse tree
	 */
	void exitCookingTime(CookerParser.CookingTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#cookingTimeNumber}.
	 * @param ctx the parse tree
	 */
	void enterCookingTimeNumber(CookerParser.CookingTimeNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#cookingTimeNumber}.
	 * @param ctx the parse tree
	 */
	void exitCookingTimeNumber(CookerParser.CookingTimeNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#cookingTimeUnit}.
	 * @param ctx the parse tree
	 */
	void enterCookingTimeUnit(CookerParser.CookingTimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#cookingTimeUnit}.
	 * @param ctx the parse tree
	 */
	void exitCookingTimeUnit(CookerParser.CookingTimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#servings}.
	 * @param ctx the parse tree
	 */
	void enterServings(CookerParser.ServingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#servings}.
	 * @param ctx the parse tree
	 */
	void exitServings(CookerParser.ServingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#servingsNumber}.
	 * @param ctx the parse tree
	 */
	void enterServingsNumber(CookerParser.ServingsNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#servingsNumber}.
	 * @param ctx the parse tree
	 */
	void exitServingsNumber(CookerParser.ServingsNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#ingredients}.
	 * @param ctx the parse tree
	 */
	void enterIngredients(CookerParser.IngredientsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#ingredients}.
	 * @param ctx the parse tree
	 */
	void exitIngredients(CookerParser.IngredientsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#ingredient}.
	 * @param ctx the parse tree
	 */
	void enterIngredient(CookerParser.IngredientContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#ingredient}.
	 * @param ctx the parse tree
	 */
	void exitIngredient(CookerParser.IngredientContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#quantity}.
	 * @param ctx the parse tree
	 */
	void enterQuantity(CookerParser.QuantityContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#quantity}.
	 * @param ctx the parse tree
	 */
	void exitQuantity(CookerParser.QuantityContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#ingredientUnit}.
	 * @param ctx the parse tree
	 */
	void enterIngredientUnit(CookerParser.IngredientUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#ingredientUnit}.
	 * @param ctx the parse tree
	 */
	void exitIngredientUnit(CookerParser.IngredientUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#ingredientName}.
	 * @param ctx the parse tree
	 */
	void enterIngredientName(CookerParser.IngredientNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#ingredientName}.
	 * @param ctx the parse tree
	 */
	void exitIngredientName(CookerParser.IngredientNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#instructions}.
	 * @param ctx the parse tree
	 */
	void enterInstructions(CookerParser.InstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#instructions}.
	 * @param ctx the parse tree
	 */
	void exitInstructions(CookerParser.InstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(CookerParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(CookerParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#instructionVerb}.
	 * @param ctx the parse tree
	 */
	void enterInstructionVerb(CookerParser.InstructionVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#instructionVerb}.
	 * @param ctx the parse tree
	 */
	void exitInstructionVerb(CookerParser.InstructionVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link CookerParser#instructionText}.
	 * @param ctx the parse tree
	 */
	void enterInstructionText(CookerParser.InstructionTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CookerParser#instructionText}.
	 * @param ctx the parse tree
	 */
	void exitInstructionText(CookerParser.InstructionTextContext ctx);
}