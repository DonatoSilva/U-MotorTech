package motortech;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Inputs {

    public enum ValidationPatterns {
        CELL("\\d{10}"),
        NAME("^[A-Za-zÀ-ÿ'\\s-]{1,}$"),
        EMAIL("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"),
        ID_CARD("^\\d{5,}$"),
        PLACA("^[A-Z]{3}[0-9]{3}$|^[A-Z]{3}[0-9]{2}[A-Z]{1}$"),
        Password("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!Q?])(?=.*\\d)[a-zA-Z\\d!Q?]{8,}$");

        private final String pattern;

        ValidationPatterns(String pattern) {
            this.pattern = pattern;
        }

        public String getPattern() {
            return pattern;
        }
    }

    public static String inputValidate(JFrame view, JTextField input, String messaje, ValidationPatterns validationPatterns) {
        String text = input.getText().trim();

        if (text.isEmpty()) {
            return messaje + " no puede estar vacio.";
        }

        Pattern pattern = Pattern.compile(validationPatterns.getPattern());
        Matcher matcher = pattern.matcher(text);

        if (!matcher.matches()) {
            return messaje + " no es valido";
        }

        return "";
    }
    
    public static String inputValidate(JFrame view, JPasswordField input, String messaje, ValidationPatterns validationPatterns) {
        String text = String.valueOf(input.getPassword()).trim();

        if (text.isEmpty()) {
            return "El " + messaje + " no puede estar vacio.";
        }

        Pattern pattern = Pattern.compile(validationPatterns.getPattern());
        Matcher matcher = pattern.matcher(text);

        if (!matcher.matches() ) {
            return "El " + messaje + " no es valido";
        }

        return "";
    }
    
    public static String inputValidate(JFrame view, JTextField input, String messaje) {
        String text = input.getText().trim();

        if (text.isEmpty()) {
            return "El " + messaje + " no puede estar vacio.";
        }

        return "";
    }

    public static void inputTextFocus(JTextField input, String startString) {
        if (input.getText().equals(startString)) {
            input.setText("");
        }

        input.setForeground(Color.black);
    }

    public static void inputTextFocus(JTextField input, String startString, boolean a) {
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
        if (String.valueOf(input.getPassword()).equals(startString)) {
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
