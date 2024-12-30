





////////////////////Open Ended//////////////////////////








import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionFrame {

    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("Integer Division");

        // Create labels, text fields, and button
        Label labelNum1 = new Label("Num1:");
        TextField textFieldNum1 = new TextField(10);
        Label labelNum2 = new Label("Num2:");
        TextField textFieldNum2 = new TextField(10);
        Button divideButton = new Button("Divide");
        Label labelResult = new Label("Result:");
        TextField textFieldResult = new TextField(10);
        textFieldResult.setEditable(false);

        // Set layout for the frame
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(labelNum1);
        frame.add(textFieldNum1);
        frame.add(labelNum2);
        frame.add(textFieldNum2);
        frame.add(divideButton);
        frame.add(labelResult);
        frame.add(textFieldResult);

        // Add event listener for the divide button
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Get the values from text fields
                    String num1Str = textFieldNum1.getText();
                    String num2Str = textFieldNum2.getText();

                    // Parse the input values to integers
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    // Check if the divisor is zero
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }

                    // Perform the division and display the result
                    int result = num1 / num2;
                    textFieldResult.setText(String.valueOf(result));

                } catch (NumberFormatException ex) {
                    // Handle invalid input (non-integer)
                    showErrorMessage(frame, "Please enter valid integers.");
                } catch (ArithmeticException ex) {
                    // Handle division by zero
                    showErrorMessage(frame, ex.getMessage());
                }
            }
        });

        // Set frame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Close the frame when the user clicks the close button
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Show error message in a dialog box
    private static void showErrorMessage(Frame frame, String message) {
        Dialog dialog = new Dialog(frame, "Error", true);
        dialog.setLayout(new FlowLayout());
        dialog.add(new Label(message));
        Button okButton = new Button("OK");
        dialog.add(okButton);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.setVisible(false);
            }
        });
        dialog.setSize(250, 100);
        dialog.setVisible(true);
    }
}
