import javax.swing.*;
import java.awt.Color;

public class ButtonDemo{

    public JPanel createContentPane (){

        // We create a bottom JPanel to place everything on.
        JPanel totalGUI = new JPanel();
        totalGUI.setLayout(null);

        // Creation of a Panel to contain the title labels
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(null);
        titlePanel.setLocation(10, 0);
        titlePanel.setSize(250, 30);
        totalGUI.add(titlePanel);

        JLabel redLabel = new JLabel("Red Team");
        redLabel.setLocation(0, 0);
        redLabel.setSize(100, 30);
        redLabel.setHorizontalAlignment(0);
        redLabel.setForeground(Color.red);
        titlePanel.add(redLabel);

        JLabel blueLabel = new JLabel("Blue Team");
        blueLabel.setLocation(120, 0);
        blueLabel.setSize(100, 30);
        blueLabel.setHorizontalAlignment(0);
        blueLabel.setForeground(Color.blue);
        titlePanel.add(blueLabel);

        // Creation of a Panel to contain the score labels.
        JPanel scorePanel = new JPanel();
        scorePanel.setLayout(null);
        scorePanel.setLocation(10, 40);
        scorePanel.setSize(250, 30);
        totalGUI.add(scorePanel);

        JLabel redScore = new JLabel("0");
        redScore.setLocation(0, 0);
        redScore.setSize(100, 30);
        redScore.setHorizontalAlignment(0);
        scorePanel.add(redScore);

        JLabel blueScore = new JLabel("0");
        blueScore.setLocation(120, 0);
        blueScore.setSize(100, 30);
        blueScore.setHorizontalAlignment(0);
        scorePanel.add(blueScore);

        // Creation of a label to contain all the JButtons.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(null);
        buttonPanel.setLocation(10, 80);
        buttonPanel.setSize(250, 70);
        totalGUI.add(buttonPanel);

        // We create a button and manipulate it using the syntax we have
        // used before.
        JButton redButton = new JButton("Red Score!");
        redButton.setLocation(0, 0);
        redButton.setSize(100, 30);
        buttonPanel.add(redButton);

        JButton blueButton = new JButton("Blue Score!");
        blueButton.setLocation(120, 0);
        blueButton.setSize(100, 30);
        buttonPanel.add(blueButton);

        JButton resetButton = new JButton("Reset Score");
        resetButton.setLocation(0, 40);
        resetButton.setSize(220, 30);
        buttonPanel.add(resetButton); 
        
        totalGUI.setOpaque(true);
        return totalGUI;
    }

    private static void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JButton Scores! [=]");

        //Create and set up the content pane.
       // ButtonExample demo = new ButtonExample();
     frame.setContentPane(frame.getContentPane());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 190);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    } 
}

