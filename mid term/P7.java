import javax.swing.*;
import java.awt.event.*;

public class P7 extends JFrame implements ActionListener {
    private JTextField numField1, numField2, resultField;
    private JButton addButton, subButton;

    public P7() {
        setTitle("Simple Calculator");
        setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(30, 30, 80, 25);
        add(label1);

        numField1 = new JTextField();
        numField1.setBounds(120, 30, 120, 25);
        add(numField1);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(30, 70, 80, 25);
        add(label2);

        numField2 = new JTextField();
        numField2.setBounds(120, 70, 120, 25);
        add(numField2);

        addButton = new JButton("Add");
        addButton.setBounds(30, 110, 80, 25);
        add(addButton);
        addButton.addActionListener(this);

        subButton = new JButton("Subtract");
        subButton.setBounds(120, 110, 100, 25);
        add(subButton);
        subButton.addActionListener(this);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(30, 150, 80, 25);
        add(resultLabel);

        resultField = new JTextField();
        resultField.setBounds(120, 150, 120, 25);
        resultField.setEditable(false);
        add(resultField);

        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            addNumbers();
        } else if (e.getSource() == subButton) {
            subtractNumbers();
        }
    }

    private void addNumbers() {
        try {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int result = num1 + num2;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    private void subtractNumbers() {
        try {
            int num1 = Integer.parseInt(numField1.getText());
            int num2 = Integer.parseInt(numField2.getText());
            int result = num1 - num2;
            resultField.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new P7();
    }
}

