import javax.swing.*;
import java.awt.*;

public class Authenticator {
    public static void main(String[] args) {
        UIManager.put("TextField.font", new Font("Dialog", Font.ITALIC, 14));
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if (username != null &&
                password != null &&
                (
                        (username.equals("greebt01") &&
                                password.equals("swordfish")) ||
                                (username.equals("bburd") &&
                                        password.equals("preakston"))
                )
        ) {
            JOptionPane.showMessageDialog(null, "You're in.");

        } else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }
    }
}
