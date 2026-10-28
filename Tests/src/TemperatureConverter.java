import java.awt.*;
import java.awt.event.*;

public class TemperatureConverter extends Frame implements ActionListener {
    Label lblInput, lblResult;
    TextField tfInput, tfResult;
    Button btnToFahrenheit, btnToCelsius;

    public TemperatureConverter() {
        // Frame title & layout
        setTitle("Temperature Converter");
        setLayout(new FlowLayout());

        // Input Label & TextField
        lblInput = new Label("Enter Temperature:");
        tfInput = new TextField(10);

        // Result Label & TextField
        lblResult = new Label("Result:");
        tfResult = new TextField(15);
        tfResult.setEditable(false);

        // Buttons
        btnToFahrenheit = new Button("C → F");
        btnToCelsius = new Button("F → C");

        // Add components
        add(lblInput);
        add(tfInput);
        add(lblResult);
        add(tfResult);
        add(btnToFahrenheit);
        add(btnToCelsius);

        // Add listeners
        btnToFahrenheit.addActionListener(this);
        btnToCelsius.addActionListener(this);

        // Frame settings
        setSize(300, 150);
        setVisible(true);

        // Close handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double temp = Double.parseDouble(tfInput.getText());
            double result = 0;

            if (e.getSource() == btnToFahrenheit) {
                // Celsius → Fahrenheit
                result = (temp * 9 / 5) + 32;
                tfResult.setText(temp + " °C = " + result + " °F");
            } else if (e.getSource() == btnToCelsius) {
                // Fahrenheit → Celsius
                result = (temp - 32) * 5 / 9;
                tfResult.setText(temp + " °F = " + result + " °C");
            }
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}
