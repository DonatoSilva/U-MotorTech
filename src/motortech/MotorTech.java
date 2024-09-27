package motortech;

import igu.Login;
import java.awt.Color;

/**
 *
 * @author figue
 */
public class MotorTech {
    /**
     * @param args the command line arguments
     */
    
    private String status;
    
    public static void main(String[] args) {
        Login login = new Login();
        Views.openWindows(login);
    }
    
    public static void main() {}
    
    
    public void setStatusTable(String newValue) {
        status = newValue;
    }
    
    public String getStatusTable() {
        return status;
    }
    
    /// App colors
    public static Color getBgPrimary() {
        return new Color(0,153,153);
    }
    
    public static Color getBgPrimarySelect() {
        return new Color(25,173,163);
    }
    
    public static Color getBgGrey() {
        return new Color(204,204,204);
    }
    
    public static Color getbgRed() {
        return new Color(255,153,153);
    }
    
    public static Color getbgRedSelect() {
        return new Color(255,102,102);
    }
}
