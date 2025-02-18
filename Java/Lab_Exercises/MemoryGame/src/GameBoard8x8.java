import javax.swing.*;
import java.awt.*;

class GameBoard8x8 extends GameBoard {
    public GameBoard8x8(CardOption cardOption, String nameOfPlayer) {
        super(8, cardOption, nameOfPlayer); // Call the parent constructor with a 8x8 grid size
        mistakesCountMax = 16;
    }

    // Override the abstract method to make the board and create the grid of buttons
    @Override
    protected void initializeBoard(JPanel gridPanel) {
        // Board initialization with proper requirements
        String[] cardDeck = generateCardDeck(cardOption);
        shuffleDeck(cardDeck);
        int cardIndex = 0;

        gridPanel.removeAll();

        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].setText("");  // Empty initially
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 18));  // Font size for button text
                buttons[i][j].setPreferredSize(new Dimension(70, 70));  // Set button size
                buttons[i][j].addActionListener(this::handleButtonClick);

                buttons[i][j].putClientProperty("cardValue", cardDeck[cardIndex]);
                cardIndex++;
                gridPanel.add(buttons[i][j]);
            }
        }
        gridPanel.revalidate();
        gridPanel.repaint();
    }
}