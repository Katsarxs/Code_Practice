import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameMenuWindow gameMenuWindow = new GameMenuWindow(); // Create the game menu window
            gameMenuWindow.setVisible(true); // Show the game menu window
        });
    }
}