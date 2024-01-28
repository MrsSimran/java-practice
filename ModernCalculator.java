import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModernCalculator {

    private JFrame frame;
    private JTextField display;

    public ModernCalculator() {
        frame = new JFrame("Modern Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLayout(new BorderLayout());

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 20));
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            button.setBackground(Color.LIGHT_GRAY);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();
            
            if (buttonText.equals("=")) {
                // Evaluate the expression
                try {
                    String result = evaluateExpression(display.getText());
                    display.setText(result);
                } catch (ArithmeticException ex) {
                    display.setText("Error");
                }
            } else {
                // Append the button text to the display
                display.setText(display.getText() + buttonText);
            }
        }

        private String evaluateExpression(String expression) {
            try {
                // Use the JavaScript engine for simple expression evaluation
                ScriptEngineManager manager = new ScriptEngineManager();
                ScriptEngine engine = manager.getEngineByName("JavaScript");
                Object result = engine.eval(expression);
                return result.toString();
            } catch (ScriptException ex) {
                throw new ArithmeticException("Invalid expression");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ModernCalculator());
    }
}
