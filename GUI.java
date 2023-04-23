import javax.swing*.;

public class GUI {
    public static void main(String[] args) {
		//Its need to create a new instance of JFrame with the title "Report Post" and define an action to be executed when the window is closed.
        JFrame frame = new JFrame("Report Post");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Its need to create a new JPanel panel and add it to the window.
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

      // Its need to creat a new JTextField text field that is 20 characters wide and add it to the panel.
        JTextField textField = new JTextField(20);
        panel.add(textField);

      // Its need to creat a new JButton with the text "Submit" and add it to the panel.
        JButton button = new JButton("Send");
        panel.add(button);

      // its need to create a new text area JTextArea with 10 rows and 20 columns and add it to the panel.
        JTextArea textArea = new JTextArea(10, 20);
        panel.add(textArea);

     // It was need to add an action listener to the button that runs when the button is pressed. Inside the listener,
     // we get the text from the text field and call a method on the client to send the message to the server.
     // We then display the server's response in the text area.
        button.addActionListener(e -> {
            String message = textField.getText();
           // Call the client's method to send the message to the server.
            textArea.append("Answer to the server:\n");


            // Show the server answer in the JTextArea
        });

           // Finally, we set the size of the window based on the size of its content and make it visible.
        frame.pack();
        frame.setVisible(true);
    }
}


