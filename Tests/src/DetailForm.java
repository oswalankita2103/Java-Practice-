import java.awt.*;
import java.awt.event.*;

public class DetailForm extends Frame implements ActionListener {
    Label lblName, lblAge;
    TextField tfName, tfAge;
    TextArea taOutput;
    Button btnSubmit;

    public DetailForm() {
        // Set Frame title and layout
        setTitle("Detail Form");
        setLayout(new FlowLayout());

        // Labels and TextFields
        lblName = new Label("Name:");
        tfName = new TextField(20);

        lblAge = new Label("Age:");
        tfAge = new TextField(5);

        // Submit button
        btnSubmit = new Button("Submit");

        // TextArea to display details
        taOutput = new TextArea(5, 30);

        // Add components to Frame
        add(lblName);
        add(tfName);
        add(lblAge);
        add(tfAge);
        add(btnSubmit);
        add(taOutput);

        // Add ActionListener
        btnSubmit.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setVisible(true);

        // Close button handling
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    // Handle button click
    public void actionPerformed(ActionEvent e) {
        String name = tfName.getText();
        String age = tfAge.getText();
        taOutput.setText("Entered Details:\nName: " + name + "\nAge: " + age);
    }

    public static void main(String[] args) {
        new DetailForm();
    }
}
