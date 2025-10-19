import javax.swing.*;
import java.awt.*;

public class SimpleCalculator extends JFrame {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Calculator");

// <--------------- Panel section ----------------->
        JPanel displayPanel = new JPanel();
        JPanel aPanel = new JPanel();
        JPanel bPanel = new JPanel();
        JPanel upperPanel = new JPanel(new GridLayout(3,1));
        JPanel lowerPanel = new JPanel();
        JPanel mainPan = new JPanel(new GridLayout(3, 1));

// <--------------- Font section ----------------->
        Font font = new Font("JetBrains Mono", Font.BOLD, 20);
        Font labelFont =  new Font("Segoe UI", Font.PLAIN, 16);
        Font buttonFont =  new Font("Segoe UI", Font.BOLD, 18);

// <------------- TextField section ----------------->
        JTextField displayText = new JTextField("0", 30);
        displayText.setEditable(false);
        displayText.setHorizontalAlignment(JTextField.CENTER);
        displayText.setFont(font);

        JTextField aText = new JTextField(20);
        aText.setHorizontalAlignment(JTextField.CENTER);
        aText.setFont(font);

        JTextField bText = new JTextField(20);
        bText.setHorizontalAlignment(JTextField.CENTER);
        bText.setFont(font);

// <------------- Label section ----------------->
        JLabel displayLabel = new JLabel("DISPLAY: ");
        displayLabel.setFont(labelFont);
        JLabel aLabel = new JLabel("A: ");
        aLabel.setFont(labelFont);
        JLabel bLabel = new JLabel("B: ");
        bLabel.setFont(labelFont);

// -------<-------- Button section ----------------->
        JButton additionButton = new JButton(" + ");
        additionButton.setFont(buttonFont);
        JButton subtractionButton = new JButton(" - ");
        subtractionButton.setFont(buttonFont);
        JButton multiplicationButton = new JButton(" * ");
        multiplicationButton.setFont(buttonFont);
        JButton divideButton = new JButton(" / ");
        divideButton.setFont(buttonFont);
        JButton clearButton = new JButton(" C ");
        clearButton.setFont(buttonFont);

        displayPanel.add(displayLabel);
        displayPanel.add(displayText);
        aPanel.add(aLabel);
        aPanel.add(aText);
        bPanel.add(bLabel);
        bPanel.add(bText);

        upperPanel.add(displayPanel);
        upperPanel.add(aPanel);
        upperPanel.add(bPanel);

        lowerPanel.add(additionButton);
        lowerPanel.add(subtractionButton);
        lowerPanel.add(multiplicationButton);
        lowerPanel.add(divideButton);
        lowerPanel.add(clearButton);

        mainPan.add(upperPanel);
        mainPan.add(lowerPanel);

        additionButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(aText.getText().trim());
                double num2 = Double.parseDouble(bText.getText().trim());
                displayText.setText((num1 + num2) + "");
            } catch (NumberFormatException e1) {
                displayText.setText("Error");
            } catch (Exception e2) {
                displayText.setText("Something went wrong!");
            }
        });


        subtractionButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(aText.getText().trim());
                double num2 = Double.parseDouble(bText.getText().trim());
                displayText.setText((num1 - num2) + "");
            } catch (NumberFormatException e1) {
                displayText.setText("Error");
            } catch (Exception e2) {
                displayText.setText("Something went wrong!");
            }
        });


        multiplicationButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(aText.getText().trim());
                double num2 = Double.parseDouble(bText.getText().trim());
                displayText.setText((num1 * num2) + "");
            } catch (NumberFormatException e1) {
                displayText.setText("Error");
            } catch (Exception e2) {
                displayText.setText("Something went wrong!");
            }
        });


        divideButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(aText.getText().trim());
                double num2 = Double.parseDouble(bText.getText().trim());
                displayText.setText((num1 / num2) + "");
            } catch (ArithmeticException e0){
                displayText.setText("Error/ by 0");
            } catch (NumberFormatException e1) {
                displayText.setText("Error");
            } catch (Exception e2) {
                displayLabel.setText("Something went wrong!");
            }
        });


        clearButton.addActionListener(e -> {
            displayText.setText("0");
            aText.setText("");
            bText.setText("");
        });


        frame.add(mainPan);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
    }
}
