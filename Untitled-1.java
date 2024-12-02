                                                    


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserAuthenticationScreen {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("User Authentication");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Create the panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        // Add components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(loginButton);
        panel.add(cancelButton);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Create a label for feedback
        JLabel feedbackLabel = new JLabel("", JLabel.CENTER);
        frame.add(feedbackLabel, BorderLayout.SOUTH);

        // Action Listener for Login Button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Replace with actual authentication logic
                if (username.equals("admin") && password.equals("password")) {
                    feedbackLabel.setText("Login successful!");
                    feedbackLabel.setForeground(Color.GREEN);
                } else {
                    feedbackLabel.setText("Invalid username or password.");
                    feedbackLabel.setForeground(Color.RED);
                }
            }
        });

        // Action Listener for Cancel Button
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userField.setText("");
                passField.setText("");
                feedbackLabel.setText("");
            }
        });

        // Make frame visible
        frame.setVisible(true);
    }
}
OUTPUT:
 

                

	
              
               

