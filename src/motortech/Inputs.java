
package motortech;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Inputs {

    
    public static void inputTextFocus(JTextField input, String startString) {
        if (input.getText().equals(startString)){
            input.setText("");
        }
        
        input.setForeground(Color.black);
    }
    
    public static void inputTextFocus(JTextField input , String startString, boolean a) {
        if (input.getText().equals("")) {
            input.setText(startString);
            input.setForeground(MotorTech.getBgGrey());
        }
    }
    
    public static void dialogMessageDialog(JFrame window, JTextField input, String title, String message) {
        String[] option = {"¡ Listo !"};
        
        JOptionPane.showOptionDialog(window, message, title, 0, JOptionPane.WARNING_MESSAGE, null, option, 0);
        input.requestFocus();
    }
    
    public static void dialogMessageDialog(JFrame window, JPasswordField input, String title, String message) {
        String[] option = {"¡ Listo !"};
        
        JOptionPane.showOptionDialog(window, message, title, 0, JOptionPane.WARNING_MESSAGE, null, option, 0);
        input.requestFocus();
    }
    
    public static void inputPassFocus(JPasswordField input, String startString) {
        if (String.valueOf(input.getPassword()).equals(startString)){
            input.setText("");
        }
        
        input.setForeground(Color.black);
    }
    
    public static void inputPassFocus(JPasswordField input, String startString, boolean a) {
        if (String.valueOf(input.getPassword()).equals("")) {
            input.setText(startString);
            input.setForeground(MotorTech.getBgGrey());
        }
    }
}
