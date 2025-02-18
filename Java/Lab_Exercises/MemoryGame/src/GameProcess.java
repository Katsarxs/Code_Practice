import javax.swing.*;
import java.awt.*;

public class GameProcess extends JFrame {
    protected String nameOfPlayer;

    public GameProcess(String nameOfPlayer, LevelOption levelOption, CardOption cardOption) {
        this.nameOfPlayer = nameOfPlayer;
        int gridSize = 0;

        gridSize = switch (levelOption) { // Grid size based on the selected level option
            case EASY -> 4;
            case MEDIUM -> 8;
            case HARD -> 10;
        };

        GameBoard gameBoard = switch (gridSize) { // Game board based on the grid size
            case 4 -> new GameBoard4x4(cardOption, nameOfPlayer);
            case 8 -> new GameBoard8x8(cardOption, nameOfPlayer);
            case 10 -> new GameBoard10x10(cardOption, nameOfPlayer);
            default -> null;
        };

        // JFrame windows properties
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(gameBoard, BorderLayout.CENTER);

        setSize(800, 800); // Initial window size
        setVisible(true);
    }
}