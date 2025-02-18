import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameMenuWindow extends JFrame {
    // Window properties
    private JTextField nameInput;
    private JComboBox<LevelOption> levelBox;
    private JComboBox<CardOption> cardBox;
    private JButton startButton, cancelButton, helpButton, aboutButton, exitButton;
    private JTextArea leaderboardTextArea;

    public GameMenuWindow() {
        // Set up window properties
        setTitle("Memory Game");
        setSize(600, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // UI components
        nameInput = new JTextField(20);
        levelBox = new JComboBox<>(LevelOption.values());
        cardBox = new JComboBox<>(CardOption.values());
        startButton = new JButton("Start");
        cancelButton = new JButton("Cancel");
        helpButton = new JButton("Help");
        aboutButton = new JButton("About");
        exitButton = new JButton("Exit");

        setLayout(new BorderLayout());

        // Main Panel to hold everything
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(1, 2));

        // Left panel with player input and buttons
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout());

        // Player name input panel
        JPanel nameInputPanel = new JPanel();
        nameInputPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        nameInputPanel.add(new JLabel("Player Name:"));
        nameInputPanel.add(nameInput);
        leftPanel.add(nameInputPanel);

        // Level selection panel
        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setLayout(new GridLayout(2, 1, 5, 5));
        comboBoxPanel.add(new JLabel("Select Level:"));
        comboBoxPanel.add(levelBox);

        // Card selection panel
        comboBoxPanel.add(new JLabel("Select Cards:"));
        comboBoxPanel.add(cardBox);
        leftPanel.add(comboBoxPanel);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 2, 5, 5));
        buttonPanel.add(cancelButton);
        buttonPanel.add(helpButton);
        buttonPanel.add(aboutButton);
        buttonPanel.add(exitButton);
        leftPanel.add(buttonPanel);

        JPanel startButtonPanel = new JPanel();
        startButtonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        startButtonPanel.add(startButton);
        leftPanel.add(startButtonPanel);

        mainPanel.add(leftPanel);

        // Right panel for the leaderboard
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BorderLayout());

        JLabel leaderboardTitle = new JLabel("Leaderboard", SwingConstants.CENTER);
        leaderboardTitle.setFont(new Font("Arial", Font.BOLD, 16));
        rightPanel.add(leaderboardTitle, BorderLayout.NORTH);

        // JTextArea to display leaderboard
        leaderboardTextArea = new JTextArea();
        leaderboardTextArea.setEditable(false);
        leaderboardTextArea.setFont(new Font("Arial", Font.PLAIN, 12));
        rightPanel.add(new JScrollPane(leaderboardTextArea), BorderLayout.CENTER);

        mainPanel.add(rightPanel);
        add(mainPanel, BorderLayout.CENTER);

        // Action listeners for buttons
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickStartButton();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickHelpButton();
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickAboutButton();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        loadLeaderboard(); // Load the leaderboard from txt file
    }

    private void loadLeaderboard() {
        List<PlayerScore> playerScores = new ArrayList<>();
        File file = new File("scores.txt");

        // If the file doesn't exist, display default message
        if (!file.exists() || file.length() == 0) {
            leaderboardTextArea.setText("No records available.");
            return;
        }

        // Read player scores from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(": ");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int score = Integer.parseInt(parts[1].replace(" points", "").trim());
                    playerScores.add(new PlayerScore(name, score));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the scores from high to low
        playerScores.sort((p1, p2) -> Integer.compare(p2.getScore(), p1.getScore()));

        // Update the leaderboard text area
        StringBuilder leaderboardText = new StringBuilder();
        int rank = 1;
        for (PlayerScore player : playerScores) {
            leaderboardText.append(rank).append(" ").append(player.getName()).append(" : ").append(player.getScore()).append(" points\n");
            rank++;
        }

        // If leaderboard is empty, show a default message
        if (!leaderboardText.isEmpty()) {
            leaderboardTextArea.setText(leaderboardText.toString());
        } else {
            leaderboardTextArea.setText("No records available.");
        }
    }

    private void clickStartButton() {
        // Store player's options
        String nameOfPlayer = nameInput.getText().trim();
        LevelOption levelOption = (LevelOption) levelBox.getSelectedItem();
        CardOption cardOption = (CardOption) cardBox.getSelectedItem();

        // Check if player name is entered
        if (nameOfPlayer.isEmpty()) {
            JOptionPane.showMessageDialog(GameMenuWindow.this, "Name can't be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Create a GameMenu to store the data
        GameMenu gameMenu = new GameMenu(nameOfPlayer, levelOption, cardOption);
        JOptionPane.showMessageDialog(GameMenuWindow.this, "Starting game for " + gameMenu.getNameOfPlayer() + " with level: " + gameMenu.getLevelOption() + " and card type: " + gameMenu.getCardOption());

        // Starts the game process
        new GameProcess(nameOfPlayer, levelOption, cardOption);
    }

    private void clickHelpButton() {
        JOptionPane.showMessageDialog(GameMenuWindow.this, "The memory game is pretty simple.\n1.Enter your name.\n2.Select your level\n3.Choose cards you like\n4.Press start!\n\nYou flip 2 cards in its round in order to find the matched ones.\nBased of the difficulty of the game, you have limited tries for mistakes.\nMore difficult, more cards, more tries and less difficult, less cards, less tries.\nBe careful and good luck!", "Help", JOptionPane.INFORMATION_MESSAGE);
    }

    private void clickAboutButton() {
        JOptionPane.showMessageDialog(GameMenuWindow.this, "Game Info\nMade in: Java Swing\nDeveloped by: Nikolaos Katsaros", "About", JOptionPane.INFORMATION_MESSAGE);
    }

    // Class to store player's score information
    private static class PlayerScore {
        private String name;
        private int score;

        public PlayerScore(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // Getters
        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }
}