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
    public static void main(String[] args) {
        Login login = new Login();
        Views.openWindows(login);
    }
    
    /// Input Interaction
    public static void inputSelect() {
        
    }
    
    
    /// App colors
    public static Color getBgPrimary() {
        return new Color(0,153,153);
    }
    
    public static Color getBgPrimarySelect() {
        return new Color(10,173,163);
    }
    
    public static Color getBgGrey() {
        return new Color(204,204,204);
    }
}
