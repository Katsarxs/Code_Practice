// Fun program which stimulates a background task progression
// using Java Swing.
import javax.swing.*;
import java.awt.*;

public class UIThread {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("Task Progression");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create the label that will display the task status
        JLabel label = new JLabel("Task Progression = Starting", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 16));

        // Create the button to start the task
        JButton startButton = new JButton("Start Task");

        // Create the panel with the label and the button
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);
        panel.add(startButton, BorderLayout.SOUTH);

        // Add the panel to the window
        frame.add(panel);
        frame.setVisible(true);

        // Action listener for the button to start the task
        startButton.addActionListener(_ -> {
            startButton.setEnabled(false);

            // Start the task in a new thread
            new Thread(new TaskProgression(label, startButton)).start();
        });
    }
}

class TaskProgression implements Runnable {
    private final JLabel label;
    private final JButton button;
    public TaskProgression(JLabel label, JButton button) {
        this.label = label;
        this.button = button;
    }
    @Override
    public void run() {
        // Update the label to indicate the task is starting
        label.setText("Task Progression = Executing");

        // Thread in loop
        for (int i = 0; i < 3; i++) {
            try {
                // Sleep for 1s
                Thread.sleep(1000);

                System.out.println("Task iteration " + (i + 1));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Changes the state of the task
        label.setText("Task Progression = Finished");

        // Resetting the button
        button.setEnabled(true);
    }
}