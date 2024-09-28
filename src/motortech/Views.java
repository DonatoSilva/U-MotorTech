package motortech;

import java.time.chrono.ThaiBuddhistEra;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Views {
    public static void openWindows(JFrame window){
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    
    public static void openWindows(JFrame newWindow, JFrame oldWindow){
        newWindow.setVisible(true);
        newWindow.setLocationRelativeTo(null);
        oldWindow.dispose();
    }
    
    public static void closeWindows() {
        System.exit(0);
    }
    
    public static void moveWindows(JFrame window, java.awt.event.MouseEvent evt, int xMouse, int yMouse) {
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        window.setLocation(x - xMouse, y - yMouse);
    }
    
    public static void minimizeWindows(JFrame window){
        window.setExtendedState(JFrame.ICONIFIED);
    }
    
    public static int showDialogDelete(JFrame window, String title, String message){
        int option = JOptionPane.showOptionDialog(
                window,
                message,
                title,
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                new String[]{"Eliminar", "Cancelar"},
                "Cancelar"
        );
        
        return option;
    }
}
