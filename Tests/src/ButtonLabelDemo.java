import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonLabelDemo extends JFrame implements ActionListener {
    JLabel label;
    JButton btn1, btn2, btn3;

    public ButtonLabelDemo() {
        // Frame title
        super("Button Label Demo");

        // Layout
        setLayout(new FlowLayout());

        // Label
        label = new JLabel("Click a button");
        add(label);

        // Buttons
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");

        add(btn1);
        add(btn2);
        add(btn3);

        // Register ActionListener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        JButton clickedBtn = (JButton) e.getSource();
        label.setText("You clicked: " + clickedBtn.getText());
    }

    // Main method
    public static void main(String[] args) {
        new ButtonLabelDemo();
    }
}
