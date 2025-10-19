package Gpt;

import javax.swing.*;
import java.awt.*;

class GptGUI {

    public static void main(String[] args) {

//        ColorPanel colorPanel = new ColorPanel();
//        Container container = new Container();
//        AddingComponent addingComponent = new AddingComponent();
        new Counter();
    }

}

class ColorPanel extends JFrame {

    public ColorPanel() {

//      JFrame frame = new JFrame("Java GUI");
        JLabel label = new JLabel("A Label!");
        JButton button = new JButton("Click");

        JPanel panel = new JPanel();
        panel.setBackground(new Color(192, 250, 250));

        panel.add(label);
        panel.add(button);
        add(panel);

        setTitle("Java GUI");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Container extends JFrame {

    public Container() {

        JFrame frame = new JFrame("Java Swing Container");  // Most outer window
        JPanel panel = new JPanel(); // Inner container
        panel.setBackground(new Color(200, 250, 250));

        JButton button = new JButton("Click");

        panel.add(button);
//        panel.add();
        frame.add(panel);

//        JOptionPane.showMessageDialog(null, "This is a pop-up");

        frame.setSize(500, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class AddingComponent extends JFrame {

    public AddingComponent() {

        /*
            1 - The JFrame: The main top window
            2 - The JPanel: Inner component manager that group all the component
            3 - FlowLayout, BorderLayout (etc.): arrange component
            4 - Next comes Event Handling
         */

        JPanel panel = new JPanel();
        panel.setBackground(new Color(177, 255, 255));

        JLabel label = new JLabel("Username:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Login");

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        add(panel);


        setTitle("Adding Component");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


class Counter extends JFrame {

    public Counter() {

        TextField textField = new TextField();
        textField.setEditable(false);
        textField.setText("0");
        textField.setSize(10, 30);

        JButton countB = new JButton("Count");
        countB.setSize(20, 10);

        JButton resetB = new JButton("Reset");
        resetB.setSize(20, 10);

        JPanel panel = new JPanel(new GridLayout(3, 1));
//        JPanel panel1 = new JPanel();
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        panel.setBackground(new Color(177, 255, 255));

//        panel1.add(textField);
//        panel2.add(countB);
//        panel3.add(resetB);
//
//        add(panel1);
//        add(panel2);
//        add(panel3);

        panel.add(textField);
        panel.add(countB);
        panel.add(resetB);

        add(panel);


        countB.addActionListener(e -> {
            int num = Integer.parseInt(textField.getText());
            textField.setText((num + 1) + "");
        });

        resetB.addActionListener(e -> {
            textField.setText("0");
        });


//        setLayout(new GridLayout(3, 1));
        setTitle("Adding Component");
        setSize(200, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}