import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class GameBoard extends JPanel {
    // Variables for the game board play
    protected int gridSize;
    protected JButton[][] buttons;
    protected CardOption cardOption;
    private JButton firstFlippedButton = null;
    private JButton secondFlippedButton = null;
    private String firstFlippedValue = null;
    private String secondFlippedValue = null;
    private String jokerCardValue = null;
    private int flippedCount = 0;
    private int mistakesCount = 0;
    protected int mistakesCountMax;
    protected int correctCount = 0;
    protected String nameOfPlayer;
    private int remainingAttempts;
    private int hiddenCards;
    private JLabel attemptsLabel;
    private JLabel hiddenCardsLabel;

    // Constructor to initialize the base game board
    public GameBoard(int gridSize, CardOption cardOption, String nameOfPlayer) {
        this.gridSize = gridSize;
        this.cardOption = cardOption;
        this.nameOfPlayer = nameOfPlayer;
        this.remainingAttempts = mistakesCountMax;
        this.hiddenCards = gridSize * gridSize;
        buttons = new JButton[gridSize][gridSize];

        setLayout(new BorderLayout());

        // Create a panel for the top area (remaining attempts and hidden cards)
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridLayout(1, 2));

        // Label for remaining attempts
        attemptsLabel = new JLabel("Remaining Attempts: " + remainingAttempts);
        topPanel.add(attemptsLabel);

        // Label for hidden cards
        hiddenCardsLabel = new JLabel("Hidden Cards: " + hiddenCards);
        topPanel.add(hiddenCardsLabel);

        // Add the top panel at the top of the GameBoard
        add(topPanel, BorderLayout.NORTH);

        // Create the main grid for buttons and add it to the center
        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(gridSize, gridSize));
        add(gridPanel, BorderLayout.CENTER);

        // Initialize the buttons inside the gridPanel
        initializeBoard(gridPanel);
    }

    // Abstract method to initialize the board from subclasses
    protected abstract void initializeBoard(JPanel gridPanel);

    // Method to generate a deck of cards based on the selected card option
    String[] generateCardDeck(CardOption cardOption) {
        String[] deck = switch (cardOption) {
            case ANIMALS -> CardOptions.ANIMALS;
            case LETTERS -> CardOptions.LETTERS;
            case NUMBERS -> CardOptions.NUMBERS;
        };

        // Create a list of cards, including duplicates for matching pairs
        ArrayList<String> cardList = new ArrayList<>();
        for (int i = 0; i < gridSize * gridSize / 2; i++) {
            cardList.add(deck[i % deck.length]);
            cardList.add(deck[i % deck.length]);
        }

        // Joker card in random position
        int jokerIndex = (int) (Math.random() * cardList.size());
        String jokerCard = cardList.get(jokerIndex) + " Joker"; // Mark one of the cards as a "Joker"
        cardList.set(jokerIndex, jokerCard);  // Replace it with the Joker card

        return cardList.toArray(new String[0]);
    }

    // Method to shuffle the deck of cards
    void shuffleDeck(String[] deck) {
        ArrayList<String> cardList = new ArrayList<>();
        Collections.addAll(cardList, deck);
        Collections.shuffle(cardList);

        // Update the deck with shuffled cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = cardList.get(i);
        }
    }

    // Method to handle card button clicks
    protected void handleButtonClick(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();

        // Ignore if the button is already revealed or disabled
        if (!clickedButton.getText().isEmpty() || !clickedButton.isEnabled()) {
            return;
        }

        String cardValue = (String) clickedButton.getClientProperty("cardValue");

        // If the clicked card is a Joker, reveal both Joker and its default value
        if (cardValue.contains("Joker")) {
            // HTML string for displaying "Joker" on top, default value below
            String labelText = "<html><div style='text-align: center;'>Joker<br>" + cardValue.replace(" Joker", "").trim() + "</div></html>";

            // Create a JLabel to handle the text
            JLabel label = new JLabel(labelText, SwingConstants.CENTER);
            label.setFont(new Font("Arial", Font.BOLD, 18)); // Font size for the label

            clickedButton.setLayout(new BorderLayout()); // Set layout for button to BorderLayout
            clickedButton.add(label, BorderLayout.CENTER); // Add JLabel to center of button
            clickedButton.setEnabled(false); // Disable the Joker card

            // Get the default card value of joker card
            jokerCardValue = cardValue.replace(" Joker", "").trim();

            // Reveal the matching card for the joker card
            revealMatchingCard(jokerCardValue);

            flippedCount++;
            correctCount++;
            return;
        }

        // Normal card flipping logic
        clickedButton.setText(cardValue);
        clickedButton.setEnabled(false);

        if (firstFlippedButton == null) {
            firstFlippedButton = clickedButton;
            firstFlippedValue = cardValue;
            return;
        }

        // Compare the two flipped cards
        secondFlippedButton = clickedButton;
        secondFlippedValue = cardValue;

        // If the cards match, reset and update game state
        if (firstFlippedValue.equals(secondFlippedValue)) {
            flippedCount++;
            resetFlippedCards();
            correctCount++;
            hiddenCards -= 2;
        } else { // If the cards don't match, reset them and show a warning
            JOptionPane.showMessageDialog(this, "The cards don't match! Try again.", "No Match", JOptionPane.WARNING_MESSAGE);

            SwingUtilities.invokeLater(() -> {
                firstFlippedButton.setText("");
                secondFlippedButton.setText("");
                firstFlippedButton.setEnabled(true);
                secondFlippedButton.setEnabled(true);
                resetFlippedCards();
            });
            mistakesCount++;
            remainingAttempts--;
        }

        // If the game is won, show a message and end the game
        if (flippedCount == (gridSize * gridSize) / 2) {
            JOptionPane.showMessageDialog(this, "Congratulations! You've won the game!", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            storeScore();
            System.exit(0);
        }

        // If the player runs out of attempts, show a message and end the game
        if (mistakesCount > mistakesCountMax) {
            JOptionPane.showMessageDialog(this, "You lost. ", "Game Over", JOptionPane.INFORMATION_MESSAGE);
            storeScore();
            System.exit(0);
        }
    }

    // Method to reveal the matching card for the Joker card
    private void revealMatchingCard(String defaultCardValue) {
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                JButton button = buttons[i][j];
                String cardValue = (String) button.getClientProperty("cardValue");

                // If the card has the same default value as the joker, reveal it
                if (cardValue.equals(defaultCardValue) && !button.getText().contains("Joker")) {
                    button.setText(cardValue); // Reveal the matching card's value
                    button.setEnabled(false); // Disable it
                    return;
                }
            }
        }
    }

    // Reset the flipped cards
    private void resetFlippedCards() {
        firstFlippedButton = null;
        secondFlippedButton = null;
        firstFlippedValue = null;
        secondFlippedValue = null;
    }

    // Store the player's score in a file
    private void storeScore() {
        if (nameOfPlayer != null && !nameOfPlayer.trim().isEmpty()) {
            File file = new File("scores.txt");
            List<String> scores = new ArrayList<>();
            boolean playerFound = false;

            // Read the existing scores from the file
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(": ");
                    if (parts.length == 2) {
                        String name = parts[0].trim();
                        int score = Integer.parseInt(parts[1].replace(" points", "").trim());

                        // If the player already exists, update their score
                        if (name.equals(nameOfPlayer)) {
                            scores.add(nameOfPlayer + ": " + correctCount + " points");
                            playerFound = true;
                        } else {
                            scores.add(line); // Keep the existing record
                        }
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error reading the scores file.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // If the player was not found, add them to the list
            if (!playerFound) {
                scores.add(nameOfPlayer + ": " + correctCount + " points");
            }

            // Write the updated leaderboard back to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (String scoreLine : scores) {
                    writer.write(scoreLine); // Write each score line to the file
                    writer.newLine(); // Add a new line after each entry
                }
                JOptionPane.showMessageDialog(this, "Your score has been saved!", "Score Saved", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error saving the score.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Player name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}