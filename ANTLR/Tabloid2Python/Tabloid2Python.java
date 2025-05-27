import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Tabloid2Python {
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
        CharStream input = CharStreams.fromStream(inStream); // Creating a character stream
        TabloidLexer lexer = new TabloidLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);  // Creates a buffer for tokens
        TabloidParser parser = new TabloidParser(tokens);
        ParseTree tree = parser.compilationUnit();
        ParseTreeWalker walker = new ParseTreeWalker(); // Creating a parsing tree which uses callbacks using the Print class that we made and overrides methods of TabloidBaseListener
        Print printListener = new Print(inputFile.substring(0, inputFile.lastIndexOf('.')) + ".py"); // Listener gia output arxeio .py
        walker.walk(printListener, tree);
        printListener.closeWriter();
    }

    public static class Print extends TabloidBaseListener {
        private BufferedWriter writer;
        String identifierr = ""; 
        int argumentCount = 0; // arithmos gia ta arguments
        int argumentCounter = 0; // counter gia ta arguments
        int tabLevel = 0; // arihtmos gia th diataji toy keimenoy me tabs
        boolean argumentFinish = false; // Flag gia ta argyments

        /*Contructor*/
        public Print(String outputFile) throws IOException {
            writer = new BufferedWriter(new FileWriter(outputFile));
        }

        public void closeWriter() throws IOException {
            writer.close(); // stamataei na grafei
        }

        public void write(String text) {
            try {
                writer.write(text); // pairnaei keimeno sto arxeio
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void setTabLevel(int newTabLevel) {
            if(tabLevel < 0) {
                tabLevel = 0;
            }
            tabLevel += newTabLevel; // allazei to tab level
        }

        /*Methodo print gia na periexei kai ta tabs*/
        public void printWithTabs(String text) { 
            StringBuilder tabs = new StringBuilder();

            for (int i = 0; i < tabLevel; i++) {
                tabs.append("\t");
            }
            write("\n" + tabs.toString() + text);
        }

        @Override
        /*Methodo pou antikathista kai ektuponei me sumbola ta binaryHighop */
        public void enterBinaryHighOp(TabloidParser.BinaryHighOpContext ctx) {
            String binaryOp = ctx.getText();
            String result = switch (binaryOp) {
                case "TIMES" -> "*";
                case "DIVIDED BY" -> "/";
                case "MODULO" -> "%";
                default -> "";
            };
            write(" " + result + " ");
        }
        
        /*Methodo pou antikathista kai ektuponei me sumbola ta binaryLowop */
        @Override
        public void enterBinaryLowOp(TabloidParser.BinaryLowOpContext ctx) {
            String binaryOp = ctx.getText();
            String result = switch (binaryOp) {
                case "PLUS" -> "+";
                case "MINUS" -> "-";
                default -> "";
            };
            write(" " + result + " ");
        }
        
        /*Methodo pou antikathista kai ektuponei me sumbola ta Booleanleanhop */
        @Override
        public void enterBooleanOp(TabloidParser.BooleanOpContext ctx) {
            String booleanOp = ctx.getText();
            String result = switch (booleanOp) {
                case "AND" -> "and";
                case "OR" -> "or";
                default -> "";
            };
            write(" " + result + " ");
        }
        
        /*Methodo pou antikathista kai ektuponei me sumbola ta BooleanLiteral */
        @Override
        public void enterBooleanLiteral(TabloidParser.BooleanLiteralContext ctx) {
            String booleanLiteral = ctx.getText();
            String result = switch (booleanLiteral) {
                case "TOTALLY RIGHT" -> "True";
                case "COMPLETELY WRONG" -> "False";
                default -> "";
            };
            write(result);
        }
        
        /*Methodo pou antikathista kai ektuponei me sumbola ta Conditionalop */
        @Override
        public void enterConditionalOp(TabloidParser.ConditionalOpContext ctx) {
            String conditionalOp = ctx.getText();
            String result = switch (conditionalOp) {
                case "SMALLER THAN" -> "<";
                case "BEATS" -> ">";
                case "IS ACTUALLY" -> "==";
                case "IS SMALLER THAN" -> "<";
                default -> "";
            };
            write(" " + result + " ");
        }

        /* Methodo pou pairnoume to periexomeno toy identifier*/
        @Override
        public void enterIdentifier(TabloidParser.IdentifierContext ctx) {
            if (ctx.WORD() != null) {
                identifierr = ctx.WORD().getText();
            } else if (ctx.STRING_LITERAL() != null) {
                identifierr = ctx.STRING_LITERAL().getText();
            } else if (ctx.INT_LITERAL() != null) {
                identifierr = ctx.INT_LITERAL().getText();
            } else if (ctx.FLOAT_LITERAL() != null) {
                identifierr = ctx.FLOAT_LITERAL().getText();
            }
            write(identifierr);
        }

        /*An arxizei me sugkerkimeno ananoristiko ektuponontai sto arxeio me thn katallhlh domh python*/
        @Override
        public void enterExpressionStatement(TabloidParser.ExpressionStatementContext ctx) {
            if (ctx.getText().startsWith("YOU WON\'T WANT TO MISS")) {
                printWithTabs("print(");
            } else if (ctx.getText().startsWith("DISCOVER HOW TO")) {
                printWithTabs("def ");
            }
        }

        /*Kleinh parenthesh gia to print allios an  exei sunarthsh meionei to tabcounter kata 1 */
        @Override
        public void exitExpressionStatement(TabloidParser.ExpressionStatementContext ctx) {
            if (ctx.getText().startsWith("YOU WON\'T WANT TO MISS")) {
                write(")");
            } else if (ctx.getText().startsWith("DISCOVER HOW TO")) {
                setTabLevel(-1);
            }
        }

        /*Otan mpainei sto declaration allazei grammi kai kanei ektiponei tabs */
        @Override
        public void enterDeclaration(TabloidParser.DeclarationContext ctx) {
            printWithTabs("");
        }

        /*Otan bgainei apto discoverThing, an exei mpei idi ")" ektupvnei mono ":" */
        /*Alliws ektipwnei "):" mazi*/
        @Override
        public void exitDiscoverThing(TabloidParser.DiscoverThingContext ctx) {
            if (argumentFinish = true) {
                write(":");
                argumentFinish = false;
            } else {
                write("):");
            }
            setTabLevel(1);
        }
        
        /*An arxizei me sugkerkimeno ananoristiko ektuponontai sto arxeio me thn katallhlh domh python*/
        @Override
        public void enterControlFlowStatement(TabloidParser.ControlFlowStatementContext ctx) {
            if (ctx.getText().startsWith("WHAT IF")) {
                printWithTabs("if(");
            } else if (ctx.getText().startsWith("LIES!")) {
                setTabLevel(-1);
                printWithTabs("else:");
                setTabLevel(1);
            } else if (ctx.getText().startsWith("STAY TUNED WHILE")) {
                printWithTabs("while (");
            } else if (ctx.getText().startsWith("SHOCKING DEVELOPMENT")) {
                printWithTabs("return ");
            }
        }

        /*Kata tin exodo ton statements moionoyme to tab level */
        @Override
        public void exitControlFlowStatement(TabloidParser.ControlFlowStatementContext ctx) {
            if (ctx.getText().startsWith("WHAT IF")) {
                setTabLevel(-1);
            } else if (ctx.getText().startsWith("STAY TUNED WHILE")) {
                setTabLevel(-1);
            } else if (ctx.getText().startsWith("LIES!")) {
                setTabLevel(-1);
            }
        }

        /*Bgainontas apto condition ektyponoyme "):" */
        @Override
        public void exitConditionBlock(TabloidParser.ConditionBlockContext ctx) {
            write("):");
            setTabLevel(1);
        }

        /*Ektiponei to input tis python "input(" */
        @Override
        public void enterInputStatement(TabloidParser.InputStatementContext ctx) {
            if (ctx.getText().startsWith("LATEST NEWS ON")) {
                write("input(");
            }
        }

        /*Bgainontas apto input, ekyptonei ")" */
        @Override
        public void exitInputStatement(TabloidParser.InputStatementContext ctx) {
            if (ctx.getText().startsWith("LATEST NEWS ON")) {
                write(")");
            }
        }

        /*Ektyponei to = gia th dylwsi metablitis*/
        @Override
        public void enterDeclarationBody(TabloidParser.DeclarationBodyContext ctx) {
            write(" = ");

        }

        /*An einai me parenthesi, ekypwnei th parenthesi */
        @Override
        public void enterFactor(TabloidParser.FactorContext ctx) {
            if (ctx.getText().startsWith("(")) {
                write("(");
            }
        }

        /*An einai me parenthesi, ekypwnei th parenthesi bgainontas*/
        @Override
        public void exitFactor(TabloidParser.FactorContext ctx) {
            if (ctx.getText().startsWith("(")) {
                write(")");
            }
        }

        @Override
        public void enterArguments(TabloidParser.ArgumentsContext ctx) {
            argumentCount = ctx.argument().size(); // Pairnoume ton arithmo twn arguments
            argumentFinish = true; // Flag oti arxizoyn ta arguments
            write("("); // Ektiponei thn arxiki parenthesi "("
        }

        /*Ektiponei th parenthesi ")" kai midenizei to counter twn arguments*/
        @Override
        public void exitArguments(TabloidParser.ArgumentsContext ctx) {
            write(")");
            argumentCounter = 0;
        }

        @Override
        public void exitArgument(TabloidParser.ArgumentContext ctx) {
            if (argumentCounter < argumentCount - 1) { // An den teleiwsan ta arguments
                write(", "); // Kane print to ","
            }
            argumentCounter += 1; // Aujanoyme to counter
        }

        /*Methodos poy anagnorizei ta comments*/
        @Override
        public void enterCommentStatement(TabloidParser.CommentStatementContext ctx) {
            String commentText = ctx.COMMENT().getText();
            String commentContent = commentText.replace("UNCONFIRMED RUMOR:", "").trim(); // Ksexorizoyme to text apto anagnoristiko toy comment tabloid
            printWithTabs("# " + commentContent); // Ekypovnoyme to sxoleio me "#"
        }
    }
}