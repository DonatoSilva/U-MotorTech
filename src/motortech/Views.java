package motortech;

import javax.swing.JFrame;

public class Views {
    public static void openWindows(JFrame window){
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
    public static void closeWindows() {
        System.exit(0);
    }
    
    public static void moveWindows(JFrame window, java.awt.event.MouseEvent evt, int xMouse, int yMouse) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        window.setLocation(x - xMouse, y - yMouse);
    }
}
