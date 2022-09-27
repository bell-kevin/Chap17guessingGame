/** ****************************************************************************
 * Chap17guessingGame.java
 * Kevin Bell
 *
 * This GUI program is a guessing game application.
 **************************************************************************** */
package chap17guessinggame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class Chap17guessingGame extends JFrame {

    private static final int WIDTH = 325;
    private static final int HEIGHT = 150;
    private JTextField textBox; // holds user's meal cost
    private JButton button = new JButton("Reset");
    private JLabel result;
    private int guess, count, number = getRandomNumber();
//******************************************************************************

    public Chap17guessingGame() {
        setTitle("Guessing Game");
        setSize(WIDTH, HEIGHT);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.yellow);
        createContents();
        setVisible(true);
    } // end constructor method
//******************************************************************************

    private void createContents() {  // Create components and add them to window
        JLabel prompt = new JLabel("Guess a number between 1 and 100");
        Listener listener = new Listener();
        textBox = new JTextField(10);
        result = new JLabel();
        add(prompt);
        add(textBox);
        add(result);
        add(button);
        textBox.addActionListener(listener);
        button.addActionListener(listener);
    } // end createContents method
//******************************************************************************

    public static int getRandomNumber() {
        Random rng = new Random();
        int answer = rng.nextInt((100 - 1) + 1) + 1;
        return answer;
    } //end getRN    
//******************************************************************************

    private class Listener implements ActionListener {//InnerClass eventHandling

        public void actionPerformed(ActionEvent e) {
            Container contentPane = getContentPane();
            if (e.getSource() == textBox) {
                count++;
                guess = Integer.parseInt(textBox.getText());
                if (guess > number) {
                    contentPane.setBackground(Color.CYAN);
                    result.setText("too high, previous guess was " + guess);
                    textBox.setText("");
                } else if (guess < number) {
                    contentPane.setBackground(Color.RED);
                    result.setText("too low, previous guess was " + guess);
                    textBox.setText("");
                } else if (guess == number) {
                    contentPane.setBackground(Color.GREEN);
                    result.setText("You guessed it! "+count+" tries");
                    
                    textBox.setText("");
                } // if/else if conditions
            } else {
                try {
                    if (e.getSource() == button) {
                        contentPane.setBackground(Color.YELLOW);
                        getRandomNumber();
                        textBox.setText("");
                    } // end if condition
                } catch (NumberFormatException nfe) {
                    guess = -1;
                } // end try/catch   
            } // end if/else condition
        } // end actionPerformed
    } // end Listener class
//******************************************************************************

    public static void main(String[] args) {
        new Chap17guessingGame();
    } // end main method
} // end Chap17guessingGame class
