package guiwithjava;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiWithJava {

    private JFrame frame;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel lblResult;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GuiWithJava window = new GuiWithJava();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public GuiWithJava() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        textField1 = new JTextField();
        textField1.setBounds(50, 30, 130, 26);
        frame.getContentPane().add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        textField2.setBounds(200, 30, 130, 26);
        frame.getContentPane().add(textField2);
        textField2.setColumns(10);

        JButton btnAdd = new JButton("+");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('+');
            }
        });
        btnAdd.setBounds(50, 70, 50, 29);
        frame.getContentPane().add(btnAdd);

        JButton btnSubtract = new JButton("-");
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('-');
            }
        });
        btnSubtract.setBounds(110, 70, 50, 29);
        frame.getContentPane().add(btnSubtract);

        JButton btnMultiply = new JButton("*");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('*');
            }
        });
        btnMultiply.setBounds(170, 70, 50, 29);
        frame.getContentPane().add(btnMultiply);

        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('/');
            }
        });
        btnDivide.setBounds(230, 70, 50, 29);
        frame.getContentPane().add(btnDivide);

        JButton btnMod = new JButton("mod");
        btnMod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate('m');
            }
        });
        btnMod.setBounds(290, 70, 50, 29);
        frame.getContentPane().add(btnMod);

        lblResult = new JLabel("Result: ");
        lblResult.setBounds(50, 110, 200, 26);
        frame.getContentPane().add(lblResult);
    }

    private void calculate(char operator) {
        try {
            double num1 = Double.parseDouble(textField1.getText());
            double num2 = Double.parseDouble(textField2.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case 'm':
                    result = num1 % num2;
                    break;
            }
            lblResult.setText("Result: " + result);
        } catch (NumberFormatException e) {
            lblResult.setText("Invalid input");
        }
    }
}