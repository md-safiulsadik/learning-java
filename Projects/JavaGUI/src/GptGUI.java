import javax.swing.*;
import java.awt.*;

public class GptGUI extends JFrame {

    private final JTextField firstText;
    private final JButton addButton;
    private final JButton subButton;
    private final JButton resButton;
    private final JLabel resLabel;

    private int num1 = 0;
    private int num2 = 0;
    private boolean addMode = true; // true => addition, false => subtraction

    public GptGUI() {
        super("Simple Calculator");

        firstText = new JTextField(30);
        addButton = new JButton("+");
        subButton = new JButton("-");
        resButton = new JButton("Result");
        resLabel = new JLabel("0");

        setLayout(new FlowLayout());

        add(firstText);
        add(addButton);
        add(subButton);
        add(resButton);
        add(resLabel);

        // When user clicks +, capture first number and switch to add mode
        addButton.addActionListener(e -> {
            try {
                num1 = Integer.parseInt(firstText.getText().trim());
                firstText.setText("");
                addMode = true;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid integer for the first number", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        });

        // When user clicks -, capture first number and switch to subtract mode
        subButton.addActionListener(e -> {
            try {
                num1 = Integer.parseInt(firstText.getText().trim());
                firstText.setText("");
                addMode = false;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid integer for the first number", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        });

        // When user clicks Result, read second number and compute
        resButton.addActionListener(e -> {
            try {
                num2 = Integer.parseInt(firstText.getText().trim());
                int result = addMode ? (num1 + num2) : (num1 - num2);
                resLabel.setText(String.valueOf(result));
                firstText.setText("0");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter a valid integer for the second number", "Invalid input", JOptionPane.ERROR_MESSAGE);
            }
        });

        setSize(380, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
