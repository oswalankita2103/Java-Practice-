import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
    Label lbl1, lbl2, lblResult;
    TextField tf1, tf2, tfResult;
    Button btnAdd, btnSub, btnMul, btnDiv;

    public CalculatorAWT() {
        // Frame title & layout
        setTitle("Simple Calculator");
        setLayout(new FlowLayout());

        // Labels & TextFields
        lbl1 = new Label("First Number:");
        tf1 = new TextField(10);

        lbl2 = new Label("Second Number:");
        tf2 = new TextField(10);

        lblResult = new Label("Result:");
        tfResult = new TextField(10);
        tfResult.setEditable(false); // result field not editable

        // Buttons
        btnAdd = new Button("Add");
        btnSub = new Button("Subtract");
        btnMul = new Button("Multiply");
        btnDiv = new Button("Divide");

        // Add components to Frame
        add(lbl1); add(tf1);
        add(lbl2); add(tf2);
        add(lblResult); add(tfResult);

        add(btnAdd); add(btnSub); add(btnMul); add(btnDiv);

        // Register event listeners
        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        // Frame settings
        setSize(300, 200);
        setVisible(true);

        // Handle close
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(tf1.getText());
            double num2 = Double.parseDouble(tf2.getText());
            double result = 0;

            if (e.getSource() == btnAdd) {
                result = num1 + num2;
            } else if (e.getSource() == btnSub) {
                result = num1 - num2;
            } else if (e.getSource() == btnMul) {
                result = num1 * num2;
            } else if (e.getSource() == btnDiv) {
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    tfResult.setText("Error: Divide by 0");
                    return;
                }
            }

            tfResult.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
