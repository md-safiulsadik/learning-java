import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyledCalculator extends JFrame implements ActionListener {
    private JTextField fieldA, fieldB, resultField;
    private JButton addButton, subButton, mulButton, divButton, clearButton;

    public StyledCalculator() {
        super("Styled Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(360, 280);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(Color.white);

        // Input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 8, 8));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 5, 20));
        inputPanel.setOpaque(false);

        Font labelFont = new Font("Segoe UI", Font.PLAIN, 16);
        JLabel la = new JLabel("Number A:");
        JLabel lb = new JLabel("Number B:");
        JLabel lr = new JLabel("Result:");

        la.setFont(labelFont);
        lb.setFont(labelFont);
        lr.setFont(labelFont);

        fieldA = new JTextField();
        fieldB = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        fieldA.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        fieldB.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        resultField.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        inputPanel.add(la);
        inputPanel.add(fieldA);
        inputPanel.add(lb);
        inputPanel.add(fieldB);
        inputPanel.add(lr);
        inputPanel.add(resultField);

        add(inputPanel, BorderLayout.CENTER);

        // Buttons panel
        JPanel btnPanel = new JPanel(new GridLayout(1, 5, 8, 8));
        btnPanel.setBorder(BorderFactory.createEmptyBorder(5, 20, 15, 20));
        btnPanel.setOpaque(false);

        addButton = makeStyledButton("+", new Color(76, 175, 80));
        subButton = makeStyledButton("-", new Color(244, 67, 54));
        mulButton = makeStyledButton("×", new Color(33, 150, 243));
        divButton = makeStyledButton("÷", new Color(255, 152, 0));
        clearButton = makeStyledButton("C", new Color(158, 158, 158));

        btnPanel.add(addButton);
        btnPanel.add(subButton);
        btnPanel.add(mulButton);
        btnPanel.add(divButton);
        btnPanel.add(clearButton);

        add(btnPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JButton makeStyledButton(String text, Color color) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("Segoe UI", Font.BOLD, 18));
        btn.setForeground(Color.white);
        btn.setBackground(color);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Rounded corners
        btn.setBorder(BorderFactory.createLineBorder(Color.white, 2, true));

        // Hover effect
        btn.addMouseListener(new MouseAdapter() {
            Color orig = btn.getBackground();
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(orig.darker());
            }
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(orig);
            }
        });

        btn.addActionListener(this);
        return btn;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == clearButton) {
                fieldA.setText("");
                fieldB.setText("");
                resultField.setText("");
                return;
            }

            double a = Double.parseDouble(fieldA.getText());
            double b = Double.parseDouble(fieldB.getText());
            double res = 0;

            if (e.getSource() == addButton) {
                res = a + b;
            } else if (e.getSource() == subButton) {
                res = a - b;
            } else if (e.getSource() == mulButton) {
                res = a * b;
            } else if (e.getSource() == divButton) {
                if (b == 0)
                    throw new ArithmeticException("Division by zero");
                res = a / b;
            }

            resultField.setText(String.format("%.4f", res));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter numeric values.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Math Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
