import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculator {

    public static void main(String[] args) {
        AdditionSubtraction additionSubtraction = new AdditionSubtraction();
//        GptGUI gui = new GptGUI();
    }
}

class AdditionSubtraction extends JFrame {

    JTextField firstText;
    JTextField secondText;
    JButton addButton;
    JButton subButton;
    JButton resButton;
    JLabel resLabel;

    public AdditionSubtraction() {

        firstText = new JTextField(30);
        secondText = new JTextField(30);
        addButton = new JButton("+");
        subButton = new JButton("-");
        resButton = new JButton("Result");
        resLabel = new JLabel("0");

        add(firstText);
//        add(secondText);
        add(addButton);
        add(subButton);
        add(resButton);
        add(resLabel);

//        addButton.addActionListener(e -> {
//            resButton.addActionListener(e1 -> {
//                int result = Integer.parseInt(firstText.getText()) + Integer.parseInt(secondText.getText());
//                resLabel.setText(result + "");
//            });
//        });
//
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    int result = Integer.parseInt(firstText.getText().trim()) + Integer.parseInt(secondText.getText().trim());
                    resLabel.setText(result + "");
            }
        });
//
//        subButton.addActionListener(e -> {
//            resButton.addActionListener(e1 -> {
//                int result = Integer.parseInt(firstText.getText()) - Integer.parseInt(secondText.getText());
//                resLabel.setText(result + "");
//            });
//        });


//
//        int num1 = 0;
//        int num2 = 0;
//
//        if (addButton.isSelected()) {
//
//            addButton.addActionListener(e -> {
//                num1 = Integer.parseInt(firstText.getText());
//                firstText.setText("");
//            });
//            resButton.addActionListener(e -> {
//                boolean isInt = false;
//
//                while (!isInt) {
//                    try {
//                        num2 = Integer.parseInt(firstText.getText());
//                        isInt = true;
//                    } catch (Exception exception) {
//                        System.out.println(exception.getMessage());
//                    }
//                }
//                int result = num1 + num2;
//                firstText.setText(result + "");
//            });
//        }


        setSize(380, 600);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


