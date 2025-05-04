grammar Cooker;

/*
Nikolaos Katsaros
AM: 3212023075
*/

parse: title preparationTime cookingTime? servings ingredients instructions; // Top parser rule that matches title, preparationTime, optional cookingTime, servings, ingredients, instructions

title: 'Title:' titleName NEWLINE; // Matches string 'Title:', titleName and newline
titleName: TEXT*; // Matches the recipe name from the rule TEXT

preparationTime: 'Preparation Time:' preparationTimeNumber preparationTimeUnit NEWLINE; // Matches string 'Preparation Time:', preparationTimeNumber, preparationTimeUnit and then newline
preparationTimeNumber: WHOLEWITHFRACTION+; // Matches the time of preparation
preparationTimeUnit: TIMEUNIT; // Matches preparation time unit from TIMEUNIT rule

cookingTime: 'Cooking Time:' cookingTimeNumber cookingTimeUnit NEWLINE; // Matches string 'Cooking Time:', cookingTimeNumber, cookingTimeUnit and then newline
cookingTimeNumber: WHOLEWITHFRACTION+; // Matches the time of cooking
cookingTimeUnit: TIMEUNIT; // Matches cooking time unit from TIMEUNIT rule

servings: 'Servings:' servingsNumber NEWLINE+; // Matches string 'Servings:', then servingsNumber and then one or more newlines
servingsNumber: WHOLEWITHFRACTION; // Matches the servings number

ingredients: 'Ingredients:' NEWLINE ingredient+ NEWLINE+; // Matches string 'Ingredients:', newline, one or more ingredient and then one or more newlines
ingredient: quantity ingredientUnit? ingredientName NEWLINE; // Matches quantity, optional ingredientUnit, ingredientName and then newline
quantity: WHOLEWITHFRACTION+; // Matches the quantity
ingredientUnit: UNIT; // Mathces unit of UNIT rule
ingredientName: TEXT*; // Matches the name of ingredient

instructions: 'Instructions:' NEWLINE instruction+; // Matches string 'Instructions:', then newline and then one or more instruction
instruction: instructionVerb instructionText NEWLINE*; // Matches verb, then the rest of the text and then 0 or more newlines
instructionVerb: VERB; // Matches the verb from VERB rule
instructionText: (TEXT | WHOLEWITHFRACTION | UNIT)*; // Matches rest of the text

WHOLEWITHFRACTION : INT ((' ' INT)? '/' INT)?; // Matches integer, fraction or integer with fraction
INT: DIGIT+; // Matches one or more single digits
DIGIT: [0-9]; // Matches any single digit from 0 to 9
TIMEUNIT: 'min' | 'hr';
VERB: 'Mix' | 'Whisk' | 'Pour' | 'Stir' | 'Bake' | 'Boil' | 'Add' | 'Chop' | 'Slice' | 'Cook' | 'Serve' | 'Simmer' | 'Heat' | 'Saute' | 'Crumble' | 'Combine' | 'Toss' | 'Scramble' | 'Top' | 'Preheat' | 'Fill' | 'Warm' | 'Bring' | 'Reduce' | 'Crack' | 'Melt' | 'Season';
UNIT: 'cup' | 'cups' | 'tsp' | 'tbsp' | 'ml' | 'g' | 'kg' | 'liter' | 'liters' | 'clove' | 'cloves' | 'stalk' | 'stalks' | 'pinch';
TEXT: ~[ \t\r\n]+; // Matches everything except space, tab, carrier return or newline
NEWLINE: [\n]; // Mathces newline
WS: [ \t\r]+ -> skip; // Skips space, tab and carrier return
COMMENT: '#' ~[\r\n]* '\r'? '\n' -> skip; // Skips whole line that starts with "#"