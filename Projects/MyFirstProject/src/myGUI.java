import javax.swing.*;
import java.awt.*;

public class myGUI {

    public static void main(String[] args) {
        GUI gui = new GUI();
    }
}

class GUI extends JFrame /* implements ActionListener */ {

    JLabel label;
    JTextField textForFirstNum;
    JTextField textForSecondNum;
    JButton button;

    public GUI() {

        textForFirstNum = new JTextField(30);
        textForSecondNum = new JTextField(30);
        button = new JButton("Result");
        label = new JLabel("0");

        add(textForFirstNum);
        add(textForSecondNum);
        add(button);
        add(label);

//        ActionListener actionListener = new ActionListener() {      // This is using Anonymous class
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int num1 = Integer.parseInt(textForFirstNum.getText());
//                int num2 = Integer.parseInt(textForSecondNum.getText());
//                int result = num1 + num2;
//                label.setText(result + "");
//            }
//        };

//        button.addActionListener(this);           // This is using interface

//        button.addActionListener(new ActionListener() {         // Using Anonymous class in while using just one-time
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int num1 = Integer.parseInt(textForFirstNum.getText());
//                int num2 = Integer.parseInt(textForSecondNum.getText());
//                int result = num1 + num2;
//                label.setText(result + "");
//            }
//        });


        button.addActionListener((e -> {                    // Using Lambda expression
            int num1 = Integer.parseInt(textForFirstNum.getText());
            int num2 = Integer.parseInt(textForSecondNum.getText());
            int result = num1 + num2;
            label.setText(result + "");
        }));

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {          // Using Interface
//        int num1 = Integer.parseInt(textForFirstNum.getText());
//        int num2 = Integer.parseInt(textForSecondNum.getText());
//        int result = num1 + num2;
//        label.setText(result + "");
//    }
}












